package com.gwac.model;
// Generated 2015-12-17 20:17:15 by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * FollowUpObject generated by hbm2java
 */
@Entity
@Table(name="follow_up_object"
    ,schema="public"
)
public class FollowUpObject  implements java.io.Serializable {


     private long fuoId;
     private String fuoName;
     private Short fuoTypeId;
     private Date startTimeUtc;
     private Float lastRa;
     private Float lastDec;
     private Float lastX;
     private Float lastY;
     private Integer foundNumber;
     private Long foId;
     private Long otId;

    public FollowUpObject() {
    }

	
    public FollowUpObject(long fuoId) {
        this.fuoId = fuoId;
    }
    public FollowUpObject(long fuoId, String fuoName, Short fuoTypeId, Date startTimeUtc, Float lastRa, Float lastDec, Float lastX, Float lastY, Integer foundNumber, Long foId, Long otId) {
       this.fuoId = fuoId;
       this.fuoName = fuoName;
       this.fuoTypeId = fuoTypeId;
       this.startTimeUtc = startTimeUtc;
       this.lastRa = lastRa;
       this.lastDec = lastDec;
       this.lastX = lastX;
       this.lastY = lastY;
       this.foundNumber = foundNumber;
       this.foId = foId;
       this.otId = otId;
    }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "fuo_id_seq")})
     @Id 
  @GeneratedValue(generator = "generator")
    @Column(name="fuo_id", unique=true, nullable=false)
    public long getFuoId() {
        return this.fuoId;
    }
    
    public void setFuoId(long fuoId) {
        this.fuoId = fuoId;
    }

    
    @Column(name="fuo_name", length=16)
    public String getFuoName() {
        return this.fuoName;
    }
    
    public void setFuoName(String fuoName) {
        this.fuoName = fuoName;
    }

    
    @Column(name="fuo_type_id")
    public Short getFuoTypeId() {
        return this.fuoTypeId;
    }
    
    public void setFuoTypeId(Short fuoTypeId) {
        this.fuoTypeId = fuoTypeId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_time_utc", length=29)
    public Date getStartTimeUtc() {
        return this.startTimeUtc;
    }
    
    public void setStartTimeUtc(Date startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
    }

    
    @Column(name="last_ra", precision=8, scale=8)
    public Float getLastRa() {
        return this.lastRa;
    }
    
    public void setLastRa(Float lastRa) {
        this.lastRa = lastRa;
    }

    
    @Column(name="last_dec", precision=8, scale=8)
    public Float getLastDec() {
        return this.lastDec;
    }
    
    public void setLastDec(Float lastDec) {
        this.lastDec = lastDec;
    }

    
    @Column(name="last_x", precision=8, scale=8)
    public Float getLastX() {
        return this.lastX;
    }
    
    public void setLastX(Float lastX) {
        this.lastX = lastX;
    }

    
    @Column(name="last_y", precision=8, scale=8)
    public Float getLastY() {
        return this.lastY;
    }
    
    public void setLastY(Float lastY) {
        this.lastY = lastY;
    }

    
    @Column(name="found_number")
    public Integer getFoundNumber() {
        return this.foundNumber;
    }
    
    public void setFoundNumber(Integer foundNumber) {
        this.foundNumber = foundNumber;
    }

    
    @Column(name="fo_id")
    public Long getFoId() {
        return this.foId;
    }
    
    public void setFoId(Long foId) {
        this.foId = foId;
    }

    
    @Column(name="ot_id")
    public Long getOtId() {
        return this.otId;
    }
    
    public void setOtId(Long otId) {
        this.otId = otId;
    }




}

