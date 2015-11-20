/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.OtLevel2;
import com.gwac.model.OtLevel2QueryParameter;
import java.util.List;

/**
 *
 * @author xy
 */
public interface OtLevel2Dao extends BaseHibernateDao<OtLevel2> {

  public void moveDataToHisTable();

  public List<OtLevel2> searchOT2His(OtLevel2 ot2, float searchRadius, float mag);

  public Boolean exist(OtLevel2 obj, float errorBox);

  public OtLevel2 existInAll(OtLevel2 obj, float errorBox);

  public OtLevel2 existInLatestN(OtLevel2 obj, float errorBox, int n);

  public OtLevel2 getOtLevel2ByName(String otName, Boolean queryHis);

  public List<OtLevel2> getOtLevel2ByDpmName(String dpmName);

  public List<OtLevel2> queryOtLevel2(OtLevel2QueryParameter ot2qp);

  public int countOtLevel2(OtLevel2QueryParameter ot2qp);

  public List<OtLevel2> getMatchedLv2OT();

  public List<OtLevel2> getMatchedLv2OTByDate(String dateStr);

  public List<OtLevel2> getCurOccurLv2OT();

  public List<OtLevel2> getCurOccurLv2OTByDate(String dateStr);

  public List<OtLevel2> getNCurOccurLv2OT();

  public List<OtLevel2> getNCurOccurLv2OTByDate(String dateStr);

  public List<OtLevel2> getMissedFFCLv2OT();

  public void updateAllFileCuttedById(long id);

  public OtLevel2 getOtLevel2ByNameFromHis(String otName);

  public void updateIsMatch(OtLevel2 ot2);

  public void updateCvsMatch(OtLevel2 ot2);

  public void updateRc3Match(OtLevel2 ot2);

  public void updateMinorPlanetMatch(OtLevel2 ot2);

  public void updateOt2HisMatch(OtLevel2 ot2);

  public void updateOtherMatch(OtLevel2 ot2);

  public List<OtLevel2> getUnMatched();
}
