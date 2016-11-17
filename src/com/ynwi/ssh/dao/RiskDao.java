package com.ynwi.ssh.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.beans.Riskandplan;

public interface RiskDao {
	public void saveObject(Object obj) throws HibernateException;

	public void updateObject(Risk obj)throws HibernateException;
	
	public ArrayList<Risk> getrisklist()throws HibernateException; 
	public Risk getrisk(int id)throws HibernateException; 
	public void deleteObject(Object obj)throws HibernateException; 
	public ArrayList<Riskandplan> getriskandplan()throws HibernateException; 
}
