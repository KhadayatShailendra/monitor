package com.micronotes.monitor.service;

import com.micronotes.monitor.model.TestModel;
import com.micronotes.monitor.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Testservice  {
    @Autowired
    private TestRepo tr ;

    public List<TestModel> getAllTest(){
        List<TestModel> instances=new ArrayList<>();
        tr.findAll().forEach(instances::add);
        return instances;
    }

}
