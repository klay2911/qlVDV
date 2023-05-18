package edu.neu.ql_vdvsys.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "athlete", schema = "qlvdv")
public class Athlete implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaVDV", unique = true, nullable = false)
    private Long maVDV;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "gioi_tinh")
    private String gioiTinh;
    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "dien_thoai")
    private String dienThoai;

    @Column(name = "CCCD")
    private String cccd;

    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "ho_ten_bo")
    private String htbo;
    @Column(name = "dien_thoai_bo")
    private String dtbo;
    @Column(name = "ho_ten_me")
    private String htme;
    @Column(name = "dien_thoai_me")
    private String dtme;
   /* @Column(name = "idphu_huynh")
    private String idPhuHuynh;

    @Column(name = "IDTC")
    private String idTC;

    @Column(name = "IDlT")
    private Integer idLT;

    @Column(name = "IDDTQG")
    private Integer idDTQG;

    @Column(name = "idback_ground")
    private Integer idBackGround;*/

    // define constructors

    public Athlete() {
        super();
    }

    public Athlete(Long maVDV, String hoTen, String gioiTinh, Date ngaySinh, String dienThoai, String cccd, String diaChi, String htbo, String dtbo, String htme, String dtme) {
        this.maVDV = maVDV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.cccd = cccd;
        this.diaChi = diaChi;
        this.htbo = htbo;
        this.dtbo = dtbo;
        this.htme = htme;
        this.dtme = dtme;
    }

    // define getter/setter

    public Long getMaVDV() {
        return maVDV;
    }

    public void setMaVDV(Long maVDV) {
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
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

    public String getHtbo() {
        return htbo;
    }

    public void setHtbo(String htbo) {
        this.htbo = htbo;
    }

    public String getDtbo() {
        return dtbo;
    }

    public void setDtbo(String dtbo) {
        this.dtbo = dtbo;
    }

    public String getHtme() {
        return htme;
    }

    public void setHtme(String htme) {
        this.htme = htme;
    }

    public String getDtme() {
        return dtme;
    }

    public void setDtme(String dtme) {
        this.dtme = dtme;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "maVDV=" + maVDV +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", dienThoai='" + dienThoai + '\'' +
                ", cccd='" + cccd + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", htbo='" + htbo + '\'' +
                ", dtbo='" + dtbo + '\'' +
                ", htme='" + htme + '\'' +
                ", dtme='" + dtme + '\'' +
                '}';
    }
}
