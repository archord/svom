package com.gwac.model;
// Generated Feb 14, 2014 3:32:17 PM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * Ot generated by hbm2java
 */
public class Ot  implements java.io.Serializable {


     private long otId;
     private Long ffId;
     private BigDecimal ra;
     private BigDecimal dec;
     private Float x;
     private Float y;
     private Date datetime;
     private Float mag;
     private Float magErr;
     private Float ellipticity;
     private Float signalNoise;
     private Float fwhm;
     private Float flux;
     private Float fluxErr;
     private Long cmpStarId;
     private Long mchStarId;
     private Long ffcId;
     private Long ffmId;
     private Long slmId;
     private Long ffcmId;

    public Ot() {
    }

	
    public Ot(long otId) {
        this.otId = otId;
    }
    public Ot(long otId, Long ffId, BigDecimal ra, BigDecimal dec, Float x, Float y, Date datetime, Float mag, Float magErr, Float ellipticity, Float signalNoise, Float fwhm, Float flux, Float fluxErr, Long cmpStarId, Long mchStarId, Long ffcId, Long ffmId, Long slmId, Long ffcmId) {
       this.otId = otId;
       this.ffId = ffId;
       this.ra = ra;
       this.dec = dec;
       this.x = x;
       this.y = y;
       this.datetime = datetime;
       this.mag = mag;
       this.magErr = magErr;
       this.ellipticity = ellipticity;
       this.signalNoise = signalNoise;
       this.fwhm = fwhm;
       this.flux = flux;
       this.fluxErr = fluxErr;
       this.cmpStarId = cmpStarId;
       this.mchStarId = mchStarId;
       this.ffcId = ffcId;
       this.ffmId = ffmId;
       this.slmId = slmId;
       this.ffcmId = ffcmId;
    }
   
    public long getOtId() {
        return this.otId;
    }
    
    public void setOtId(long otId) {
        this.otId = otId;
    }
    public Long getFfId() {
        return this.ffId;
    }
    
    public void setFfId(Long ffId) {
        this.ffId = ffId;
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
    public Float getX() {
        return this.x;
    }
    
    public void setX(Float x) {
        this.x = x;
    }
    public Float getY() {
        return this.y;
    }
    
    public void setY(Float y) {
        this.y = y;
    }
    public Date getDatetime() {
        return this.datetime;
    }
    
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    public Float getMag() {
        return this.mag;
    }
    
    public void setMag(Float mag) {
        this.mag = mag;
    }
    public Float getMagErr() {
        return this.magErr;
    }
    
    public void setMagErr(Float magErr) {
        this.magErr = magErr;
    }
    public Float getEllipticity() {
        return this.ellipticity;
    }
    
    public void setEllipticity(Float ellipticity) {
        this.ellipticity = ellipticity;
    }
    public Float getSignalNoise() {
        return this.signalNoise;
    }
    
    public void setSignalNoise(Float signalNoise) {
        this.signalNoise = signalNoise;
    }
    public Float getFwhm() {
        return this.fwhm;
    }
    
    public void setFwhm(Float fwhm) {
        this.fwhm = fwhm;
    }
    public Float getFlux() {
        return this.flux;
    }
    
    public void setFlux(Float flux) {
        this.flux = flux;
    }
    public Float getFluxErr() {
        return this.fluxErr;
    }
    
    public void setFluxErr(Float fluxErr) {
        this.fluxErr = fluxErr;
    }
    public Long getCmpStarId() {
        return this.cmpStarId;
    }
    
    public void setCmpStarId(Long cmpStarId) {
        this.cmpStarId = cmpStarId;
    }
    public Long getMchStarId() {
        return this.mchStarId;
    }
    
    public void setMchStarId(Long mchStarId) {
        this.mchStarId = mchStarId;
    }
    public Long getFfcId() {
        return this.ffcId;
    }
    
    public void setFfcId(Long ffcId) {
        this.ffcId = ffcId;
    }
    public Long getFfmId() {
        return this.ffmId;
    }
    
    public void setFfmId(Long ffmId) {
        this.ffmId = ffmId;
    }
    public Long getSlmId() {
        return this.slmId;
    }
    
    public void setSlmId(Long slmId) {
        this.slmId = slmId;
    }
    public Long getFfcmId() {
        return this.ffcmId;
    }
    
    public void setFfcmId(Long ffcmId) {
        this.ffcmId = ffcmId;
    }




}


