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
}
