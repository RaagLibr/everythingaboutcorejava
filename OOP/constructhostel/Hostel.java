package com.enfy.constructhostel;

public class Hostel {
	int hostelid;
	String hname;
	String hostel_loc;
	int hostel_no;

	public Hostel(int hostelid, String hname, String hostel_loc, int hostel_no) {
		super();
		this.hostelid = hostelid;
		this.hname = hname;
		this.hostel_loc = hostel_loc;
		this.hostel_no = hostel_no;
	}

	@Override
	public String toString() {
		return "Hostel [hostelid=" + hostelid + ", hname=" + hname + ", hostel_loc=" + hostel_loc + ", hostel_no="
				+ hostel_no + "]";
	}
	

}
