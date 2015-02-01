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
@Table(name = "ot_level2_match", schema = "public"
)
public class OtLevel2Match implements java.io.Serializable {

  private long olmId;
  private long otId;
  private short otTypeId;
  private long matchId;
  private String comments;
  private float ra;
  private float dec;
  private float mag;

  public OtLevel2Match() {
  }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "ot_level2_match_id_seq")})
  @Id
  @GeneratedValue(generator = "generator")
  @Column(name = "olm_id", unique = true, nullable = false)
  public long getOlmId() {
    return olmId;
  }

  public void setOlmId(long olmId) {
    this.olmId = olmId;
  }

  @Column(name = "ot_id")
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

  @Column(name = "dec", precision = 8, scale = 8)
  public Float getDec() {
    return this.dec;
  }

  public void setDec(Float dec) {
    this.dec = dec;
  }

  @Column(name = "ra", precision = 8, scale = 8)
  public Float getRa() {
    return this.ra;
  }

  public void setRa(Float ra) {
    this.ra = ra;
  }

  /**
   * @return the otTypeId
   */
  @Column(name = "ot_type_id")
  public short getOtTypeId() {
    return otTypeId;
  }

  /**
   * @param otTypeId the otTypeId to set
   */
  public void setOtTypeId(short otTypeId) {
    this.otTypeId = otTypeId;
  }

  /**
   * @return the matchId
   */
  @Column(name = "match_id")
  public long getMatchId() {
    return matchId;
  }

  /**
   * @param matchId the matchId to set
   */
  public void setMatchId(long matchId) {
    this.matchId = matchId;
  }

  /**
   * @return the mag
   */
  @Column(name = "mag", precision = 8, scale = 8)
  public float getMag() {
    return mag;
  }

  /**
   * @param mag the mag to set
   */
  public void setMag(float mag) {
    this.mag = mag;
  }
}
