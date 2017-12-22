import {Component} from '@angular/core';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';
import {Http} from '@angular/http';
import { CourseService } from '../service/course.service';

@Component({
    selector: 'app-add-course',
    templateUrl: 'add-course.component.html',
    styleUrls: ['add-course.component.css']
})
export class AddCourseComponent implements OnInit {
    subjects;

    constructor(private courseService: CourseService) {}
    ngOnInit() {
        console.log('"add new course"');
        this.subjects = this.courseService.getSubjects().subscribe(response => {
            this.subjects = response.json();
            console.log(this.subjects);
        });
    }

}
