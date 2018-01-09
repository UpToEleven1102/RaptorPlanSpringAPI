package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.TransferTemplateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferTemplateRepository extends CrudRepository<TransferTemplateEntity, Long> {
}
