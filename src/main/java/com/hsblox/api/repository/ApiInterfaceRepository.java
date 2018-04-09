package com.hsblox.api.repository;

import com.hsblox.api.model.ApiInterface;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiInterfaceRepository extends CrudRepository<ApiInterface, Long> {
}
