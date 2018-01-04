package com.raptorplan.raptorplan.data.entity;

import com.raptorplan.raptorplan.model.customObject.CourseInfoMcTemplate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "H.mc_templates")
public class McTemplateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<AttributeEntity> instAttributes;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseInfoMcTemplate> courseInfo;

    @OneToOne
    private MajorEntity major;

    public McTemplateEntity() {
    }


//    public void addEngl(CourseEntity course){
//        if(this.englCourses==null) {
//            this.englCourses = new ArrayList<>();
//        }
//        else if(!this.englCourses.contains(course)){
//            this.englCourses.add(course);
//        }
//
//    }
//
//    public void addSpeech(CourseEntity course){
//        if(this.speechCourses==null){
//            this.speechCourses = new ArrayList<>();
//            this.speechCourses.add(course);
//        } else if(!this.speechCourses.contains(course)){
//            this.speechCourses.add(course);
//        }
//    }
//
//    public void addMath(CourseEntity course){
//        if(this.mathCourses==null){
//            this.mathCourses = new ArrayList<>();
//            this.mathCourses.add(course);
//        } else if(!this.mathCourses.contains(course)){
//            this.mathCourses.add(course);
//        }
//    }
//
//    public void addArt(CourseEntity course){
//        if(this.artCourses==null){
//            this.artCourses = new ArrayList<>();
//            this.artCourses.add(course);
//        } else if(!this.artCourses.contains(course)){
//            this.artCourses.add(course);
//        }
//    }
//
//    public void addBehave(CourseEntity course){
//        if(this.behaveCourses==null){
//            this.behaveCourses = new ArrayList<>();
//            this.behaveCourses.add(course);
//        } else if(!this.behaveCourses.contains(course)){
//            this.behaveCourses.add(course);
//        }
//    }
//
//    public void addHumanities(CourseEntity course){
//        if(this.humanCourses==null){
//            this.humanCourses = new ArrayList<>();
//            this.humanCourses.add(course);
//        } else if(!this.humanCourses.contains(course)){
//            this.humanCourses.add(course);
//        }
//
//    }
//
//    public void addScience(CourseEntity course){
//        if(this.scienceCourses==null){
//            this.scienceCourses = new ArrayList<>();
//            this.scienceCourses.add(course);
//        } else if(!this.scienceCourses.contains(course)){
//            this.scienceCourses.add(course);
//        }
//    }
//
//    public void addLabScience(CourseEntity course){
//        if(this.labCourses ==null){
//            this.labCourses = new ArrayList<>();
//            this.labCourses.add(course);
//        } else if(!this.labCourses.contains(course)){
//            this.labCourses.add(course);
//        }
//    }
//
//    public void addMajor(CourseEntity course){
//        if(this.majorCourses==null){
//            this.majorCourses = new ArrayList<>();
//            this.majorCourses.add(course);
//        } else if(!this.majorCourses.contains(course)){
//            this.majorCourses.add(course);
//        }
//    }
//
//    public void addElectives(CourseEntity course){
//        if(this.electiveCourses==null){
//            this.electiveCourses = new ArrayList<>();
//            this.electiveCourses.add(course);
//        } else if(!this.electiveCourses.contains(course)){
//            this.electiveCourses.add(course);
//        }
//    }
//
//    public void addAttribute(AttributeEntity attribute){
//        if(this.instAttributes==null){
//            this.instAttributes = new ArrayList<>();
//            this.instAttributes.add(attribute);
//        } else if(!this.instAttributes.contains(attribute)){
//            this.instAttributes.add(attribute);
//        }
//    }
}
