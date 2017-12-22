package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.CategoryEntity;
import com.raptorplan.raptorplan.model.customObject.CategoryCustom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long>{
   @Query("SELECT NEW com.raptorplan.raptorplan.model.customObject.CategoryCustom(c.id, c.name) FROM CategoryEntity c")
    public List<CategoryCustom> getCategoryList();

    public CategoryEntity findById(Long id);
    public CategoryEntity findByName(String category);
}
