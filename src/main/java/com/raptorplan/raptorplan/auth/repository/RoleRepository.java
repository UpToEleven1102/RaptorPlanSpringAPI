package com.raptorplan.raptorplan.auth.repository;

import com.raptorplan.raptorplan.auth.model.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity,Long>{
}
