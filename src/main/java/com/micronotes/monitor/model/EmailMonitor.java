package com.micronotes.monitor.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class EmailMonitor {

    private String InstanceName;
    private String Status;
    private String Message;
    private Date CreatedDate;

    public EmailMonitor(){

    }

    public EmailMonitor(String instanceName, String status, String message, Date createdDate){
        this.InstanceName=instanceName;
        this.Status=status;
        this.Message=message;
        this.CreatedDate=createdDate;
    }

    public String getInstanceName() {
        return this.InstanceName;
    }

    public void setInstanceName(String instanceName) {
        this.InstanceName = instanceName;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getMessage() {
        return this.Message;
    }

    public void setMessage(String message) {
        this.Message = message;
    }

    public Date getCreatedDate() {
        return this.CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.CreatedDate = createdDate;
    }
}
