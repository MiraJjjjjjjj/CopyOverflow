export class ApiResponse {
  code: number;
  message: string;
  status: string;
  result: QuestionResponse;
}

export class QuestionResponse {
    items: Question[];
    has_more: boolean;
    quota_max: number;
    quota_remaining:number;
}

export class Question {
    tags: string[];
    owner: Owner;
    is_queanswered: boolean;
    view_count: number;
    closed_date: number;
    answer_count: number;
    score: number;
    last_activity_date: number;
    creation_date: number;
    question_id: number;
    link: string;
    closed_reason: string;
    title: string;
}

export class Owner{
    reputation: number;
    user_id: number;
    user_type: string;
    accept_rate: number;
    profile_image: string;
    display_name: string;
    link: string;
}
