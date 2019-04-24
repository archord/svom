package com.gwac.model;
// Generated 2015-10-2 9:40:37 by Hibernate Tools 3.6.0

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
 * ConfigFile generated by hbm2java
 */
@Entity
@Table(name = "cross_task", schema = "public"
)
public class CrossTask implements java.io.Serializable {

  private long ctId;
  private String ctName;
  private Date createTime;
  private Integer ffCount;
  private Integer objCount;
  private Integer crossMethod;
  private String dateStr;

  public CrossTask() {
  }

  public CrossTask(long ctId) {
    this.ctId = ctId;
  }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "cross_t_id_seq")})
  @Id
  @GeneratedValue(generator = "generator")
  @Column(name = "ct_id", unique = true, nullable = false)
  public long getCtId() {
    return this.ctId;
  }

  public void setCtId(long ctId) {
    this.ctId = ctId;
  }

  /**
   * @return the ctName
   */
  @Column(name = "store_path")
  public String getCtName() {
    return ctName;
  }

  /**
   * @param ctName the ctName to set
   */
  public void setCtName(String ctName) {
    this.ctName = ctName;
  }

  /**
   * @return the createTime
   */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "create_time")
  public Date getCreateTime() {
    return createTime;
  }

  /**
   * @param createTime the createTime to set
   */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  /**
   * @return the ffCount
   */
  @Column(name = "ff_count")
  public Integer getFfCount() {
    return ffCount;
  }

  /**
   * @param ffCount the ffCount to set
   */
  public void setFfCount(Integer ffCount) {
    this.ffCount = ffCount;
  }

  /**
   * @return the objCount
   */
  @Column(name = "obj_count")
  public Integer getObjCount() {
    return objCount;
  }

  /**
   * @param objCount the objCount to set
   */
  public void setObjCount(Integer objCount) {
    this.objCount = objCount;
  }

  /**
   * @return the crossMethod
   */
  @Column(name = "cross_method")
  public Integer getCrossMethod() {
    return crossMethod;
  }

  /**
   * @param crossMethod the crossMethod to set
   */
  public void setCrossMethod(Integer crossMethod) {
    this.crossMethod = crossMethod;
  }

  /**
   * @return the dateStr
   */
  @Column(name = "date_str")
  public String getDateStr() {
    return dateStr;
  }

  /**
   * @param dateStr the dateStr to set
   */
  public void setDateStr(String dateStr) {
    this.dateStr = dateStr;
  }

}
