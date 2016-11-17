package com.ynwi.ssh.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.service.RiskManager;

public class RiskUpdAction2 extends ActionSupport{


	private static final long serialVersionUID = 1L;

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
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
			//getSession().
			System.out.println("Update Risk");
			Risk temp = riskmanager.getrisk(risk.getRiskid());
			System.out.println(temp.getRiskid());
			risk.setCreatetime(temp.getCreatetime());
			risk.setSpoorer(temp.getSpoorer());
			risk.setSubmitter(temp.getSubmitter());
			if(risk.getIsidentify()==1){
				risk.setIsidentify(temp.getIsidentify()+1);
			}
			if(risk.getIsissue()==1){
				risk.setIsissue(temp.getIsissue()+1);
			}
			
			riskmanager.update(risk);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
