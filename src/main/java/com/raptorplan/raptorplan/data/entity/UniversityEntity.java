package com.raptorplan.raptorplan.data.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "H.universities")
public class UniversityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(unique = true)
    public String code;

    @Column
    public String name;

    public UniversityEntity() {
    }

    public UniversityEntity(Long id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
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


}
