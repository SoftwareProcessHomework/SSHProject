package com.ynwi.ssh.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Risk;

public interface RiskDao {
	public void saveObject(Object obj) throws HibernateException;

	public void updateObject(Risk obj)throws HibernateException;
	
	public ArrayList<Risk> getrisklist()throws HibernateException; 
	public Risk getrisk(int id)throws HibernateException; 
	
}
