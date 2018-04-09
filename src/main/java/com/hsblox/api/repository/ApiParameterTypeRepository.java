package com.hsblox.api.repository;

import com.hsblox.api.model.ApiParameterType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiParameterTypeRepository extends CrudRepository<ApiParameterType, Long> {
}
