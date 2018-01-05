package com.raptorplan.raptorplan.model.customObject;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "H.semester")
public class SemesterTemplate {
    @Id
    private Long id;

    @OneToMany
    private List<AttributeEntity> attributes;

    @OneToMany
    private List<CourseEntity> courses;

    public SemesterTemplate() {}

    public SemesterTemplate(Long id, List<AttributeEntity> attributes, List<CourseEntity> courses) {
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
