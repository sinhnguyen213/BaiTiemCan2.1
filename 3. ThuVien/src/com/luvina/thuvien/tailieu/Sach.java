package com.luvina.thuvien.tailieu;

public class Sach extends TaiLieu {

	// thuoc tinh
	private String tenTacGia;
	private int soTrang;

	// phuongw thuc
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	// in thong tin
	@Override
	public void inTT() {
		super.inTT();
		System.out.println("_" + tenTacGia + "_" + soTrang);
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

}
