package com.hsblox.api.repository;

import com.hsblox.api.model.ApiUriMethod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiUriMethodRepository extends CrudRepository<ApiUriMethod, Long> {
}
