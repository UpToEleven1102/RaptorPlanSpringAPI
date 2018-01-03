package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.CourseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PageableCourseRepository extends PagingAndSortingRepository<CourseEntity, Long> {
    public CourseEntity findByCode(String code);

    public Page<CourseEntity> findCourseByDisciplineCode(String code, Pageable pageable);
}
