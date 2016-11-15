package com.ynwi.ssh.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ynwi.ssh.beans.Clerk;
import com.ynwi.ssh.beans.Plan;
import com.ynwi.ssh.dao.PlanDao;

public class PlanDaoImpl extends HibernateDaoSupport implements PlanDao{

	@Override
	public ArrayList<Plan> getplanlist() throws HibernateException {
		String hql = "from Plan";
		List<Plan> list =getHibernateTemplate().find(hql);
		return (ArrayList<Plan>) list;
	}

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}
}
