export class QuestionRequest {
  constructor(
    public order: string,
    public sort: string,
  ) {}

  toDate: any;
  fromDate: any;
  tagged: string;
}

