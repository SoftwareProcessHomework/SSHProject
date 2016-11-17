package com.ynwi.ssh.action;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.service.RiskManager;
import com.ynwi.ssh.service.UserManager;

public class AllRiskAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private RiskManager riskmanager;
	
	

	public RiskManager getRiskmanager() {
		return riskmanager;
	}

	public void setRiskmanager(RiskManager riskmanager) {
		this.riskmanager = riskmanager;
	}
	
	public String execute() {
		try {
			Map request  = (Map)ActionContext.getContext().get("request");
			Map session = ActionContext.getContext().getSession();
			User user = (User) session.get("user");
			if(user.getType().equals("M")){
				request.put("risklist", riskmanager.getrisklist());
			}else{
				ArrayList<Risk> rlist = riskmanager.getrisklist();
				ArrayList<Risk> templist = new ArrayList<Risk>();
				for(int i = 0;i<rlist.size();i++){
					if(rlist.get(i).getSpoorer().equals(user.getUsername())){
						templist.add(rlist.get(i));
					}
				}
				request.put("risklist", templist);
			}
			
			System.out.println("ShowRisks");
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
