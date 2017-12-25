import {Component} from '@angular/core';
import {OnInit} from '@angular/core/src/metadata/lifecycle_hooks';
import {CourseService} from '../service/course.service';
import {FormControl, FormGroup, Validators, FormArray} from '@angular/forms';
import {Router} from '@angular/router';
import {AttributeService, Attribute} from '../service/attribute.service';


@Component({
  selector: 'app-add-course',
  templateUrl: 'add-course.component.html',
  styleUrls: ['add-course.component.css']
})
export class AddCourseComponent implements OnInit {
  subjects = [];
  form;
  attr: Attribute[];

  constructor(private courseService: CourseService, private attributeService: AttributeService,
              private router:Router) {
  }

  ngOnInit() {
    this.attributeService.getAll().subscribe(response => this.attr = response);
    this.form = new FormGroup({
      name: new FormControl('',Validators.required),
      subject: new FormControl('CMSC',Validators.required),
      code: new FormControl('',Validators.required),
      credit: new FormControl(0,Validators.required),
      attributes: new FormArray([
        new FormGroup({
          id: new FormControl('4',Validators.compose([Validators.required, Validators.pattern("^[0-9]")]))
        })
      ])
    });
    this.courseService.getSubjects().subscribe(response => {
      this.subjects = response;
    });
  }

  addAttribute() {
    let control = <FormArray>this.form.controls['attributes'];
    control.push(new FormGroup({id:new FormControl('4',Validators.required)}));
  }

  removeAttribute(i){
    let control = <FormArray>this.form.controls['attributes'];
    control.removeAt(i);
  }

  onSubmit(formValue){
    this.courseService.createCourse(formValue).subscribe(response=>{
      this.router.navigate(['course']);
    });
  }
}
