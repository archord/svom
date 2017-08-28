package com.gwac.model;
// Generated 2015-10-2 9:40:37 by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DataProcessMachine generated by hbm2java
 */
@Entity
@Table(name = "data_process_machine", schema = "public"
)
public class DataProcessMachine implements java.io.Serializable {

  private short dpmId;
  private String name;
  private String ip;
  private Short tspId;
  private Integer curProcessNumber;
  private Float totalStorageSize;
  private Float usedStorageSize;
  private Date monitorImageTime;
  private Date lastActiveTime;
  private Short curSkyId;
  private Integer firstRecordNumber;

  public DataProcessMachine() {
  }

  public DataProcessMachine(short dpmId) {
    this.dpmId = dpmId;
  }

  public DataProcessMachine(short dpmId, String name, String ip, Short tspId, Integer curProcessNumber, Float totalStorageSize, Float usedStorageSize, Date monitorImageTime, Date lastActiveTime, Short curSkyId, Integer firstRecordNumber) {
    this.dpmId = dpmId;
    this.name = name;
    this.ip = ip;
    this.tspId = tspId;
    this.curProcessNumber = curProcessNumber;
    this.totalStorageSize = totalStorageSize;
    this.usedStorageSize = usedStorageSize;
    this.monitorImageTime = monitorImageTime;
    this.lastActiveTime = lastActiveTime;
    this.curSkyId = curSkyId;
    this.firstRecordNumber = firstRecordNumber;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dpm_seq")
  @SequenceGenerator(name = "dpm_seq", sequenceName = "dpm_id_seq")
  @Column(name = "dpm_id", unique = true, nullable = false)
  public short getDpmId() {
    return this.dpmId;
  }

  public void setDpmId(short dpmId) {
    this.dpmId = dpmId;
  }

  @Column(name = "name")
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "ip", length = 15)
  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  @Column(name = "tsp_id")
  public Short getTspId() {
    return this.tspId;
  }

  public void setTspId(Short tspId) {
    this.tspId = tspId;
  }

  @Column(name = "cur_process_number")
  public Integer getCurProcessNumber() {
    return this.curProcessNumber;
  }

  public void setCurProcessNumber(Integer curProcessNumber) {
    this.curProcessNumber = curProcessNumber;
  }

  @Column(name = "total_storage_size", precision = 8, scale = 8)
  public Float getTotalStorageSize() {
    return this.totalStorageSize;
  }

  public void setTotalStorageSize(Float totalStorageSize) {
    this.totalStorageSize = totalStorageSize;
  }

  @Column(name = "used_storage_size", precision = 8, scale = 8)
  public Float getUsedStorageSize() {
    return this.usedStorageSize;
  }

  public void setUsedStorageSize(Float usedStorageSize) {
    this.usedStorageSize = usedStorageSize;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "monitor_image_time", length = 29)
  public Date getMonitorImageTime() {
    return this.monitorImageTime;
  }

  public void setMonitorImageTime(Date monitorImageTime) {
    this.monitorImageTime = monitorImageTime;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "last_active_time", length = 29)
  public Date getLastActiveTime() {
    return this.lastActiveTime;
  }

  public void setLastActiveTime(Date lastActiveTime) {
    this.lastActiveTime = lastActiveTime;
  }

  @Column(name = "cur_sky_id")
  public Short getCurSkyId() {
    return this.curSkyId;
  }

  public void setCurSkyId(Short curSkyId) {
    this.curSkyId = curSkyId;
  }

  @Column(name = "first_record_number")
  public Integer getFirstRecordNumber() {
    return this.firstRecordNumber;
  }

  public void setFirstRecordNumber(Integer firstRecordNumber) {
    this.firstRecordNumber = firstRecordNumber;
  }

}
