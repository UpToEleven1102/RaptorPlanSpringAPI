package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<CourseEntity, Long>{

}
