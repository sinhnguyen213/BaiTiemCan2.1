package com.luvina.thuvien.quanly;

import java.util.ArrayList;

import com.luvina.thuvien.tailieu.Bao;
import com.luvina.thuvien.tailieu.LoaiTaiLieu;
import com.luvina.thuvien.tailieu.Sach;
import com.luvina.thuvien.tailieu.TaiLieu;
import com.luvina.thuvien.tailieu.TapChi;

public class QuanLySach {
	//thuoc tinh
    private ArrayList<TaiLieu> dsTaiLieu;
    private LoaiTaiLieu loaiTaiLieu;

    //phương thức khởi tạo
    public QuanLySach() {
        dsTaiLieu = new ArrayList<TaiLieu>();
    }
    //nhập thông tin về các tài liệu
    public void add(TaiLieu taiLieu){
        dsTaiLieu.add(taiLieu);
    }
    
    //hiển thị thông tin về các tài liệu
    public void inTT() {
        for (int i = 0; i < dsTaiLieu.size(); i++) {
            TaiLieu taiLieu = dsTaiLieu.get(i);
            taiLieu.inTT();
        }
    }

    //tìm kiếm tài liệu theo loại
    public ArrayList<TaiLieu> timTaiLieu(LoaiTaiLieu loaiTaiLieu) {
        ArrayList<TaiLieu> list = new ArrayList<>();
        switch (loaiTaiLieu){
            case SACH:
                for(TaiLieu tl: dsTaiLieu){
                    if(tl instanceof Sach){
                        tl.inTT();
                        list.add(tl);
                    }
                }
                break;
            case TAPCHI:
                for(TaiLieu tl: dsTaiLieu){
                    if(tl instanceof TapChi){
                        tl.inTT();
                        list.add(tl);
                    }
                }
                break;
            case BAO:
                for(TaiLieu tl: dsTaiLieu){
                    if(tl instanceof Bao){
                        tl.inTT();
                        list.add(tl);
                    }
                }
                break;
            default:
                System.out.println("Kiểm tra lại loại tài liệu");
        }
       
        return list;
    }
}
