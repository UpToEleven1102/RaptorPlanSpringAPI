package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.CourseInfoMcTemplate;
import com.raptorplan.raptorplan.data.entity.UniversityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseInfoRepository extends CrudRepository<CourseInfoMcTemplate, Long> {
}
