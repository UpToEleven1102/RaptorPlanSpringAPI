package com.raptorplan.raptorplan.data.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "H.API.courses")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "subject")
    private String subject;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "credit")
    private Integer credit;

    @Column(name = "title", unique = true)
    private String title;

    @ManyToMany
    @JoinTable(name="H.API.join_course_attribute",
            joinColumns = @JoinColumn(name="course_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id", referencedColumnName = "id"))
    private List<AttributeEntity> attributes;

    public CourseEntity(){}

    public CourseEntity(String subject, String code, Integer credit, String title, List<AttributeEntity> attributes) {
        this.subject = subject;
        this.code = code;
        this.credit = credit;
        this.title = title;
        this.attributes = attributes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<AttributeEntity> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeEntity> attributes) {
        this.attributes = attributes;
    }
}
