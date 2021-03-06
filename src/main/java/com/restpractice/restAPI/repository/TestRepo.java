package com.restpractice.restAPI.repository;

import com.restpractice.restAPI.entities.TestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepo extends CrudRepository<TestEntity, Long> {
    // declare query methods

    // override and return a List so can get a List
    @Override
    List<TestEntity> findAll();

}
