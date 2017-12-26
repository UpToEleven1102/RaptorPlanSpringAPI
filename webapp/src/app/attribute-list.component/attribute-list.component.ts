import {Component, OnInit} from '@angular/core';
import {AttributeService} from "../service/attribute.service";

@Component ({
    selector: 'app-attribute-list',
    templateUrl: './attribute-list.component.html',
    styleUrls: ['./attribute-list.component.css']
})
export class AttributeListComponent implements OnInit{
  attributes;
  constructor(private attributeService: AttributeService){}

  ngOnInit(){
    this.attributeService.getAll().subscribe(response => {
      this.attributes = response;
    });
  }
}
