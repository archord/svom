/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.OtLevel2;
import java.math.BigInteger;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author xy
 */
public class OtLevel2DaoImpl extends BaseHibernateDaoImpl<OtLevel2> implements OtLevel2Dao {

  private static final Log log = LogFactory.getLog(OtLevel2DaoImpl.class);

  @Override
  public OtLevel2 getOtLevel2ByName(String otName) {
    Session session = getCurrentSession();
    String sql = "select * from ot_level2 where name='" + otName + "';";
    Query q = session.createSQLQuery(sql).addEntity(OtLevel2.class);
    if (!q.list().isEmpty()) {
      return (OtLevel2) q.list().get(0);
    } else {
      return null;
    }
  }

  @Override
  public Boolean exist(OtLevel2 obj) {
    Boolean flag = false;
    Session session = getCurrentSession();
    String sql = "select ot_id from ot_level2 where identify='"
            + obj.getIdentify()
            + "' and abs(xtemp-" + obj.getXtemp() + ")<2 "
            + " and abs(ytemp-" + obj.getYtemp() + ")<2 ";
    Query q = session.createSQLQuery(sql);
    if (!q.list().isEmpty()) {
      BigInteger otId = (BigInteger) q.list().get(0);
      obj.setOtId(otId.longValue());
      flag = true;
    }
    return flag;
  }

  public List<OtLevel2> findRecord1(int start, int resultSize, String[] orderNames, int[] sort) {

    String sql = "select ol2 from OtLevel2 ol2 join fetch ol2.otType ";
    if (orderNames != null && sort != null && orderNames.length > 0 && sort.length>0) {
      sql += "order by ";
      if (orderNames.length == sort.length) {
        for (int i = 0; i < orderNames.length; i++) {
          if (sort[i] == SORT_ASC) {
            sql += "ol2." + orderNames[i] + " asc ";
          } else {
            sql += "ol2." + orderNames[i] + " desc ";
          }
        }
      } else {
        for (String ord : orderNames) {
          sql += "ol2." + ord + " asc ";
        }
      }
    }
    Query q = getCurrentSession().createQuery(sql);
    q.setFirstResult(start);
    q.setMaxResults(resultSize);
    return q.list();
  }

  public List<OtLevel2> queryOtLevel2(String startDate, String endDate, String tsp, float xtemp, float ytemp, float radius, int start, int resultSize) {

    int parNum = 0;
    if (!startDate.isEmpty()) {
      parNum++;
    }
    if (!endDate.isEmpty()) {
      parNum++;
    }
    if (!tsp.equalsIgnoreCase("all")) {
      parNum++;
    }
    if (xtemp != 0.0) {
      parNum++;
    }
    if (ytemp != 0.0) {
      parNum++;
    }
    if (radius < 2.0) {
      radius = 2;
    }

    String sql = "select * from ot_level2 ";

    if (parNum == 1) {
      if (!startDate.isEmpty()) {
        sql += " where found_time_utc>'" + startDate + " 00:00:00' ";
      } else if (!endDate.isEmpty()) {
        sql += " where found_time_utc<'" + endDate + " 23:59:59' ";
      } else if (!tsp.equalsIgnoreCase("all")) {
        sql += " where dpm_name='" + tsp + "' ";
      } else if (xtemp == 0.0) {
        sql += " where abs(xtemp-" + xtemp + ")<" + radius;
      } else if (ytemp == 0.0) {
        sql += " where abs(ytemp-" + ytemp + ")<" + radius;
      }
    } else if (parNum >= 2) {
      int tParNum = 1;
      sql += " where ";
      if (!startDate.isEmpty()) {
        sql += " found_time_utc>'" + startDate + " 00:00:00' ";
        if (tParNum < parNum) {
          sql += " and ";
          tParNum++;
        }
      }
      if (!endDate.isEmpty()) {
        sql += " found_time_utc<'" + endDate + " 23:59:59' ";
        if (tParNum < parNum) {
          sql += " and ";
          tParNum++;
        }
      }
      if (!tsp.equalsIgnoreCase("all")) {
        sql += " dpm_name='" + tsp + "' ";
        if (tParNum < parNum) {
          sql += " and ";
          tParNum++;
        }
      }
      if (xtemp != 0.0) {
        sql += " abs(xtemp-" + xtemp + ")<" + radius;
        if (tParNum < parNum) {
          sql += " and ";
          tParNum++;
        }
      }
      if (ytemp != 0.0) {
        sql += " abs(ytemp-" + ytemp + ")<" + radius;
        if (tParNum < parNum) {
          sql += " and ";
          tParNum++;
        }
      }
    }
    sql += " order by dpm_name, found_time_utc";

    Session session = getCurrentSession();
//    sql = "select * from ot_level2 "
//            + "where found_time_utc>'" + startDate + " 00:00:00' "
//            + "and found_time_utc<'" + endDate + " 23:59:59' "
//            + "and dpm_name='" + tsp + "' "
//            + "and abs(xtemp-" + xtemp + ")<" + radius + " "
//            + "and abs(ytemp-" + ytemp + ")<" + radius + " "
//            + "order by found_time_utc";
    Query q = session.createSQLQuery(sql).addEntity(OtLevel2.class);
    q.setFirstResult(start);
    q.setMaxResults(resultSize);
    return q.list();
  }

  public List<OtLevel2> getOtLevel2ByDpmName(String dpmName) {
    Session session = getCurrentSession();
    String sql = "select * from ot_level2 where dpm_name='" + dpmName + "';";
    Query q = session.createSQLQuery(sql).addEntity(OtLevel2.class);
    if (!q.list().isEmpty()) {
      return q.list();
    } else {
      return null;
    }
  }
}