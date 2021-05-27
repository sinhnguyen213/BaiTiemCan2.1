package com.luvina.thuvien.tailieu;

import java.util.Date;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh;
	private Date thangPhatHanh;

	// phuong thuc khoi tao
	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, Date thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	// in thong tin
	@Override
	public void inTT() {
		super.inTT();
		System.out.println("_" + soPhatHanh + "_" + thangPhatHanh);
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public Date getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(Date thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

}
