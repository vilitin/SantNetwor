package com.santvalentin.socialnetwork.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	@Override
	public void validate() {
	
	}
	@Override
	public String execute( ) {
		
		System.out.println("Login Action"); //Потом удалить строчку надо
		
		return SUCCESS;
	}
}
