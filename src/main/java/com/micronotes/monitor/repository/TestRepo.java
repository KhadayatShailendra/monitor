package com.micronotes.monitor.repository;

import com.micronotes.monitor.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<TestModel,Integer> {
}
