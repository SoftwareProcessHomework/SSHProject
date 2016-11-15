package com.ynwi.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.forms.PlanForm;
import com.ynwi.ssh.service.PlanManager;

public class PlanAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private PlanForm plan;
	private PlanManager planmanager;
	public PlanForm getPlan() {
		return plan;
	}
	public void setPlan(PlanForm plan) {
		this.plan = plan;
	}
	public PlanManager getPlanmanager() {
		return planmanager;
	}
	public void setPlanmanager(PlanManager planmanager) {
		this.planmanager = planmanager;
	}
	
	public String execute() {
		try {
			System.out.println("Create Plan");
			planmanager.create(plan);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
