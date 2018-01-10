package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.McTemplateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McTemplateRepository extends CrudRepository<McTemplateEntity, Long> {
    public McTemplateEntity findByUniversityCodeAndMajorCode(String universityCode, String majorCode);
}
