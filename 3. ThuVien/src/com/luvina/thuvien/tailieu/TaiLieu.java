package com.luvina.thuvien.tailieu;

public class TaiLieu {
	// thuoc tinh
	protected String maTaiLieu;
	protected String tenNXB;
	protected int soBanPhatHanh;

	// phuong thuc khoi tao
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	// in thong tin
	public void inTT() {
		System.out.print(maTaiLieu + "_" + tenNXB + "_" + soBanPhatHanh + "_");
	}

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

}
