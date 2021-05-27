package com.luvina.thuvien.tailieu;

import java.util.Date;

public class Bao extends TaiLieu {

	// thuoc tinh
	private Date ngayPhatHanh;

	// phuong thuc
	public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, Date ngayPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	// in thong tin
	@Override
	public void inTT() {
		super.inTT();
		System.out.println("_" + ngayPhatHanh);
	}

	public Date getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(Date ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

}
