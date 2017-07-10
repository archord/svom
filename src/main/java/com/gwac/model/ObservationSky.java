package com.gwac.model;
// Generated 2015-10-2 9:40:37 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ObservationSky generated by hbm2java
 */
@Entity
@Table(name="observation_sky"
    ,schema="public"
)
public class ObservationSky  implements java.io.Serializable {


     private int skyId;
     private String skyName;
     private Float raMaxS;
     private Float raMinS;
     private Float decMaxS;
     private Float decMinS;
     private Float raMaxN;
     private Float raMinN;
     private Float decMaxN;
     private Float decMinN;
     private int gridId;

    public ObservationSky() {
    }

	
    public ObservationSky(int skyId) {
        this.skyId = skyId;
    }
    public ObservationSky(int skyId, String skyName, Float raMaxS, Float raMinS, Float decMaxS, Float decMinS, Float raMaxN, Float raMinN, Float decMaxN, Float decMinN) {
       this.skyId = skyId;
       this.skyName = skyName;
       this.raMaxS = raMaxS;
       this.raMinS = raMinS;
       this.decMaxS = decMaxS;
       this.decMinS = decMinS;
       this.raMaxN = raMaxN;
       this.raMinN = raMinN;
       this.decMaxN = decMaxN;
       this.decMinN = decMinN;
    }
   
  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "sky_id_seq")})
     @Id 
  @GeneratedValue(generator = "generator")
    @Column(name="sky_id", unique=true, nullable=false)
    public int getSkyId() {
        return this.skyId;
    }
    
    public void setSkyId(int skyId) {
        this.skyId = skyId;
    }

    
    @Column(name="sky_name", length=6)
    public String getSkyName() {
        return this.skyName;
    }
    
    public void setSkyName(String skyName) {
        this.skyName = skyName;
    }

    
    @Column(name="ra_max_s", precision=8, scale=8)
    public Float getRaMaxS() {
        return this.raMaxS;
    }
    
    public void setRaMaxS(Float raMaxS) {
        this.raMaxS = raMaxS;
    }

    
    @Column(name="ra_min_s", precision=8, scale=8)
    public Float getRaMinS() {
        return this.raMinS;
    }
    
    public void setRaMinS(Float raMinS) {
        this.raMinS = raMinS;
    }

    
    @Column(name="dec_max_s", precision=8, scale=8)
    public Float getDecMaxS() {
        return this.decMaxS;
    }
    
    public void setDecMaxS(Float decMaxS) {
        this.decMaxS = decMaxS;
    }

    
    @Column(name="dec_min_s", precision=8, scale=8)
    public Float getDecMinS() {
        return this.decMinS;
    }
    
    public void setDecMinS(Float decMinS) {
        this.decMinS = decMinS;
    }

    
    @Column(name="ra_max_n", precision=8, scale=8)
    public Float getRaMaxN() {
        return this.raMaxN;
    }
    
    public void setRaMaxN(Float raMaxN) {
        this.raMaxN = raMaxN;
    }

    
    @Column(name="ra_min_n", precision=8, scale=8)
    public Float getRaMinN() {
        return this.raMinN;
    }
    
    public void setRaMinN(Float raMinN) {
        this.raMinN = raMinN;
    }

    
    @Column(name="dec_max_n", precision=8, scale=8)
    public Float getDecMaxN() {
        return this.decMaxN;
    }
    
    public void setDecMaxN(Float decMaxN) {
        this.decMaxN = decMaxN;
    }

    
    @Column(name="dec_min_n", precision=8, scale=8)
    public Float getDecMinN() {
        return this.decMinN;
    }
    
    public void setDecMinN(Float decMinN) {
        this.decMinN = decMinN;
    }

  /**
   * @return the gridId
   */
    @Column(name="grid_id")
  public int getGridId() {
    return gridId;
  }

  /**
   * @param gridId the gridId to set
   */
  public void setGridId(int gridId) {
    this.gridId = gridId;
  }

}


