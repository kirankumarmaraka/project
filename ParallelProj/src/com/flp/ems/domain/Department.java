package com.flp.ems.domain;

public class Department {
	private int deptid;
	private String deptName;
	
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptName=" + deptName + "]";
	}
	

}
