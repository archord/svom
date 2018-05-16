package com.gwac.model;
// Generated 2015-10-2 9:40:37 by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DataProcessMachine generated by hbm2java
 */
@Entity
@Table(name = "data_version", schema = "public"
)
public class DataVersion implements java.io.Serializable {

  private int dvId;
  private String dvName;
  private String dvPath;

  public DataVersion() {
  }

  public DataVersion(int dvId) {
    this.dvId = dvId;
  }

  @Id
  @Column(name = "dv_id", unique = true, nullable = false)
  public int getDvId() {
    return this.dvId;
  }

  public void setDvId(int dvId) {
    this.dvId = dvId;
  }

  /**
   * @return the dvName
   */
  @Column(name = "dv_name")
  public String getDvName() {
    return dvName;
  }

  /**
   * @param dvName the dvName to set
   */
  public void setDvName(String dvName) {
    this.dvName = dvName;
  }

  /**
   * @return the dvPath
   */
  @Column(name = "dv_path")
  public String getDvPath() {
    return dvPath;
  }

  /**
   * @param dvPath the dvPath to set
   */
  public void setDvPath(String dvPath) {
    this.dvPath = dvPath;
  }


}