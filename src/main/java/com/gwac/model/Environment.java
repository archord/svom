package com.gwac.model;
// Generated 2014-3-2 17:07:19 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * Environment generated by hbm2java
 */
public class Environment  implements java.io.Serializable {


     private long envId;
     private Date date;
     private Date time;
     private String wather;
     private BigDecimal windSpeed;
     private BigDecimal temperature;
     private BigDecimal humidity;
     private BigDecimal seeing;
     private BigDecimal cloudPercent;

    public Environment() {
    }

	
    public Environment(long envId) {
        this.envId = envId;
    }
    public Environment(long envId, Date date, Date time, String wather, BigDecimal windSpeed, BigDecimal temperature, BigDecimal humidity, BigDecimal seeing, BigDecimal cloudPercent) {
       this.envId = envId;
       this.date = date;
       this.time = time;
       this.wather = wather;
       this.windSpeed = windSpeed;
       this.temperature = temperature;
       this.humidity = humidity;
       this.seeing = seeing;
       this.cloudPercent = cloudPercent;
    }
   
    public long getEnvId() {
        return this.envId;
    }
    
    public void setEnvId(long envId) {
        this.envId = envId;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public String getWather() {
        return this.wather;
    }
    
    public void setWather(String wather) {
        this.wather = wather;
    }
    public BigDecimal getWindSpeed() {
        return this.windSpeed;
    }
    
    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }
    public BigDecimal getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }
    public BigDecimal getHumidity() {
        return this.humidity;
    }
    
    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }
    public BigDecimal getSeeing() {
        return this.seeing;
    }
    
    public void setSeeing(BigDecimal seeing) {
        this.seeing = seeing;
    }
    public BigDecimal getCloudPercent() {
        return this.cloudPercent;
    }
    
    public void setCloudPercent(BigDecimal cloudPercent) {
        this.cloudPercent = cloudPercent;
    }




}


