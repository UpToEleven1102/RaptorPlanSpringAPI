import {Routes, RouterModule} from '@angular/router';
import {MainComponent} from './main.component/main.component';
import {CourseComponent} from './course.component/course.component';
import {AttributeComponent} from './attribute.component/attribute.component';
import {AddAttributeComponent} from './add-attribute.component/add-attribute.component';
import {UpdateAttributeComponent} from './update-attribute.component/update-attribute.component';
import {AttributeListComponent} from './attribute-list.component/attribute-list.component';
import {AddCourseComponent} from './add-course.component/add-course.component';
import {CourseListComponent} from "./course-list.component/course-list.component";
import {McTemplateComponent} from "./mc-template.component/mc-template.component";
import {AddMcTemplateComponent} from "./add-mc-template.component/add-mc-template.component";
import {McTemplateListComponent} from "./mc-template-list.component/mc-template-list.component";

const appRoutes: Routes = [
  {path: 'index.html', component: MainComponent},
  {
    path: 'attribute', component: AttributeComponent, children: [
    {path: '', component: AttributeListComponent},
    {path: 'add', component: AddAttributeComponent},
    {path: 'update', component: UpdateAttributeComponent}]
  },
  {
    path: 'course', component: CourseComponent, children: [
    {path: 'add', component: AddCourseComponent},
    {path: '', component: CourseListComponent}
  ]
  }, {
    path: 'mctemplate', component: McTemplateComponent, children: [
      {path: 'add', component: AddMcTemplateComponent},
      {path: '', component: McTemplateListComponent}
    ]
  },
  {path: '', pathMatch: 'full', redirectTo: 'main'}
];

export const routing = RouterModule.forRoot(appRoutes);
