package com.ynwi.ssh.action;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.forms.UserForm;
import com.ynwi.ssh.service.UserManager;

public class CheckAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private UserForm user;

	private UserManager userManager;

	public UserForm getUser() {
		return user;
	}

	public void setUser(UserForm user) {
		this.user = user;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String execute() {
		try {
			ArrayList<User> userlist = userManager.checkUser(user);
			System.out.println(userlist.size());
			if(userlist.size()>0){
				User loginuser = (User)userlist.get(0);
				if(loginuser.getType().equals("M")){
					Map session = ActionContext.getContext().getSession();
					session.put("user", (User)userlist.get(0));
					System.out.println("Login Success");
					return SUCCESS;
				}else{
					Map session = ActionContext.getContext().getSession();
					session.put("user", (User)userlist.get(0));
					System.out.println("Login Success");
					return "success2";
				}
			}else{
				return ERROR;
			}
			

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
