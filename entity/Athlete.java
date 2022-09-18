package entity;

import java.sql.Time;


public class Athlete {
    @maVDV
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ma_van_dong_vien",unique = true, nullable = false)
    private long maVDV;

    @Column(name="ho_Ten")
    private String hoTen;

    @Column(name="gioi_Tinh")
    private String gioiTinh;
    @Column(name="ngay_Sinh")
    private String ngaySinh;

    @Column(name="dien_Thoai")
    private String dienThoai;

    @Column(name="can_cuoc_cong_dan")
    private String cccd;

    @Column(name="dia_Chi")
    private String diaChi;

    @Column(name="id_PhuHuynh")
    private String idPhuHuynh;
    @Column(name="id_The_Chat")
    private String idTC;

    @Column(name="id_Doi_Tuyen_Quoc_Gia")
    private String idDTQG;

    // define constructors

    public Athlete() {

    }

    public Athlete(long maVDV, String hoTen, String gioiTinh, Time ngaySinh, String dienThoai, String cccd, String diaChi, String idPhuHuynh, String idTC, String idDTQG) {
        this.maVDV = maVDV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.cccd = cccd;
        this.diaChi = diaChi;
        this.idPhuHuynh = idPhuHuynh;
        this.idTC = idTC;
        this.idDTQG = idDTQG;
    }

    // define getter/setter

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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getIdPhuHuynh() {
        return idPhuHuynh;
    }

    public void setIdPhuHuynh(String idPhuHuynh) {
        this.idPhuHuynh = idPhuHuynh;
    }

    public String getIdTC() {
        return idTC;
    }

    public void setIdTC(String idTC) {
        this.idTC = idTC;
    }

    public String getIdDTQG() {
        return idDTQG;
    }

    public void setIdDTQG(String idDTQG) {
        this.idDTQG = idDTQG;
    }


    // define tostring

    @Override
    public String toString() {
        return "Athlete [" +
                "maVDV=" + maVDV +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", dienThoai='" + dienThoai + '\'' +
                ", cccd='" + cccd + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", idPhuHuynh='" + idPhuHuynh + '\'' +
                ", idTC='" + idTC + '\'' +
                ", idDTQG='" + idDTQG + '\'' +
                ']';
    }
}
