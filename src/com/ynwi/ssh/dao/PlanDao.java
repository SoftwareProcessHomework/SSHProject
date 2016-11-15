package com.ynwi.ssh.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Plan;

public interface PlanDao {
	public ArrayList<Plan> getplanlist()throws HibernateException; 
	public void saveObject(Object obj) throws HibernateException;
}
