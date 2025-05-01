package QLNV_MVC;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author IT
 */
public class Controller {

    public View v;
    public Model m;

    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;

        this.v.btnXemActionListener((ActionEvent e) -> {
            try {
                ArrayList<Object[]> data = m.getNhanVienData();
                if (data.isEmpty()) {
                    v.showMessage("Không có dữ liệu để hiển thị.");
                } else {
                    v.setTableNV(data);
                }
            } catch (Exception ex) {
                v.showMessage("Lỗi khi tải dữ liệu: " + ex.getMessage());
            }
        });
        this.v.setVisible(true);

        this.v.btnCapNhatActionListener((ActionEvent e) -> {
            int selectedRow = v.getSelectedTableRow();
            if (selectedRow == -1) {
                v.showMessage("Vui lòng chọn một dòng để cập nhật");
                return;
            }
            try {
                int maNV = v.getTextMSNV();
                String hoTen = v.getTextHoTen();
                String loaiNV = v.getTextLoaiNV();
                double luongCB = v.getTextLuongCB();
                double luongHT = v.getTextLuongHT();
                v.updateTableRow(selectedRow, new Object[]{maNV, hoTen, loaiNV, luongCB, luongHT});
            } catch (Exception ex) {
                v.showMessage("Lỗi định dạng dữ liệu Vui lòng kiểm tra lại.");
            }
        });
        this.v.btnThemActionListener((ActionEvent e) -> {
            try {
                int maNV = v.getTextMSNV();
                String hoTen = v.getTextHoTen();
                String loaiNV = v.getTextLoaiNV();
                double luongCB = v.getTextLuongCB();
                double luongHT = v.getTextLuongHT();

                Object[] row = {maNV, hoTen, loaiNV, luongCB, luongHT};
                v.addTableRow(row);
            } catch (Exception ex) {
                v.showMessage("Lỗi định dạng dữ liệu Vui lòng kiểm tra lại.");
            }
        });

        this.v.btnXoaActionListener((ActionEvent e) -> {
            int selectedRow = v.getSelectedTableRow();

            if (selectedRow == -1) {
                v.showMessage("Vui lòng chọn một dòng để xóa");
                return;
            }

            v.removeTableRow(selectedRow);
        });

        this.v.btnTinhLuongActionListener((ActionEvent e) -> {
                m.calculateAndSaveLuongHT(); 
                ArrayList<Object[]> data = m.getNhanVienData();
                v.setTableNV(data);
        });
    }
}
