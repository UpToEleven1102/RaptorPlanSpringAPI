package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends CrudRepository<AttributeEntity,Long>{

}
