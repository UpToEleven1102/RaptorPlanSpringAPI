package com.raptorplan.raptorplan.model.customObject;

import com.raptorplan.raptorplan.data.entity.CourseEntity;

import javax.persistence.*;
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

    @OneToMany
    private List<CourseEntity> courses;

    public CourseInfoMcTemplate() {}

    public CourseInfoMcTemplate(String name, Integer credit, List<CourseEntity> courses) {
        this.name = name;
        this.credit = credit;
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

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }
}
