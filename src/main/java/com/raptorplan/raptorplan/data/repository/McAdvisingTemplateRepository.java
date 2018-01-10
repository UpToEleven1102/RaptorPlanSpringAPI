package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.McAdvisingTemplateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McTemplateRepository extends CrudRepository<McAdvisingTemplateEntity,Long> {
    public McAdvisingTemplateEntity findByMajorCode(String major);
}
