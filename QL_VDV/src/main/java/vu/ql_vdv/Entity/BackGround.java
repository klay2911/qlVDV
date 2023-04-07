package vu.ql_vdv.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name ="background")
public class BackGround implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idBackGround",unique = true, nullable = false)
    private Integer IDBackGround;
    @Column(name="MaVDV")
    private long maVDV;
    @Column(name="MonThiDau")
    private String monThiDau;
    @Column(name="HoTen")
    private String hoTen;

    @Column(name="GioiTinh")
    private String gioiTinh;

    @Column(name="ThoiGianTapLuyen")
    private Time thoiGianTapLuyen;

    @Column(name="TuyenVDV")
    private String tuyenVDV;

    @Column(name="HLVPhuTrach")
    private String hlvPhuTrach;

    @Column(name="DangCapVDV")
    private String dangCapVDV;

    public BackGround() {
    }

    public BackGround(Integer IDBackGround,long maVDV, String hoTen, String gioiTinh, Time thoiGianTapLuyen, String monThiDau, String tuyenVDV, String hlvPhuTrach, String dangCapVDV) {
        this.IDBackGround = IDBackGround;
        this.maVDV = maVDV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.thoiGianTapLuyen = thoiGianTapLuyen;
        this.monThiDau = monThiDau;
        this.tuyenVDV = tuyenVDV;
        this.hlvPhuTrach = hlvPhuTrach;
        this.dangCapVDV = dangCapVDV;
    }

    public Integer getIDBackGround() {
        return IDBackGround;
    }

    public void setIDBackGround(Integer IDBackGround) {
        this.IDBackGround = IDBackGround;
    }

    public long getMaVDV() {
        return maVDV;
    }

    public void setMaVDV(long maVDV) {
        this.maVDV = maVDV;
    }

    public String getMonThiDau() {
        return monThiDau;
    }

    public void setMonThiDau(String monThiDau) {
        this.monThiDau = monThiDau;
    }

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

    @Override
    public String toString() {
        return "BackGround{" +
                "IDBackGround=" + IDBackGround +
                ", maVDV=" + maVDV +
                ", monThiDau='" + monThiDau + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", thoiGianTapLuyen=" + thoiGianTapLuyen +
                ", tuyenVDV='" + tuyenVDV + '\'' +
                ", hlvPhuTrach='" + hlvPhuTrach + '\'' +
                ", dangCapVDV='" + dangCapVDV + '\'' +
                '}';
    }
}
