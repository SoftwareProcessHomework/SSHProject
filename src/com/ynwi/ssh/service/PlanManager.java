package com.ynwi.ssh.service;

import java.util.ArrayList;
import org.hibernate.HibernateException;
import com.ynwi.ssh.beans.Plan;
import com.ynwi.ssh.forms.PlanForm;

public interface PlanManager {
	public ArrayList<Plan> getplanlist()throws HibernateException;
	public void create(PlanForm form)throws HibernateException;
}
