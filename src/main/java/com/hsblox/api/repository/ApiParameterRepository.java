package com.hsblox.api.repository;

import com.hsblox.api.model.ApiParameter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiParameterRepository extends CrudRepository<ApiParameter, Long> {
}
