package com.raptorplan.raptorplan.data.repository;

import com.raptorplan.raptorplan.data.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long>{
    CategoryEntity findById(Long id);
}
