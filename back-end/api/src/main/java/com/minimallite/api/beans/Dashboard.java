package com.minimallite.api.beans;

public class Dashboard {
	
	private int userId;
	private int newUser;
	private int invoices;
	private int openIssues;
	private int newProjects;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getNewUser() {
		return newUser;
	}
	public void setNewUser(int newUser) {
		this.newUser = newUser;
	}
	public int getInvoices() {
		return invoices;
	}
	public void setInvoices(int invoices) {
		this.invoices = invoices;
	}
	public int getOpenIssues() {
		return openIssues;
	}
	public void setOpenIssues(int openIssues) {
		this.openIssues = openIssues;
	}
	public int getNewProjects() {
		return newProjects;
	}
	public void setNewProjects(int newProjects) {
		this.newProjects = newProjects;
	}
	
}
