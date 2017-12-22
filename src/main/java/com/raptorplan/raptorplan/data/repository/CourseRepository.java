package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.CourseEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<CourseEntity, Long>{

    List<CourseEntity> findByDisciplineCode(String code);
}
