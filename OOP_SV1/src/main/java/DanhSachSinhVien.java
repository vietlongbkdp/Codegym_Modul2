import sun.misc.SignalHandler;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> dsSinhVien;
    public DanhSachSinhVien(){
        this.dsSinhVien = new ArrayList<SinhVien>();
    }
    public DanhSachSinhVien(ArrayList<SinhVien> dsSinhVien){
        this.dsSinhVien = dsSinhVien;
    }
    public void addSinhVien(SinhVien sv){
        this.dsSinhVien.add(sv);
    }
    public void inDSSinhVien(){
        for (SinhVien sv:dsSinhVien) {
            System.out.println(sv.toString());
        }
    }
    public boolean kiemTraDanhSachRong(){
        if(this.dsSinhVien.size() <= 0){
            return true ;
        }else return false;
    }
    public int kiemTraSoLuongPhanTu(){
        return this.dsSinhVien.size();
    }
//    public void inDSSinhVien(){
//        for(int i = 0; i< dsSinhVien.size(); i++){
//            System.out.println(dsSinhVien.get(i));
//        }
//    }
}
