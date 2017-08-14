package com.gwac.model;
// Generated 2015-10-2 9:40:37 by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ConfigFile generated by hbm2java
 */
@Entity
@Table(name = "oor_tmp", schema = "public"
)
public class OorTmp implements java.io.Serializable {

  private long oor1Id;
  private Float oor1Ra;
  private Float oor1Dec;
  private Float oor1Mag;
  private long oor2Id;
  private Float oor2Ra;
  private Float oor2Dec;
  private Float oor2Mag;
  private Integer oor1DpmId;
  private Integer oor2DpmId;
  private Date oor1DateUt;
  private Date oor2DateUt;

  public OorTmp() {
  }

  public OorTmp(long oor1Id) {
    this.oor1Id = oor1Id;
  }

  @Id
  @Column(name = "oor1_id")
  public long getOor1Id() {
    return oor1Id;
  }

  /**
   * @param oor1Id the oor1Id to set
   */
  public void setOor1Id(long oor1Id) {
    this.oor1Id = oor1Id;
  }

  /**
   * @return the oor1Ra
   */
  @Column(name = "oor1_ra")
  public Float getOor1Ra() {
    return oor1Ra;
  }

  /**
   * @param oor1Ra the oor1Ra to set
   */
  public void setOor1Ra(Float oor1Ra) {
    this.oor1Ra = oor1Ra;
  }

  /**
   * @return the oor1Dec
   */
  @Column(name = "oor1_dec")
  public Float getOor1Dec() {
    return oor1Dec;
  }

  /**
   * @param oor1Dec the oor1Dec to set
   */
  public void setOor1Dec(Float oor1Dec) {
    this.oor1Dec = oor1Dec;
  }

  /**
   * @return the oor1Mag
   */
  @Column(name = "oor1_mag")
  public Float getOor1Mag() {
    return oor1Mag;
  }

  /**
   * @param oor1Mag the oor1Mag to set
   */
  public void setOor1Mag(Float oor1Mag) {
    this.oor1Mag = oor1Mag;
  }

  /**
   * @return the oor2Id
   */
  @Column(name = "oor2_id")
  public long getOor2Id() {
    return oor2Id;
  }

  /**
   * @param oor2Id the oor2Id to set
   */
  public void setOor2Id(long oor2Id) {
    this.oor2Id = oor2Id;
  }

  /**
   * @return the oor2Ra
   */
  @Column(name = "oor2_ra")
  public Float getOor2Ra() {
    return oor2Ra;
  }

  /**
   * @param oor2Ra the oor2Ra to set
   */
  public void setOor2Ra(Float oor2Ra) {
    this.oor2Ra = oor2Ra;
  }

  /**
   * @return the oor2Dec
   */
  @Column(name = "oor2_dec")
  public Float getOor2Dec() {
    return oor2Dec;
  }

  /**
   * @param oor2Dec the oor2Dec to set
   */
  public void setOor2Dec(Float oor2Dec) {
    this.oor2Dec = oor2Dec;
  }

  /**
   * @return the oor2Mag
   */
  @Column(name = "oor2_mag")
  public Float getOor2Mag() {
    return oor2Mag;
  }

  /**
   * @param oor2Mag the oor2Mag to set
   */
  public void setOor2Mag(Float oor2Mag) {
    this.oor2Mag = oor2Mag;
  }

  /**
   * @return the oor1DpmId
   */
  @Column(name = "oor1_dpm_id")
  public Integer getOor1DpmId() {
    return oor1DpmId;
  }

  /**
   * @param oor1DpmId the oor1DpmId to set
   */
  public void setOor1DpmId(Integer oor1DpmId) {
    this.oor1DpmId = oor1DpmId;
  }

  /**
   * @return the oor2DpmId
   */
  @Column(name = "oor2_dpm_id")
  public Integer getOor2DpmId() {
    return oor2DpmId;
  }

  /**
   * @param oor2DpmId the oor2DpmId to set
   */
  public void setOor2DpmId(Integer oor2DpmId) {
    this.oor2DpmId = oor2DpmId;
  }

  /**
   * @return the oor1DateUt
   */
  @Column(name = "oor1_date_ut")
  public Date getOor1DateUt() {
    return oor1DateUt;
  }

  /**
   * @param oor1DateUt the oor1DateUt to set
   */
  public void setOor1DateUt(Date oor1DateUt) {
    this.oor1DateUt = oor1DateUt;
  }

  /**
   * @return the oor2DateUt
   */
  @Column(name = "oor2_date_ut")
  public Date getOor2DateUt() {
    return oor2DateUt;
  }

  /**
   * @param oor2DateUt the oor2DateUt to set
   */
  public void setOor2DateUt(Date oor2DateUt) {
    this.oor2DateUt = oor2DateUt;
  }

}