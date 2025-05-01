/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong7_oop_qlnv;

import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class CongTy {

    String tenCongTy;
    ArrayList<Object> ds;

    public CongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
        this.ds = new ArrayList<>();
    }

    //Khoi tao du lieu cac nhan vien
    public void initDSNV(ArrayList<Object> ds) {
        if (ds == null) {
            this.ds.add(new NVVP(123, "NVVP 1", 4000));
            this.ds.add(new NVBH(124, "NVBH 2", 5000));
            this.ds.add(new NVVP(125, "NVVP 3", 4000));
            this.ds.add(new NVBH(126, "NVVP 4", 4000));

        } else {
            ds.addAll(ds);
        }

    }

    //in danh sach nhan vien
    public void printDS() {
        for (Object nv : ds) {
            System.out.println(nv);
        }
    }
    //Tinh luong cac nhan vien

    void tinhLuongHT() {

        for (Object nv : ds) {
            if (nv instanceof NVBH) {
                ((NVBH) nv).tinhLuong();
            } else {
                ((NVVP) nv).tinhLuong();
            }
        }
    }

    public Object timTheoMaNV(int maNV) {
        for (Object nv : ds) {
            if (nv instanceof NVVP && ((NVVP) nv).maNV == maNV) {
                return nv;
            }
            if (nv instanceof NVBH && ((NVBH) nv).maNV == maNV) {
                return nv;
            }
        }
        return null;
    }

    public Object timTheoLuongMax() {
        if (ds.isEmpty()) 
            return null;
        
        NVVP maxNVVP = null;
        NVBH maxNVBH = null;

        for (Object nv : ds) {
            if (nv instanceof NVVP) {
                NVVP nvvp = (NVVP) nv;
                if (maxNVVP == null || nvvp.getLuongHT() > maxNVVP.getLuongHT()) {
                    maxNVVP = nvvp;
                }
            } else if (nv instanceof NVBH) {
                NVBH nvbh = (NVBH) nv;
                if (maxNVBH == null || nvbh.getLuongHT() > maxNVBH.getLuongHT()) {
                    maxNVBH = nvbh;
                }
            }
        }

        // So sánh giữa maxNVVP và maxNVBH để tìm người có lương cao nhất
        if (maxNVVP == null) {
            return maxNVBH;
        }
        if (maxNVBH == null) {
            return maxNVVP;
        }

        return (maxNVVP.getLuongHT() > maxNVBH.getLuongHT()) ? maxNVVP : maxNVBH;
    }
    public Object timTheoLuongMin(){
         if (ds.isEmpty()) 
            return null;
         NVBH minNVBH=null;
         for (Object nv : ds) {
            if (nv instanceof NVBH) {
            NVBH nvbh = (NVBH) nv;
            if (minNVBH == null || nvbh.getLuongHT() < minNVBH.getLuongHT()) 
                minNVBH = nvbh;
        }
         
    }
         return minNVBH;
         
    }

}
