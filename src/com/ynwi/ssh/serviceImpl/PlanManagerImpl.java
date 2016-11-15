package com.ynwi.ssh.serviceImpl;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.ynwi.ssh.beans.Plan;
import com.ynwi.ssh.dao.PlanDao;
import com.ynwi.ssh.forms.PlanForm;
import com.ynwi.ssh.service.PlanManager;

public class PlanManagerImpl implements PlanManager{
	private PlanDao dao;

	public PlanDao getDao() {
		return dao;
	}

	public void setDao(PlanDao dao) {
		this.dao = dao;
	}

	@Override
	public ArrayList<Plan> getplanlist() throws HibernateException {
		return dao.getplanlist();
	}

	@Override
	public void create(PlanForm form) throws HibernateException {
		Plan plan=new Plan();
		BeanUtils.copyProperties(form, plan);
		plan.setUserid("4");
		dao.saveObject(plan);
	}

}
