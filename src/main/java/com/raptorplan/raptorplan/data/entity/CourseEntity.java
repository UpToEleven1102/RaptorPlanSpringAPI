package com.raptorplan.raptorplan.data.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "H.courses")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "credit")
    private Integer credit;

    @Column(name = "title", unique = true)
    private String title;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name="H.API.course_attribute",
            joinColumns = @JoinColumn(name="course_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id", referencedColumnName = "id"))
    private List<AttributeEntity> attributes;

    @ManyToOne
    private DisciplineEntity discipline;


    public CourseEntity(){}

    public CourseEntity(String code, Integer credit, String title, List<AttributeEntity> attributes) {
        this.code = code;
        this.credit = credit;
        this.title = title;
        this.attributes = attributes;
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

    public DisciplineEntity getDiscipline() {
        return discipline;
    }

    public void setDiscipline(DisciplineEntity discipline) {
        this.discipline = discipline;
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
        if (!(o instanceof CourseEntity)) return false;

        CourseEntity that = (CourseEntity) o;

        return code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    public void addAttribute(AttributeEntity attribute) {
        if(this.attributes==null){
            attributes = new ArrayList<>();
            this.attributes.add(attribute);
        } else if(!this.attributes.contains(attribute)) {
            attributes.add(attribute);
        }
    }
}
