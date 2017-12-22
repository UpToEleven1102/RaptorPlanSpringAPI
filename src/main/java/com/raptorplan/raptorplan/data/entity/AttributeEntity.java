package com.raptorplan.raptorplan.data.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "H.attributes")
public class AttributeEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @ManyToMany(mappedBy = "attributes")
    private List<CourseEntity> courses;

    @ManyToOne
    private CategoryEntity category;

//    @ManyToOne
//    private TemplateEntity template;

    public AttributeEntity(){}

    public AttributeEntity(String name, List<CourseEntity> courses, CategoryEntity category) {
        this.name = name;
        this.courses = courses;
        this.category = category;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

//    public TemplateEntity getTemplate() {
//        return template;
//    }
//
//    public void setTemplate(TemplateEntity template) {
//        this.template = template;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttributeEntity)) return false;

        AttributeEntity that = (AttributeEntity) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public void addCourse(CourseEntity course){
        if(this.courses==null){
            this.courses = new ArrayList<>();
            this.courses.add(course);
        } else if(!this.courses.contains(course)){
            this.courses.add(course);
        }
    }
}
