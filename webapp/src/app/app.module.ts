import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';


import { AppComponent } from './app.component';
import { MainComponent } from './main.component/main.component';
import { routing } from './route.component';
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
    AddCourseComponent

  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    routing,
    HttpModule
  ],
  providers: [AttributeService,
          CourseService,
    {provide: baseUrlToken, useValue:baseUrl}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
