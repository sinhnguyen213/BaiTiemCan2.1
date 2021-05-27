package com.luvina.thuvien.main;

import java.util.ArrayList;
import java.util.Date;

import com.luvina.thuvien.quanly.QuanLySach;
import com.luvina.thuvien.tailieu.Bao;
import com.luvina.thuvien.tailieu.LoaiTaiLieu;
import com.luvina.thuvien.tailieu.Sach;
import com.luvina.thuvien.tailieu.TaiLieu;
import com.luvina.thuvien.tailieu.TapChi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaiLieu sach1 = new Sach("LP01", "NXB Bach Khoa", 200, "Nguyen Van Sinh", 250);
		TaiLieu sach2 = new Sach("LP02", "NXB Bach Khoa", 250, "Nguyen Van Sinh", 200);
		TaiLieu sach3 = new Sach("LP03", "NXB Bach Khoa", 300, "Nguyen Van Sinh", 230);

		TaiLieu tapChi1 = new TapChi("LP04", "NXB Ha Noi", 100, 15, new Date(2021, 01, 15));
		TaiLieu tapChi2 = new TapChi("LP05", "NXB Ha Noi", 150, 16, new Date(2021, 03, 15));
		TaiLieu tapChi3 = new TapChi("LP06", "NXB HaNoi", 180, 17, new Date(2021, 05, 15));

		TaiLieu bao1 = new Bao("bao1", "NXB Kim Dong", 400, new Date((long) 07.15));
		TaiLieu bao2 = new Bao("bao2", "NXB Kim Dong", 450, new Date(9));
		TaiLieu bao3 = new Bao("bao3", "NXB Kim Dong", 500, new Date(11));
		TaiLieu taiLieu = new TaiLieu("S05", "NXB Bon Ba", 100);

		QuanLySach ql = new QuanLySach();
        ql.add(sach1);
        ql.add(sach2);
        ql.add(sach3);
        ql.add(tapChi1);
        ql.add(tapChi2);
        ql.add(tapChi3);
        ql.add(bao1);
        ql.add(bao2);
        ql.add(bao3);
        ql.add(taiLieu);
        
		ql.inTT();
		System.out.println("--------------");
		ArrayList<TaiLieu> list = new ArrayList<>();

		list = ql.timTaiLieu(LoaiTaiLieu.BAO);
		System.out.println("--------------");
		for (TaiLieu tl : list) {
			tl.inTT();
		}
	}

}
