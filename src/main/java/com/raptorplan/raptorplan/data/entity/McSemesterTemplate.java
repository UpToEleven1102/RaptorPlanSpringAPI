package com.raptorplan.raptorplan.data.entity;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "H.semester")
public class McSemesterTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<AttributeEntity> attributes;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> courses;

    public McSemesterTemplate() {}

    public McSemesterTemplate(Long id, List<AttributeEntity> attributes, List<CourseEntity> courses) {
        this.id = id;
        this.attributes = attributes;
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AttributeEntity> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeEntity> attributes) {
        this.attributes = attributes;
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }
}
