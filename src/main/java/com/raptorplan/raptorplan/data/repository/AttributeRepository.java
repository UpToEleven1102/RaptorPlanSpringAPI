package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.model.customObject.AttributeCustom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeRepository extends CrudRepository<AttributeEntity,Long>{
    public AttributeEntity findById(Long id);

    @Query("SELECT NEW com.raptorplan.raptorplan.model.customObject.AttributeCustom(c.id,c.code,c.name) FROM AttributeEntity c")
    public List<AttributeCustom> getAttributeList();
}
