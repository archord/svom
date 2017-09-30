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
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * UploadFileUnstore generated by hbm2java
 */
@Entity
@Table(name = "upload_file_unstore", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "file_name")
)
public class UploadFileUnstore implements java.io.Serializable {

  private long ufuId;
  private String storePath;
  private String fileName;
  private Character fileType;
  private Boolean uploadSuccess;
  private Date uploadDate;
  private Date sendTime;
  private Date processDoneTime;

  public UploadFileUnstore() {
  }

  public UploadFileUnstore(long ufuId) {
    this.ufuId = ufuId;
  }

  public UploadFileUnstore(long ufuId, String storePath, String fileName, Character fileType, Boolean uploadSuccess, Date uploadDate, Date sendTime, Date processDoneTime) {
    this.ufuId = ufuId;
    this.storePath = storePath;
    this.fileName = fileName;
    this.fileType = fileType;
    this.uploadSuccess = uploadSuccess;
    this.uploadDate = uploadDate;
    this.sendTime = sendTime;
    this.processDoneTime = processDoneTime;
  }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "ufu_id_seq")})
  @Id
  @GeneratedValue(generator = "generator")

  @Column(name = "ufu_id", unique = true, nullable = false)
  public long getUfuId() {
    return this.ufuId;
  }

  public void setUfuId(long ufuId) {
    this.ufuId = ufuId;
  }

  @Column(name = "store_path")
  public String getStorePath() {
    return this.storePath;
  }

  public void setStorePath(String storePath) {
    this.storePath = storePath;
  }

  @Column(name = "file_name", unique = true)
  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  @Column(name = "file_type", length = 1)
  public Character getFileType() {
    return this.fileType;
  }

  public void setFileType(Character fileType) {
    this.fileType = fileType;
  }

  @Column(name = "upload_success")
  public Boolean getUploadSuccess() {
    return this.uploadSuccess;
  }

  public void setUploadSuccess(Boolean uploadSuccess) {
    this.uploadSuccess = uploadSuccess;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "upload_date", length = 29)
  public Date getUploadDate() {
    return this.uploadDate;
  }

  public void setUploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "send_time", length = 29)
  public Date getSendTime() {
    return this.sendTime;
  }

  public void setSendTime(Date sendTime) {
    this.sendTime = sendTime;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "process_done_time", length = 29)
  public Date getProcessDoneTime() {
    return this.processDoneTime;
  }

  public void setProcessDoneTime(Date processDoneTime) {
    this.processDoneTime = processDoneTime;
  }

}