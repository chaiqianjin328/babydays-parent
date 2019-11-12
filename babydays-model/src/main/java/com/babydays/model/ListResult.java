package com.babydays.model;

import java.io.Serializable;
import java.util.List;


public class ListResult implements Serializable {

    private static final long serialVersionUID = -4552122438101563329L;

    private int total;
	
	private List list;
	

	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	
	
	
	
}
