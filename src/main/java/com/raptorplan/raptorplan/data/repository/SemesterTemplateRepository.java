package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.McSemesterTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterTemplateRepository extends CrudRepository<McSemesterTemplate, Long> {
}
