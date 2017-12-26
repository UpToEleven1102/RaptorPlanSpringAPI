import {Component, OnInit} from '@angular/core';
import {CourseService} from "../service/course.service";

@Component ({
    selector: 'app-course-list',
    templateUrl: './course-list.component.html',
    styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit{

  courses;
  constructor(private couseService:CourseService){

  }

  ngOnInit(){
    this.couseService.getCourses().subscribe(response => {
      this.courses = response;
    });

  }
}
