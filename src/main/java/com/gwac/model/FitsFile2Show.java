package com.gwac.model;
// Generated 2017-1-10 20:46:20 by Hibernate Tools 3.6.0

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
 * FitsFile2 generated by hbm2java
 */
@Entity
@Table(name = "fits_file2", schema = "public"
)
public class FitsFile2Show implements java.io.Serializable {

  private long ffId;
  private Integer ffNumber;
  private Integer groupId;
  private Integer unitId;
  private Integer camId;
  private Short gridId;
  private Integer fieldId;
  private String imgName;
  private String imgPath;
  private Date genTime;
  private String groupName;
  private String unitName;
  private String camName;
  private String gridName;
  private String fieldName;

  public FitsFile2Show() {
  }

  public FitsFile2Show(long ffId) {
    this.ffId = ffId;
  }

  public FitsFile2Show(long ffId, Integer ffNumber, Integer groupId, Integer unitId, Integer camId, Short gridId, Integer fieldId, String imgName, String imgPath, Date genTime) {
    this.ffId = ffId;
    this.ffNumber = ffNumber;
    this.groupId = groupId;
    this.unitId = unitId;
    this.camId = camId;
    this.gridId = gridId;
    this.fieldId = fieldId;
    this.imgName = imgName;
    this.imgPath = imgPath;
    this.genTime = genTime;
  }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "ff_id_seq2")})
  @Id
  @GeneratedValue(generator = "generator")
  @Column(name = "ff_id", unique = true, nullable = false)
  public long getFfId() {
    return this.ffId;
  }

  public void setFfId(long ffId) {
    this.ffId = ffId;
  }

  @Column(name = "ff_number")
  public Integer getFfNumber() {
    return this.ffNumber;
  }

  public void setFfNumber(Integer ffNumber) {
    this.ffNumber = ffNumber;
  }

  @Column(name = "group_id")
  public Integer getGroupId() {
    return this.groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  @Column(name = "unit_id")
  public Integer getUnitId() {
    return this.unitId;
  }

  public void setUnitId(Integer unitId) {
    this.unitId = unitId;
  }

  @Column(name = "cam_id")
  public Integer getCamId() {
    return this.camId;
  }

  public void setCamId(Integer camId) {
    this.camId = camId;
  }

  @Column(name = "grid_id")
  public Short getGridId() {
    return this.gridId;
  }

  public void setGridId(Short gridId) {
    this.gridId = gridId;
  }

  @Column(name = "field_id")
  public Integer getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  @Column(name = "img_name")
  public String getImgName() {
    return this.imgName;
  }

  public void setImgName(String imgName) {
    this.imgName = imgName;
  }

  @Column(name = "img_path")
  public String getImgPath() {
    return this.imgPath;
  }

  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "gen_time", length = 29)
  public Date getGenTime() {
    return this.genTime;
  }

  public void setGenTime(Date genTime) {
    this.genTime = genTime;
  }

  /**
   * @return the groupName
   */
  @Column(name = "group_name")
  public String getGroupName() {
    return groupName;
  }

  /**
   * @param groupName the groupName to set
   */
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  /**
   * @return the unitName
   */
  @Column(name = "unit_name")
  public String getUnitName() {
    return unitName;
  }

  /**
   * @param unitName the unitName to set
   */
  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  /**
   * @return the camName
   */
  @Column(name = "cam_name")
  public String getCamName() {
    return camName;
  }

  /**
   * @param camName the camName to set
   */
  public void setCamName(String camName) {
    this.camName = camName;
  }

  /**
   * @return the gridName
   */
  @Column(name = "grid_name")
  public String getGridName() {
    return gridName;
  }

  /**
   * @param gridName the gridName to set
   */
  public void setGridName(String gridName) {
    this.gridName = gridName;
  }

  /**
   * @return the fieldName
   */
  @Column(name = "field_name")
  public String getFieldName() {
    return fieldName;
  }

  /**
   * @param fieldName the fieldName to set
   */
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

}
