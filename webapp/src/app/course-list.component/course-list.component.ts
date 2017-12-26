import {Component, OnInit} from '@angular/core';
import {CourseService} from "../service/course.service";
import {Router} from "@angular/router";

@Component ({
    selector: 'app-course-list',
    templateUrl: './course-list.component.html',
    styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit{

  courses;
  constructor(private couseService:CourseService, private router:Router){

  }

  ngOnInit(){
    this.couseService.getCourses().subscribe(response => {
      this.courses = response;
    });

  }

  removeCourse(id){
    this.couseService.deleteCourse(id).subscribe();
    this.couseService.getCourses().subscribe(response => {
      this.courses = response;
    });
  }
}
