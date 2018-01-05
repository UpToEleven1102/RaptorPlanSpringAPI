package com.raptorplan.raptorplan.data.entity;

import com.raptorplan.raptorplan.data.entity.CourseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "H.course_info")
public class CourseInfoMcTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer credit;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private AttributeEntity attribute;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> courses;

    public CourseInfoMcTemplate() {}

    public CourseInfoMcTemplate(String name, Integer credit, AttributeEntity attribute, List<CourseEntity> courses) {
        this.name = name;
        this.credit = credit;
        this.attribute = attribute;
        this.courses = courses;
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

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public AttributeEntity getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeEntity attribute) {
        this.attribute = attribute;
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    public void addCourse(CourseEntity courseEntity) {
        if(this.courses==null){
            this.courses = new ArrayList<>();
            this.courses.add(courseEntity);
        }
        else
            this.courses.add(courseEntity);
    }
}