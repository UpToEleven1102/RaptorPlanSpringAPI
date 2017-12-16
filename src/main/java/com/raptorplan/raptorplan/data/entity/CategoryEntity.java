package com.raptorplan.raptorplan.data.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "H.API.categories")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<AttributeEntity> attributes;

    public CategoryEntity() {}

    public CategoryEntity(String name, List<AttributeEntity> attributes) {
        this.name = name;
        this.attributes = attributes;
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

    public List<AttributeEntity> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeEntity> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(AttributeEntity attribute){
        if(null!=this.attributes){
            this.attributes = new ArrayList<>();
            this.attributes.add(attribute);
        } else {
            this.attributes.add(attribute);
        }
    }
}
