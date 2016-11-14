package com.ynwi.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.service.RiskManager;

public class RiskUpdAction extends ActionSupport{


	private static final long serialVersionUID = 1L;

	private Risk risk;
	private RiskManager riskmanager;
	public Risk getRisk() {
		return risk;
	}
	public void setRisk(Risk risk) {
		this.risk = risk;
	}
	public RiskManager getRiskmanager() {
		return riskmanager;
	}
	public void setRiskmanager(RiskManager riskmanager) {
		this.riskmanager = riskmanager;
	}
	public String execute() {
		try {
			
			risk = riskmanager.getrisk(risk.getRiskid());
			System.out.println("Findsuccess"+risk.getRiskid());
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
