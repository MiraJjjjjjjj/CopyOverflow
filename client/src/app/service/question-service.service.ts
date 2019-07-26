import { ApiResponse } from './../model/question-response';
import { Injectable } from '@angular/core';
import { QuestionResponse } from '../model/question-response';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  private questionsUrl: string;

  constructor(private http: HttpClient) {
    this.questionsUrl = 'http://localhost:8080/api/questions?';
  }

  public findAll(uri): Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.questionsUrl + uri);
  }
}
