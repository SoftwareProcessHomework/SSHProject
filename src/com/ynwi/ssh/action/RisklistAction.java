package com.ynwi.ssh.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.service.RiskManager;
import com.ynwi.ssh.service.UserManager;

public class RisklistAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String begintime;
	private String endtime;
	private RiskManager riskmanager;
	
	

	public String getBegintime() {
		return begintime;
	}

	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public RiskManager getRiskmanager() {
		return riskmanager;
	}

	public void setRiskmanager(RiskManager riskmanager) {
		this.riskmanager = riskmanager;
	}
	
	public String execute() {
		try {
			Map request  = (Map)ActionContext.getContext().get("request");
			ArrayList<Risk> risklist = riskmanager.getrisklist();
			
			if(begintime == null||begintime.equals("")){
				begintime = "1970-11-11";
			}
			if(endtime == null||endtime.equals("")){
				endtime = "2030-11-11";
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
			Date begindate = sdf.parse(begintime); 
			Date enddate = sdf.parse(endtime);
			System.out.println(begintime);
			System.out.println(endtime);
			
			ArrayList<Risk> templist = new ArrayList<Risk>();
			for(int i=0;i<risklist.size();i++){
				Date createtime = risklist.get(i).getCreatetime();
				if(createtime.getTime()>=begindate.getTime()&&createtime.getTime()<=enddate.getTime()){
					templist.add(risklist.get(i));
				}
			}
			System.out.println("ShowRisks");
			request.put("risklist",templist);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
