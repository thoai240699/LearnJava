/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_qlnv_inherit;

import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class CongTy implements InterfaceCT{

    String tenCongTy;
    ArrayList<NhanVien> ds;

    public CongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
        this.ds = new ArrayList<>();
    }

    //Khoi tao du lieu cac nhan vien
        @Override
    public int initDSNV() {
            this.ds.add(new NVVP(123, "NVVP 1111", 4000));
            this.ds.add(new NVBH(124, "NVBH 2222", 5000));
            this.ds.add(new NVVP(125, "NVVP 3333", 4000));
            this.ds.add(new NVBH(126, "NVVP 4444", 4000));
            return this.ds.size();
    }
    public int initDSNV(ArrayList<NhanVien> ds) {
            ds.addAll(ds);
            return ds.size();
    }

    //in danh sach nhan vien
    public void printDS() {
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }
    //Tinh luong cac nhan vien
    void tinhLuongHT() {
//        for (Object nv : ds) {
//            if (nv instanceof NVBH) {
//                ((NVBH) nv).tinhLuong();
//            } else {
//                ((NVVP) nv).tinhLuong();
//            }
//Polymorphism
        for (NhanVien nv : ds) {
            nv.tinhLuong();
        }
    }
//
    
    @Override
    public Object timTheoMaNV(int maNV) {
        for (NhanVien nv : ds) {
               if(nv.getMaNV()==maNV)
                   return nv;
        }
        return null;
    }
//
//    public Object timTheoLuongMax() {
//        if (ds.isEmpty()) 
//            return null;
//        
//        NVVP maxNVVP = null;
//        NVBH maxNVBH = null;
//
//        for (Object nv : ds) {
//            if (nv instanceof NVVP) {
//                NVVP nvvp = (NVVP) nv;
//                if (maxNVVP == null || nvvp.getLuongHT() > maxNVVP.getLuongHT()) {
//                    maxNVVP = nvvp;
//                }
//            } else if (nv instanceof NVBH) {
//                NVBH nvbh = (NVBH) nv;
//                if (maxNVBH == null || nvbh.getLuongHT() > maxNVBH.getLuongHT()) {
//                    maxNVBH = nvbh;
//                }
//            }
//        }
    //        // So sánh giữa maxNVVP và maxNVBH để tìm người có lương cao nhất
//        if (maxNVVP == null) {
//            return maxNVBH;
//        }
//        if (maxNVBH == null) {
//            return maxNVVP;
//        }
//
//        return (maxNVVP.getLuongHT() > maxNVBH.getLuongHT()) ? maxNVVP : maxNVBH;
//    }
    @Override
    public NhanVien timTheoLuongMax() {
            if(ds.isEmpty())
                return null;
            NhanVien maxNV=ds.get(0);
            for(NhanVien nv:ds)
                if(nv.luongHT > maxNV.luongHT)
                    maxNV=nv;
        return maxNV;
    }

//    public Object timTheoLuongMin(){
//         if (ds.isEmpty()) 
//            return null;
//         NVBH minNVBH=null;
//         for (Object nv : ds) {
//            if (nv instanceof NVBH) {
//            NVBH nvbh = (NVBH) nv;
//            if (minNVBH == null || nvbh.getLuongHT() < minNVBH.getLuongHT()) 
//                minNVBH = nvbh;
//        }
//         
//    }
//         return minNVBH;
//         
//    }
//




  



}
