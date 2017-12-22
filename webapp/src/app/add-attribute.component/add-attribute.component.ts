import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { AfterViewInit, OnInit } from '@angular/core/src/metadata/lifecycle_hooks';
import {AttributeService} from '../service/attribute.service';
import {Router} from '@angular/router';
import {Http} from '@angular/http';

@Component ({
    selector: 'app-add-attribute',
    templateUrl: 'add-attribute.component.html',
    styleUrls: ['./add-attribute.component.html']
})
export class AddAttributeComponent implements OnInit {
    form;
    categories;
    constructor(private service: AttributeService, private router: Router){}

    ngOnInit() {
        this.form = new FormGroup({
            name: new FormControl('', Validators.pattern('[\\w\\-\\s\\/]+')),
            category: new FormControl(1)
        });
        this.service.getCategories().subscribe(categories => {
            this.categories = categories.json();
        });
    }

    onSubmit(formValue) {
      this.service.add(formValue).subscribe(attributes => {
        console.log(attributes);
        this.router.navigate(['/attribute']);
      });
    }
}
