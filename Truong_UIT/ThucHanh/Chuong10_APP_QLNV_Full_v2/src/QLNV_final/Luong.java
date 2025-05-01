/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV_final;

import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class Luong implements InterfaceCT {

    public ArrayList<NhanVien> ds;

    public Luong() {
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

    public ArrayList<Object[]> getTableData() {
        ArrayList<Object[]> tableData = new ArrayList<>();

        for (NhanVien nv : ds) {
            Object[] row = {
                nv.getMaNV(),
                nv.getHoTen(),
                nv instanceof NVVP ? "NVVP" : (nv instanceof NVBH ? "NVBH" : "Không rõ"),
                nv.getLuongCB(),
                nv.getLuongHT()
            };
            tableData.add(row);
        }
        return tableData;
    }
    //in danh sach nhan vien

    public void printDS() {
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }

    //Tinh luong cac nhan vien
    public void tinhLuongHT() {
        for (NhanVien nv : ds) {
            nv.tinhLuong();
        }
    }
public void tinhLuongHT(int maNV) {
    for (NhanVien nv : ds) {
        if (nv.getMaNV() == maNV) {
            nv.tinhLuong();
            break;
        }
    }
}

    @Override
    public Object timTheoMaNV(int maNV) {
        for (NhanVien nv : ds) {
            if (nv.getMaNV() == maNV) {
                return nv;
            }
        }
        return null;
    }

    @Override
    public NhanVien timTheoLuongMax() {
        if (ds.isEmpty()) {
            return null;
        }
        NhanVien maxNV = ds.get(0);
        for (NhanVien nv : ds) {
            if (nv.luongHT > maxNV.luongHT) {
                maxNV = nv;
            }
        }
        return maxNV;
    }

}
