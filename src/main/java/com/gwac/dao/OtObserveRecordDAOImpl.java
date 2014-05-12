/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.OtObserveRecordShow;
import com.gwac.model.OtObserveRecordTmp;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 *
 * @author xy
 */
public class OtObserveRecordDAOImpl extends BaseHibernateDaoImpl<OtObserveRecordTmp> implements OtObserveRecordDAO {

  private static final Log log = LogFactory.getLog(OtObserveRecordDAOImpl.class);

  public List<OtObserveRecordShow> getRecordByOtId(long otId) {

    ArrayList<OtObserveRecordShow> oorss = new ArrayList<OtObserveRecordShow>();
    Session session = getCurrentSession();
    String sql = "select oor.*, ff.file_name, ff.store_path, ffc.file_name, ffc.store_path "
            + "from ot_observe_record_tmp oor "
            + "left join fits_file ff on oor.ff_id=ff.ff_id "
            + "left join fits_file_cut ffc on oor.ffc_id=ffc.ffc_id "
            + "where ot_id='" + otId + "'";
    Iterator itor = session.createSQLQuery(sql).list().iterator();
    while (itor.hasNext()) {
      Object[] row = (Object[]) itor.next();
      try {
        BigInteger otID = (BigInteger) row[0];
        BigInteger ffId = (BigInteger) row[1];
        BigInteger ffcId = (BigInteger) row[2];
        BigInteger oortId = (BigInteger) row[3];
        Short otTypeId = (Short) row[4];
        float raD = (Float) row[5];
        float decD = (Float) row[6];
        float x = (Float) row[7];
        float y = (Float) row[8];
        float xTemp = (Float) row[9];
        float yTemp = (Float) row[10];
        Date dateUt = (Date) row[11];
        float flux = (Float) row[12];
        Boolean flag = (Boolean) row[13];
        float flagChb = (Float) row[14];
        float background = (Float) row[15];
        float threshold = (Float) row[16];
        float magAper = (Float) row[17];
        float magerrAper = (Float) row[18];
        float ellipticity = (Float) row[19];
        Short ClassStar = (Short) row[20];
        Boolean otFlag = (Boolean) row[21];
        String ffFileName = (String) row[22];
        String ffStorePath = (String) row[23];
        String ffcFileName = (String) row[24];
        String ffcStorePath = (String) row[25];

        OtObserveRecordShow oors = new OtObserveRecordShow();
        oors.setBackground(background);
        oors.setClassStar(ClassStar);
        oors.setDateUt(dateUt);
        oors.setDecD(decD);
        oors.setEllipticity(ellipticity);
        oors.setFfId(ffId.longValue());
        oors.setFfName(ffFileName);
        oors.setFfPath(ffStorePath);
        oors.setFfcId(ffcId.longValue());
        oors.setFfcName(ffcFileName);
        oors.setFfcPath(ffcStorePath);
        oors.setFlag(flag);
        oors.setFlagChb(flagChb);
        oors.setFlux(flux);
        oors.setMagAper(magAper);
        oors.setMagerrAper(magerrAper);
        oors.setOortId(oortId.longValue());
        oors.setOtFlag(otFlag);
        oors.setOtId(otId);
        oors.setRaD(raD);
        oors.setThreshold(threshold);
        oors.setX(x);
        oors.setXTemp(yTemp);
        oors.setY(y);
        oors.setYTemp(yTemp);
        oorss.add(oors);
      } catch (ClassCastException cce) {
        cce.printStackTrace();
      }
    }
    System.out.println("*****************************size="+oorss.size());
    return oorss;
  }
}
