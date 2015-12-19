/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.FollowUpRecord;
import com.gwac.model.Telescope;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author xy
 */
public class FollowUpRecordDaoImpl extends BaseHibernateDaoImpl<FollowUpRecord> implements FollowUpRecordDao {

  @Override
  public List<FollowUpRecord> getByOtId(long otId, Boolean queryHis) {

    String sql1 = "select * from follow_up_record fur "
            + " inner join follow_up_observation fo on fo.fo_id=fur.fo_id and fo.ot_id=" + otId;

    String sql2 = "select * from follow_up_record_his fur "
            + " inner join follow_up_observation fo on fo.fo_id=fur.fo_id and fo.ot_id=" + otId;
    String unionSql;
    if (queryHis) {
      unionSql = "(" + sql1 + ") union (" + sql2 + ") order by number";
    } else {
      unionSql = sql1 + " order by fuo_type_id";
    }

    Session session = getCurrentSession();
    Query q = session.createSQLQuery(unionSql).addEntity(FollowUpRecord.class);
    return q.list();
  }

  @Override
  public List<FollowUpRecord> getByFuoId(long fuoId, Boolean queryHis) {

    String sql1 = "select * from follow_up_record where fuo_id=" + fuoId;
    String sql2 = "select * from follow_up_record_his where fuo_id=" + fuoId;

    String unionSql;
    if (queryHis) {
      unionSql = "(" + sql1 + ") union (" + sql2 + ") order by fr_id";
    } else {
      unionSql = sql1 + " order by fr_id";
    }

    Session session = getCurrentSession();
    Query q = session.createSQLQuery(unionSql).addEntity(FollowUpRecord.class);
    return q.list();
  }
}
