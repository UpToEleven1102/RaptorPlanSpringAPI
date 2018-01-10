package com.raptorplan.raptorplan.data.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "H.advising_templates")
public class McAdvisingTemplateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer instCredit;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<AttributeEntity> instAttributes;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseInfoMcTemplate> courseInfo;

    @OneToOne
    private MajorEntity major;

    public McAdvisingTemplateEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInstCredit() {
        return instCredit;
    }

    public void setInstCredit(Integer instCredit) {
        this.instCredit = instCredit;
    }

    public List<AttributeEntity> getInstAttributes() {
        return instAttributes;
    }

    public void setInstAttributes(List<AttributeEntity> instAttributes) {
        this.instAttributes = instAttributes;
    }

    public List<CourseInfoMcTemplate> getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(List<CourseInfoMcTemplate> courseInfo) {
        this.courseInfo = courseInfo;
    }

    public MajorEntity getMajor() {
        return major;
    }

    public void setMajor(MajorEntity major) {
        this.major = major;
    }

    public void addCourseInfo(CourseInfoMcTemplate courseInfo) {
        if(this.courseInfo == null) {
            this.courseInfo = new ArrayList<>();
        }
        this.courseInfo.add(courseInfo);
    }

    public void addAttribute(AttributeEntity attribute){
        if(this.instAttributes==null){
            this.instAttributes = new ArrayList<>();
            this.instAttributes.add(attribute);
        } else if(!this.instAttributes.contains(attribute)){
            this.instAttributes.add(attribute);
        }
    }
}
