
create database qlnv;

CREATE TABLE NhanVien (
    MaNhanVien VARCHAR(255) PRIMARY KEY,
    HoTen NVARCHAR(255) NOT NULL,
    LuongCoBan DECIMAL(10, 2) NOT NULL
);

CREATE TABLE ChamCongTongHop (
    MaNhanVien VARCHAR(255),
    LoaiNhanVien NVARCHAR(255),
    SoNgayLam INT,
    SoSanPham INT,
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);

INSERT INTO NhanVien (MaNhanVien, HoTen, LuongCoBan) VALUES
('NV01', N'Nguyễn Văn An', 10000000),
('NV02', N'Trần Thị Bảo', 12000000),
('NV03', N'Lê Văn Cảnh', 11000000),
('NV04', N'Phạm Thị Đào', 11500000),
('NV05', N'Hoàng Văn Em', 10500000),
('NV06', N'Vũ Thị Gia', 11800000),
('NV07', N'Đỗ Minh Hiếu', 10200000),
('NV08', N'Bùi Ngọc Kiên', 12300000),
('NV09', N'Đinh Tiến Luân', 11100000),
('NV10', N'Mai Phương Mai', 11900000),
('NV11', N'Ngô Quang Nam', 11400000),
('NV12', N'Lê Thị Oanh', 10800000),
('NV13', N'Phan Văn Phú', 10600000),
('NV14', N'Trần Quốc Quân', 11200000),
('NV15', N'Hoàng Đình Sơn', 10300000),
('NV16', N'Nguyễn Minh Tâm', 11700000),
('NV17', N'Vũ Thị Uyên', 10900000),
('NV18', N'Phạm Văn Vũ', 10700000),
('NV19', N'Đặng Thị Xuân', 11300000),
('NV20', N'Bùi Thanh Yên', 10400000);


INSERT INTO ChamCongTongHop (MaNhanVien, LoaiNhanVien, SoNgayLam, SoSanPham) VALUES
('NV01', N'Bán Hàng', 22, 150),
('NV02', N'Văn Phòng', 20, 0),
('NV03', N'Không Loại', 18, 0),
('NV04', N'Bán Hàng', 25, 165),
('NV05', N'Văn Phòng', 21, 0),
('NV06', N'Bán Hàng', 23, 140),
('NV07', N'Không Loại', 17, 0),
('NV08', N'Văn Phòng', 19, 0),
('NV09', N'Bán Hàng', 26, 180),
('NV10', N'Không Loại', 20, 0),
('NV11', N'Bán Hàng', 24, 130),
('NV12', N'Văn Phòng', 22, 0),
('NV13', N'Không Loại', 21, 0),
('NV14', N'Bán Hàng', 27, 190),
('NV15', N'Văn Phòng', 23, 0),
('NV16', N'Không Loại', 19, 0),
('NV17', N'Bán Hàng', 28, 200),
('NV18', N'Văn Phòng', 18, 0),
('NV19', N'Không Loại', 20, 0),
('NV20', N'Bán Hàng', 22, 160);
ALTER TABLE NhanVien
ADD LuongHT DECIMAL(10, 2);