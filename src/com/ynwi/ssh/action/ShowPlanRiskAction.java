package com.ynwi.ssh.action;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.beans.Riskandplan;
import com.ynwi.ssh.service.RiskManager;

public class ShowPlanRiskAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private RiskManager riskmanager;
	private String planid;
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
	
	public String execute() {
		try {
			ArrayList<Risk> risklist=riskmanager.getrisklist();
			ArrayList<Riskandplan> rap=riskmanager.getriskandplanlist();
			ArrayList<Risk> re=new ArrayList<Risk>();
			for(Riskandplan i : rap){
				if(i.getPlanid().equals(planid)){
					for(Risk j:risklist){
						if(j.getRiskid()==Integer.parseInt(i.getRiskid()))
							re.add(j);
					}
				}
			}
			ArrayList<Risk> result=new ArrayList<Risk>();
			for(Risk i:risklist){
				if(!re.contains(i))
					result.add(i);
			}
			System.out.println("Planid1 :"+planid);
			Map request  = (Map)ActionContext.getContext().get("request");
			request.put("risklist",result);
			request.put("planid", planid);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
