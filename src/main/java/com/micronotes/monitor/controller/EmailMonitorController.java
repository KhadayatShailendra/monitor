package com.micronotes.monitor.controller;

import com.micronotes.monitor.model.EmailMonitor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/v1")
public class EmailMonitorController {

    @RequestMapping(value="/OfferEmail",method = RequestMethod.GET)
    public List<EmailMonitor>  getOfferEmailStatus(){
        List<EmailMonitor> model= new ArrayList<EmailMonitor>();
        model.add(new EmailMonitor("TestInstance","Active","Successful",new Date()));
        return model;
    }

    @RequestMapping(value = "/LeadEmail",method = RequestMethod.GET)
    public List<EmailMonitor> getLeadEmailStatus(){
        List<EmailMonitor> model= new ArrayList<EmailMonitor>();
        model.add(new EmailMonitor("TestInstance","Active","Successful",new Date()));
        return model;
    }


}

