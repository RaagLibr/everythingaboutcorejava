package com.enfy.constructpropery;

public class RealEstate {
	int proid;
	String pro_type;
	String pro_loc;
	int pro_no;
	
	
	

	public RealEstate(int proid, String pro_type, String pro_loc, int pro_no) {
		super();
		this.proid = proid;
		this.pro_type = pro_type;
		this.pro_loc = pro_loc;
		this.pro_no = pro_no;
	}
	
	
	@Override
	public String toString() {
		return "RealEstate [proid=" + proid + ", pro_type=" + pro_type + ", pro_loc=" + pro_loc + ", pro_no=" + pro_no
				+ "]";
	}

	
	
	
}
