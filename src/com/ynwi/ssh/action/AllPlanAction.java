package com.ynwi.ssh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.service.PlanManager;

public class AllPlanAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private PlanManager planmanager;
	
	
	public PlanManager getPlanmanager() {
		return planmanager;
	}


	public void setPlanmanager(PlanManager planmanager) {
		this.planmanager = planmanager;
	}


	public String execute(){
		try {
			Map request  = (Map)ActionContext.getContext().get("request");
			request.put("planlist", planmanager.getplanlist());
			System.out.println("ShowRisks");
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
