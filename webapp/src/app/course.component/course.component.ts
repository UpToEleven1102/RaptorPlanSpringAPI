import {Component, OnInit} from '@angular/core';
import {CourseService} from "../service/course.service";
import {Router} from "@angular/router";

@Component ({
    selector: 'app-course',
    templateUrl: './course.component.html',
    styleUrls: ['./course.component.css']
})
export class CourseComponent implements OnInit {
  courses;

  constructor(private courseService: CourseService, private router:Router){}

  ngOnInit(){
    this.courseService.getCourses().subscribe(response=> this.courses = response);
  }

}
