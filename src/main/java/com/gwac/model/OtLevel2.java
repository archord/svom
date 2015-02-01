package com.gwac.model;
// Generated 2014-9-1 13:05:37 by Hibernate Tools 3.6.0

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
 * OtLevel2 generated by hbm2java
 */
@Entity
@Table(name = "ot_level2", schema = "public"
)
public class OtLevel2 implements java.io.Serializable {

  private long otId;
  private Boolean allFileCutted;
  private String comments;
  private Integer cuttedFfNumber;
  private String dateStr;
  private Float dec;
  private Integer dpmId;
  private Integer firstFfNumber;
  private Date foundTimeUtc;
  private String identify;
  private Boolean isRecognize;
  private Integer lastFfNumber;
  private String name;
  private Short otType;
  private Float ra;
  private Integer total;
  private Float xtemp;
  private Float ytemp;
  private Short isMatch;

  public OtLevel2() {
  }

  public OtLevel2(Boolean allFileCutted, String comments, Integer cuttedFfNumber, String dateStr, Float dec, Integer dpmId, Integer firstFfNumber, Date foundTimeUtc, String identify, Boolean isRecognize, Integer lastFfNumber, String name, Short otType, Float ra, Integer total, Float xtemp, Float ytemp, Short isMatch) {
    this.allFileCutted = allFileCutted;
    this.comments = comments;
    this.cuttedFfNumber = cuttedFfNumber;
    this.dateStr = dateStr;
    this.dec = dec;
    this.dpmId = dpmId;
    this.firstFfNumber = firstFfNumber;
    this.foundTimeUtc = foundTimeUtc;
    this.identify = identify;
    this.isRecognize = isRecognize;
    this.lastFfNumber = lastFfNumber;
    this.name = name;
    this.otType = otType;
    this.ra = ra;
    this.total = total;
    this.xtemp = xtemp;
    this.ytemp = ytemp;
    this.isMatch = isMatch;
  }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "ot_leve2_seq")})
  @Id
  @GeneratedValue(generator = "generator")

  @Column(name = "ot_id", unique = true, nullable = false)
  public long getOtId() {
    return this.otId;
  }

  public void setOtId(long otId) {
    this.otId = otId;
  }

  @Column(name = "comments", length = 1024)
  public String getComments() {
    return this.comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  @Column(name = "date_str", length = 6)
  public String getDateStr() {
    return this.dateStr;
  }

  public void setDateStr(String dateStr) {
    this.dateStr = dateStr;
  }

  @Column(name = "dec", precision = 8, scale = 8)
  public Float getDec() {
    return this.dec;
  }

  public void setDec(Float dec) {
    this.dec = dec;
  }

  @Column(name = "dpm_id")
  public Integer getDpmId() {
    return this.dpmId;
  }

  public void setDpmId(Integer dpmId) {
    this.dpmId = dpmId;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "found_time_utc", length = 29)
  public Date getFoundTimeUtc() {
    return this.foundTimeUtc;
  }

  public void setFoundTimeUtc(Date foundTimeUtc) {
    this.foundTimeUtc = foundTimeUtc;
  }

  @Column(name = "identify", length = 21)
  public String getIdentify() {
    return this.identify;
  }

  public void setIdentify(String identify) {
    this.identify = identify;
  }

  @Column(name = "is_recognize")
  public Boolean getIsRecognize() {
    return this.isRecognize;
  }

  public void setIsRecognize(Boolean isRecognize) {
    this.isRecognize = isRecognize;
  }

  @Column(name = "last_ff_number")
  public Integer getLastFfNumber() {
    return this.lastFfNumber;
  }

  public void setLastFfNumber(Integer lastFfNumber) {
    this.lastFfNumber = lastFfNumber;
  }

  @Column(name = "name", length = 12)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "ot_type")
  public Short getOtType() {
    return this.otType;
  }

  public void setOtType(Short otType) {
    this.otType = otType;
  }

  @Column(name = "ra", precision = 8, scale = 8)
  public Float getRa() {
    return this.ra;
  }

  public void setRa(Float ra) {
    this.ra = ra;
  }

  @Column(name = "total")
  public Integer getTotal() {
    return this.total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Column(name = "xtemp", precision = 8, scale = 8)
  public Float getXtemp() {
    return this.xtemp;
  }

  public void setXtemp(Float xtemp) {
    this.xtemp = xtemp;
  }

  @Column(name = "ytemp", precision = 8, scale = 8)
  public Float getYtemp() {
    return this.ytemp;
  }

  public void setYtemp(Float ytemp) {
    this.ytemp = ytemp;
  }

  /**
   * @return the allFileCutted
   */
  @Column(name = "all_file_cutted")
  public Boolean getAllFileCutted() {
    return allFileCutted;
  }

  /**
   * @param allFileCutted the allFileCutted to set
   */
  public void setAllFileCutted(Boolean allFileCutted) {
    this.allFileCutted = allFileCutted;
  }

  /**
   * @return the cuttedFfNumber
   */
  @Column(name = "cutted_ff_number")
  public Integer getCuttedFfNumber() {
    return cuttedFfNumber;
  }

  /**
   * @param cuttedFfNumber the cuttedFfNumber to set
   */
  public void setCuttedFfNumber(Integer cuttedFfNumber) {
    this.cuttedFfNumber = cuttedFfNumber;
  }

  /**
   * @return the firstFfNumber
   */
  @Column(name = "first_ff_number")
  public Integer getFirstFfNumber() {
    return firstFfNumber;
  }

  /**
   * @param firstFfNumber the firstFfNumber to set
   */
  public void setFirstFfNumber(Integer firstFfNumber) {
    this.firstFfNumber = firstFfNumber;
  }

  /**
   * @return the isMatch
   */
  @Column(name = "is_match")
  public Short getIsMatch() {
    return isMatch;
  }

  /**
   * @param isMatch the isMatch to set
   */
  public void setIsMatch(Short isMatch) {
    this.isMatch = isMatch;
  }

}
