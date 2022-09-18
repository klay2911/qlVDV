package database;

import java.sql.Time;

public class BackGround {
    public BackGround(String monThiDau,long maVDV, String hoTen, String gioiTinh, Time thoiGianTapLuyen, String tuyenVDV, String hlvPhuTrach, String dangCapVDV ) {
        this.monThiDau = monThiDau;
        this.maVDV = maVDV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.thoiGianTapLuyen = thoiGianTapLuyen;
        this.tuyenVDV = tuyenVDV;
        this.hlvPhuTrach = hlvPhuTrach;
        this.dangCapVDV = dangCapVDV;
    }

    private String monThiDau;
    private long maVDV;
    private String hoTen;
    private String gioiTinh;
    private Time thoiGianTapLuyen;
    private String tuyenVDV;
    private String hlvPhuTrach;
    private String dangCapVDV;

    public String getMonThiDau() {
        return monThiDau;
    }

    public void setMonThiDau(String monThiDau) {
        this.monThiDau = monThiDau;
    }

    public long getMaVDV() {return maVDV;}

    public void setMaVDV(long maVDV) {this.maVDV = maVDV;}

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Time getThoiGianTapLuyen() {
        return thoiGianTapLuyen;
    }

    public void setThoiGianTapLuyen(Time thoiGianTapLuyen) {
        this.thoiGianTapLuyen = thoiGianTapLuyen;
    }

    public String getTuyenVDV() {
        return tuyenVDV;
    }

    public void setTuyenVDV(String tuyenVDV) {
        this.tuyenVDV = tuyenVDV;
    }

    public String getHlvPhuTrach() {
        return hlvPhuTrach;
    }

    public void setHlvPhuTrach(String hlvPhuTrach) {
        this.hlvPhuTrach = hlvPhuTrach;
    }

    public String getDangCapVDV() {
        return dangCapVDV;
    }

    public void setDangCapVDV(String dangCapVDV) {
        this.dangCapVDV = dangCapVDV;
    }
}
