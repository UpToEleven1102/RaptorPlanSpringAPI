package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.DisciplineEntity;
import com.raptorplan.raptorplan.model.customObject.DisciplineCustom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplineRepository extends CrudRepository<DisciplineEntity,Long>{
    public DisciplineEntity findByCode(String code);

    @Query("SELECT NEW com.raptorplan.raptorplan.model.customObject.DisciplineCustom(c.id,c.name,c.code) FROM DisciplineEntity c")
    public List<DisciplineCustom> getDisciplineList();

}
