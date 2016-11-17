package com.ynwi.ssh.action;

import java.util.ArrayList;
import java.util.Map;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.beans.Riskandplan;
import com.ynwi.ssh.service.PlanManager;
import com.ynwi.ssh.service.RiskManager;

public class PlanDetailAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private RiskManager riskmanager;
	private String planid;
	private String planname;
	
	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public String getPlanid() {
		return planid;
	}

	public void setPlanid(String planid) {
		this.planid = planid;
	}

	public RiskManager getRiskmanager() {
		return riskmanager;
	}

	public void setRiskmanager(RiskManager riskmanager) {
		this.riskmanager = riskmanager;
	}

	public String execute() {
		try {
			System.out.println("Plan detail");
			Map request  = (Map)ActionContext.getContext().get("request");
			ArrayList<Risk> re=new ArrayList<Risk>();
			ArrayList<Risk> risk = riskmanager.getrisklist();
			ArrayList<Riskandplan> rap=riskmanager.getriskandplanlist();
			for(Riskandplan i : rap){
				if(i.getPlanid().equals(planid)){
					System.out.println(i.getRiskid());
					for(Risk j:risk){
						if(j.getRiskid()==Integer.parseInt(i.getRiskid()))
							re.add(j);
					}
				}
			}
			request.put("risklist",re);
			request.put("planid",planid);
			request.put("planname", planname);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
