import {Injectable, Inject} from '@angular/core';
import {Http, Headers} from '@angular/http';
import {baseUrlToken} from "./provider.service";

@Injectable()
export class CourseService {
  headers: Headers;

  constructor(private http: Http, @Inject(baseUrlToken) public baseUrl) {
    this.headers = new Headers({'Content-Type': 'application/json'});
  }

  public getSubjects() {
    return this.http.get(this.baseUrl + '/discipline', {headers: this.headers}).map(response => {
      return response.json();
    });
  }

  public createCourse(formValue) {
    return this.http.post(this.baseUrl + '/course', formValue, {headers: this.headers}).map(response => {
      return response.json();
    });
  }

  public getCourses(){
    return this.http.get(this.baseUrl+ '/course', {headers:this.headers}).map(response => {
      return response.json();
    });
  }
}
