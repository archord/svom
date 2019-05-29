package com.gwac.model;
// Generated 2015-12-17 20:17:15 by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * FollowUpObject generated by hbm2java
 */
@Entity
@Table(name = "science_object_final",
         schema = "public"
)
public class ScienceObjectFinal implements java.io.Serializable {

  private long sofId;
  private String name;
  private String discoveryTime;
  private String triggerTime;
  private String ra;
  private String dec;
  private String magDetect;
  private String magCatalog;
  private String magAbsolute;
  private String amplitude;
  private String dutyScientist;
  private String followup;
  private String type;
  private String comments;
  private String source;
  private String publicMsg;
  private Short gwacType;
  
  public ScienceObjectFinal() {
  }

  public ScienceObjectFinal(long sofId) {
    this.sofId = sofId;
  }

  /**
   * @return the sofId
   */
  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49")
    ,
    @Parameter(name = "sequence", value = "sof_id_seq")})
  @Id
  @GeneratedValue(generator = "generator")
  @Column(name = "sof_id", unique = true, nullable = false)
  public long getSofId() {
    return sofId;
  }

  /**
   * @param sofId the soId to set
   */
  public void setSofId(long sofId) {
    this.sofId = sofId;
  }

  /**
   * @return the name
   */
  @Column(name = "name")
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * @return the discoveryTime
   */
  @Column(name = "discovery_time")
  public String getDiscoveryTime() {
    return discoveryTime;
  }

  /**
   * @param discoveryTime the discoveryTime to set
   */
  public void setDiscoveryTime(String discoveryTime) {
    this.discoveryTime = discoveryTime;
  }

  /**
   * @return the triggerTime
   */
  @Column(name = "trigger_time")
  public String getTriggerTime() {
    return triggerTime;
  }

  /**
   * @param triggerTime the triggerTime to set
   */
  public void setTriggerTime(String triggerTime) {
    this.triggerTime = triggerTime;
  }

  /**
   * @return the ra
   */
  @Column(name = "ra")
  public String getRa() {
    return ra;
  }

  /**
   * @param ra the ra to set
   */
  public void setRa(String ra) {
    this.ra = ra;
  }

  /**
   * @return the dec
   */
  @Column(name = "dec")
  public String getDec() {
    return dec;
  }

  /**
   * @param dec the dec to set
   */
  public void setDec(String dec) {
    this.dec = dec;
  }

  /**
   * @return the magDetect
   */
  @Column(name = "mag_detect")
  public String getMagDetect() {
    return magDetect;
  }

  /**
   * @param magDetect the magDetect to set
   */
  public void setMagDetect(String magDetect) {
    this.magDetect = magDetect;
  }

  /**
   * @return the magCatalog
   */
  @Column(name = "mag_catalog")
  public String getMagCatalog() {
    return magCatalog;
  }

  /**
   * @param magCatalog the magCatalog to set
   */
  public void setMagCatalog(String magCatalog) {
    this.magCatalog = magCatalog;
  }

  /**
   * @return the magAbsolute
   */
  @Column(name = "mag_absolute")
  public String getMagAbsolute() {
    return magAbsolute;
  }

  /**
   * @param magAbsolute the magAbsolute to set
   */
  public void setMagAbsolute(String magAbsolute) {
    this.magAbsolute = magAbsolute;
  }

  /**
   * @return the amplitude
   */
  @Column(name = "amplitude")
  public String getAmplitude() {
    return amplitude;
  }

  /**
   * @param amplitude the amplitude to set
   */
  public void setAmplitude(String amplitude) {
    this.amplitude = amplitude;
  }

  /**
   * @return the duty_scientist
   */
  @Column(name = "duty_scientist")
  public String getDutyScientist() {
    return dutyScientist;
  }

  /**
   * @param duty_scientist the duty_scientist to set
   */
  public void setDutyScientist(String dutyScientist) {
    this.dutyScientist = dutyScientist;
  }

  /**
   * @return the followup
   */
  @Column(name = "followup")
  public String getFollowup() {
    return followup;
  }

  /**
   * @param followup the followup to set
   */
  public void setFollowup(String followup) {
    this.followup = followup;
  }

  /**
   * @return the type
   */
  @Column(name = "type")
  public String getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * @return the comments
   */
  @Column(name = "comments")
  public String getComments() {
    return comments;
  }

  /**
   * @param comments the comments to set
   */
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * @return the source
   */
  @Column(name = "source")
  public String getSource() {
    return source;
  }

  /**
   * @param source the source to set
   */
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * @return the public_msg
   */
  @Column(name = "public_msg")
  public String getPublicMsg() {
    return publicMsg;
  }

  /**
   * @param publicMsg the publicMsg to set
   */
  public void setPublicMsg(String publicMsg) {
    this.publicMsg = publicMsg;
  }

  /**
   * @return the gwacType
   */
  @Column(name = "gwac_type")
  public Short getGwacType() {
    return gwacType;
  }

  /**
   * @param gwacType the gwacType to set
   */
  public void setGwacType(Short gwacType) {
    this.gwacType = gwacType;
  }

}
