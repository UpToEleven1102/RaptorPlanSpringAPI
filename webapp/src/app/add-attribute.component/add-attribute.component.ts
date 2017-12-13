import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { AfterViewInit, OnInit } from '@angular/core/src/metadata/lifecycle_hooks';
import {AttributeService} from "../service/attribute.service";

@Component ({
    selector: 'app-add-attribute',
    templateUrl: 'add-attribute.component.html',
    styleUrls: ['./add-attribute.component.html']
})
export class AddAttributeComponent implements OnInit {
    form;
    constructor(private service: AttributeService){

    }

    ngOnInit() {
        this.form = new FormGroup({
            name: new FormControl('', Validators.pattern('[\\w\\-\\s\\/]+'))
        });
    }

    onSubmit(formValue) {
      this.service.add(formValue).subscribe(attributes => {
        console.log(attributes);
      });
    }
}
