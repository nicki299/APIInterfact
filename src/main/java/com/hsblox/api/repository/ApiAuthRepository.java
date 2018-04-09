package com.hsblox.api.repository;

import com.hsblox.api.model.ApiAuth;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiAuthRepository extends CrudRepository<ApiAuth, Long> {
}
