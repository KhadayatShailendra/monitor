package com.micronotes.monitor.repository;

import com.micronotes.monitor.model.Instance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstanceRepository extends CrudRepository<Instance, Long> {

}
