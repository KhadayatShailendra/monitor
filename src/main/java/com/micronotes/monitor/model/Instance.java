package com.micronotes.monitor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instanceId;
    private String instance;
    private int statusId;
    private Date createdDate;

    public Instance(){

    }

    public Instance(String instance, int statusId, Date createdDate) {
        super();
        this.instance = instance;
        this.statusId = statusId;
        this.createdDate = createdDate;
    }


    public Long getinstanceId() {
        return this.instanceId;
    }

    public String getinstance() {
        return this.instance;
    }

    public void setinstance(String instance) {
        this.instance = instance;
    }

    public int getstatusId() {
        return this.statusId;
    }

    public void setstatusId(int statusId) {
        this.statusId = statusId;
    }

    public Date getcreatedDate() {
        return this.createdDate;
    }

    public void setcreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
