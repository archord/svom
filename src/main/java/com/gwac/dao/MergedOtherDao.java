/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gwac.dao;

import com.gwac.model.OtLevel2;
import com.gwac.model2.MergedOther;
import java.util.List;

/**
 *
 * @author xy
 */
public interface MergedOtherDao extends BaseHibernateDao<MergedOther> {
  
  public List<MergedOther> queryByOt2(OtLevel2 ot2, float searchRadius, float mag);
}
