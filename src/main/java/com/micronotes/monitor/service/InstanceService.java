package com.micronotes.monitor.service;

import com.micronotes.monitor.model.Instance;
import com.micronotes.monitor.repository.InstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InstanceService {

    @Autowired
    private InstanceRepository instanceRepository;

    public List<Instance> getAllInstance(){
        List<Instance> instances=new ArrayList<>();
        instanceRepository.findAll().forEach(instances::add);
        return instances;
    }

    public Instance getInstance(Long id){
        return instanceRepository.findById(id).get();
    }

    public Instance addInstance(Instance instance){
        instanceRepository.save(instance);
        return instance;
    }

    public Instance updateInstance(Instance instance){
        instanceRepository.save(instance);
        return instance;
    }

    public boolean deleteInstance(Long id){
        instanceRepository.deleteById(id);
        return true;
    }

}
