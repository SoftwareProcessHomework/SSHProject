package com.ynwi.ssh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.beans.Riskandplan;
import com.ynwi.ssh.service.RiskManager;

public class RiskandplanAction extends ActionSupport{


	private static final long serialVersionUID = 1L;

	private Riskandplan riskandplan;
	private RiskManager riskmanager;
	
	public RiskManager getRiskmanager() {
		return riskmanager;
	}
	public void setRiskmanager(RiskManager riskmanager) {
		this.riskmanager = riskmanager;
	}
	
	public Riskandplan getRiskandplan() {
		return riskandplan;
	}
	public void setRiskandplan(Riskandplan riskandplan) {
		this.riskandplan = riskandplan;
	}
	public String execute() {
		try {
			
			
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
