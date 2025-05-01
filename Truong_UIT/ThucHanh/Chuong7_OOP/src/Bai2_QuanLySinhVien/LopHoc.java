/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_QuanLySinhVien;

import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class LopHoc {

    String tenLopHoc;
    public ArrayList<SinhVien> ds;

    public LopHoc() {
    }

    public LopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
        this.ds = new ArrayList<>();
    }

    int initDSSV(ArrayList<SinhVien> ds) {
        if(ds==null){
        this.ds.add(new SinhVien(123, "Tran Van B", 0));
        this.ds.add(new SinhVien(124, "Tran Van C", 4));
        this.ds.add(new SinhVien(125, "Tran Van D", 7));
        }
        else this.ds.addAll(ds);
        return this.ds.size();

    }
    public void printDSSV()
    {
        for(SinhVien sv: ds)
            //sv.printSV();
            System.out.print(sv);
    
    }
    
        public void xepLoaiDSSV()
    {
        for(SinhVien sv:ds)
                sv.xepLoaiSV();
    }
        public void diemMax()
        {
            
            double diemMaxSV=0;
            for(SinhVien sv:ds)
                if(sv.diemTB>diemMaxSV)
                    diemMaxSV=sv.diemTB;
            System.out.print("Diem TB lon nhat la "+diemMaxSV);
        }
    
}
