package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.MajorEntity;
import com.raptorplan.raptorplan.model.customObject.MajorCustom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorRepository extends CrudRepository<MajorEntity,Long> {
    @Query("SELECT NEW com.raptorplan.raptorplan.model.customObject.MajorCustom(c.id, c.code, c.name) FROM MajorEntity c")
    public List<MajorCustom> getAll();

    public MajorEntity findByCode(String code);
}
