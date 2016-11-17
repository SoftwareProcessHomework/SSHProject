package com.ynwi.ssh.action;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.beans.Riskandplan;
import com.ynwi.ssh.service.RiskManager;

public class AddRiskAndPlanAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private RiskManager riskmanager;
	private String planid;
	private String riskid;
	public RiskManager getRiskmanager() {
		return riskmanager;
	}
	public void setRiskmanager(RiskManager riskmanager) {
		this.riskmanager = riskmanager;
	}
	public String getPlanid() {
		return planid;
	}
	public void setPlanid(String planid) {
		this.planid = planid;
	}
	public String getRiskid() {
		return riskid;
	}
	public void setRiskid(String riskid) {
		this.riskid = riskid;
	}
	
	public String execute() {
		try {
			System.out.println("add risk and plan:"+planid+"  "+riskid);
			riskmanager.createriskandplanrelation(riskid, planid);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
