import { Component, OnInit } from '@angular/core';
import { QuestionResponse, Question } from './model/question-response';
import { QuestionService } from './service/question-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title: string;

  constructor() {
    this.title = 'StackOverflow Questions Feed';
  }
}
