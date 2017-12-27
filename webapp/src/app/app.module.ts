import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';


import { AppComponent } from './app.component';
import { MainComponent } from './main.component/main.component';
import { AttributeComponent } from './attribute.component/attribute.component';
import { CourseComponent } from './course.component/course.component';
import { AttributeListComponent } from './attribute-list.component/attribute-list.component';
import { CourseListComponent } from './course-list.component/course-list.component';
import { AddAttributeComponent } from './add-attribute.component/add-attribute.component';
import { UpdateAttributeComponent } from './update-attribute.component/update-attribute.component';
import { AddCourseComponent } from './add-course.component/add-course.component';
import { AttributeService } from './service/attribute.service';
import { CourseService } from './service/course.service';
import { baseUrlToken,baseUrl } from "./service/provider.service";
import {routing} from "./route.component";
import {McTemplateListComponent} from "./mc-template-list.component/mc-template-list.component";
import {McTemplateComponent} from "./mc-template.component/mc-template.component";
import {AddMcTemplateComponent} from "./add-mc-template.component/add-mc-template.component";


@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    AttributeComponent,
    CourseComponent,
    AttributeListComponent,
    CourseListComponent,
    AddAttributeComponent,
    UpdateAttributeComponent,
    AddCourseComponent,
    McTemplateListComponent,
    McTemplateComponent,
    AddMcTemplateComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpModule,
    routing
  ],
  providers: [AttributeService,
          CourseService,
    {provide: baseUrlToken, useValue:baseUrl}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
