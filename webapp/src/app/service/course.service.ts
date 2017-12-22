import {Injectable} from '@angular/core';
import {Http} from '@angular/http';

@Injectable()
export class CourseService {
    constructor(private http: Http) {}
    getSubjects() {
        return this.http.get('http://localhost:8080/v1/discipline').map(response => {
            return response;
        });
    }
}
