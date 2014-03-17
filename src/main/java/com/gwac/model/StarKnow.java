package com.gwac.model;
// Generated 2014-3-2 17:07:19 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;

/**
 * StarKnow generated by hbm2java
 */
public class StarKnow  implements java.io.Serializable {


     private long starId;
     private String starName;
     private BigDecimal ra;
     private BigDecimal dec;
     private Float mag;
     private Short vtId;

    public StarKnow() {
    }

	
    public StarKnow(long starId) {
        this.starId = starId;
    }
    public StarKnow(long starId, String starName, BigDecimal ra, BigDecimal dec, Float mag, Short vtId) {
       this.starId = starId;
       this.starName = starName;
       this.ra = ra;
       this.dec = dec;
       this.mag = mag;
       this.vtId = vtId;
    }
   
    public long getStarId() {
        return this.starId;
    }
    
    public void setStarId(long starId) {
        this.starId = starId;
    }
    public String getStarName() {
        return this.starName;
    }
    
    public void setStarName(String starName) {
        this.starName = starName;
    }
    public BigDecimal getRa() {
        return this.ra;
    }
    
    public void setRa(BigDecimal ra) {
        this.ra = ra;
    }
    public BigDecimal getDec() {
        return this.dec;
    }
    
    public void setDec(BigDecimal dec) {
        this.dec = dec;
    }
    public Float getMag() {
        return this.mag;
    }
    
    public void setMag(Float mag) {
        this.mag = mag;
    }
    public Short getVtId() {
        return this.vtId;
    }
    
    public void setVtId(Short vtId) {
        this.vtId = vtId;
    }




}


