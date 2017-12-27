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

    @Column(name = "code",unique = true)
    private String code;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "attributes")
    private List<CourseEntity> courses;

    public AttributeEntity() {
    }

    public AttributeEntity(String code, String name, List<CourseEntity> courses) {
        this.code = code;
        this.name = name;
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
