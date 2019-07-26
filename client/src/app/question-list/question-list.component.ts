
import { Question } from './../model/question-response';
import { QuestionService } from './../service/question-service.service';
import { Component, OnInit, ɵCompiler_compileModuleSync__POST_R3__ } from '@angular/core';
import { QuestionResponse } from '../model/question-response';
import { QuestionRequest } from '../model/question-request';

@Component({
  selector: 'app-question-list',
  templateUrl: './question-list.component.html',
  styleUrls: ['./question-list.component.css']
})
export class QuestionListComponent implements OnInit {

  uri = '';
  sortOptions = ['activity', 'votes', 'creation', 'hot', 'week', 'month'];
  orderOptions = ['desc', 'asc'];
  url = 'https://api.stackexchange.com/2.2/questions?';
  model = new QuestionRequest('desc', 'activity');
  questions: Question[];

  constructor(private questionService: QuestionService) {}

  createUri() {
    this.uri = '';
    this.customJoin(this.model);
    console.log(this.model.fromDate);
  }

  ngOnInit() {
    this.customJoin(this.model);
  }

  onSubmit() {
    this.questionService.findAll(this.uri).subscribe(
      data => { this.questions = data.result.items; }
    );
  }

  customJoin(questionRequest) {

    if (questionRequest.order) {
      this.uri += 'order=' + questionRequest.order + '&';
    }

    if (questionRequest.sort) {
      this.uri += 'sort=' + questionRequest.sort + '&';
    }

    if (questionRequest.toDate) {
      const timestamp = this.getTimestamp(questionRequest.toDate);
      if (timestamp != -1) {
        this.uri += 'toDate=' + this.getTimestamp(questionRequest.toDate) + '&';
      }
    }

    if (questionRequest.fromDate) {
      const timestamp = this.getTimestamp(questionRequest.fromDate);
      if (timestamp != -1) {
        this.uri += 'fromDate=' + this.getTimestamp(questionRequest.fromDate) + '&';
      }
    }

    if (questionRequest.tagged) {
      this.uri += 'tagged=' + questionRequest.tagged + '&';
    }

    this.uri = this.uri.substring(0, this.uri.length - 1);
  }

  getTimestamp(date: any) {
    if (date.year != undefined) {
      const dateObject = new Date((date.year).toString() + '-' + (date.month).toString() + '-' + (date.day).toString());
      return (Math.floor(dateObject.getTime() / 1000)).toString();
    }
    const dateObject = new Date(date);
    const timestamp = Math.floor(dateObject.getTime() / 1000);

    if (!isNaN(timestamp)) {
      return timestamp;
    }

    return -1;
  }
}
