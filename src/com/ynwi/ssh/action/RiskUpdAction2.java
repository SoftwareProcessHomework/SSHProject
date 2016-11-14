package com.ynwi.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.service.RiskManager;

public class RiskUpdAction2 extends ActionSupport{


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
			System.out.println("Update Risk");
			System.out.println(risk.getRiskid());
			System.out.println(riskmanager);
			Risk temp = riskmanager.getrisk(risk.getRiskid());
			System.out.println(temp.getCreatetime());
			System.out.println(risk);
			risk.setCreatetime(temp.getCreatetime());
			risk.setSpoorer(temp.getSpoorer());
			risk.setSubmitter(temp.getSubmitter());
			
			
			riskmanager.update(risk);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
