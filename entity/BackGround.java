package entity;

import java.sql.Time;

@Entity
@Table(name ="BackGround")
public class BackGround {
    @monThiDau
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="monThiDau",unique = true, nullable = false)
    private String monThiDau;

    @Column(name="ma_VanDongVien")
    private long maVDV;
    @Column(name="ho_Ten")
    private String hoTen;

    @Column(name="Gioi_Tinh")
    private String gioiTinh;

    @Column(name="ThoiGianTapLuyen")
    private Time thoiGianTapLuyen;



    @Column(name="tuyen_VanDongVien")
    private String tuyenVDV;

    @Column(name="HLV_PhuTrach")
    private String hlvPhuTrach;

    @Column(name="DangCap_VanDongVien")
    private String dangCapVDV;

    public BackGround() {
    }

    public BackGround(String idTL, String hoTen, String gioiTinh, Time thoiGianTapLuyen, String monThiDau, String tuyenVDV, String hlvPhuTrach, String dangCapVDV) {
        this.monThiDau = monThiDau;
        this.maVDV = maVDV
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.thoiGianTapLuyen = thoiGianTapLuyen;
        this.tuyenVDV = tuyenVDV;
        this.hlvPhuTrach = hlvPhuTrach;
        this.dangCapVDV = dangCapVDV;
    }

    public String getMonThiDau() {
        return monThiDau;
    }

    public void setMonThiDau(String monThiDau) {
        this.monThiDau = monThiDau;
    }

    public long getMaVDV() {
        return maVDV;
    }

    public void setMaVDV(long maVDV) {
        this.maVDV = maVDV;
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
                "monThiDau='" + monThiDau + '\'' +
                ", maVDV=" + maVDV +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", thoiGianTapLuyen=" + thoiGianTapLuyen +
                ", tuyenVDV='" + tuyenVDV + '\'' +
                ", hlvPhuTrach='" + hlvPhuTrach + '\'' +
                ", dangCapVDV='" + dangCapVDV + '\'' +
                '}';
    }
}
