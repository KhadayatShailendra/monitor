package com.micronotes.monitor.controller;

import com.micronotes.monitor.model.Instance;
import com.micronotes.monitor.model.TestModel;
import com.micronotes.monitor.service.InstanceService;
import com.micronotes.monitor.service.Testservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/instance")
public class InstanceController {

    @Autowired
    private InstanceService instanceService;

    @RequestMapping(value = "/instances",method = RequestMethod.GET)
    public List<Instance> allInstance(){
        return instanceService.getAllInstance();
    }

    @RequestMapping(value = "/instance/{id}",method = RequestMethod.GET)
    public Instance getInstance(@PathVariable Long id){
        return instanceService.getInstance(id);
    }

    @RequestMapping(value = "/instance",method = RequestMethod.POST)
    public Instance addInstance(@RequestBody Instance instance){
        return instanceService.addInstance(instance);
    }

    @RequestMapping(value = "/instance",method = RequestMethod.PUT)
    public Instance updateInstance(@RequestBody Instance instance){
        //update instance name and statusid
        return instanceService.updateInstance(instance);
    }

    @Autowired
    private Testservice ts;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public List<TestModel> getAllTest(){
        return ts.getAllTest();
    }

    @RequestMapping(value = "/rinzu", method = RequestMethod.GET)
    public String sallu(){
        return "test meesage";
    }

}
