package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.SemesterTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterTemplateRepository extends CrudRepository<SemesterTemplate, Long> {
}
