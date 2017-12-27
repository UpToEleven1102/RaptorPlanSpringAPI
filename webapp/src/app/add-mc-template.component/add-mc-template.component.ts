import {Component, OnInit} from "@angular/core";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-add-mc-template',
  templateUrl: 'add-mc-template.component.html',
  styleUrls:['add-mc-template.component.css']
})
export class AddMcTemplateComponent implements OnInit{
  form;
  constructor(private _fb:FormBuilder){}
  ngOnInit(){
    this.form = this._fb.group({
      enFoundationCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      mathFoundationCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      speechFoundationCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      artDistributionCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      behavioralDistributionCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      humanDistributionCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      scienceDistributionCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      scienceLabDistributionCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      programCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      electivesCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      institutionalCredit:['',[Validators.required,Validators.pattern('^[0-9]')]],
      englCourses: this._fb.array([
        this.initFormGroup()
      ]),
      mathCourses:this._fb.array([
        this.initFormGroup()
      ])
      // speechCourses:this._fb.array([]),
      // artCourses
      // behaveCourses
      // humanCourses
      // scienceCourses
      // scienceLabCourses
      // majorCourses
      // electiveCourses
      // instAttributes
    });
  }

  initFormGroup():FormGroup{
    return this._fb.group({
      id:this._fb.control(['',Validators.required])
    });
  }


}
