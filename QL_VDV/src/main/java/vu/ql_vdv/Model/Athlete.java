package vu.ql_vdv.Model;


import java.io.Serializable;
import java.sql.Time;
import javax.persistence.*;

@Entity
@Table(name="athlete",schema="ql_vdv")
public class Athlete implements Serializable {
    /* @maVDV
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="ma_van_dong_vien",unique = true, nullable = false)
     private long maVDV;*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_vdv", unique = true, nullable = false)
    private Long maVDV;

    @Column(name = "ho_Ten")
    private String hoTen;

    @Column(name = "gioi_Tinh")
    private String gioiTinh;
    @Column(name = "ngay_Sinh")
    private Time ngaySinh;

    @Column(name = "dien_Thoai")
    private String dienThoai;

    @Column(name = "can_cuoc_cong_dan")
    private String cccd;

    @Column(name = "dia_Chi")
    private String diaChi;

    @Column(name = "id_PhuHuynh")
    private String idPhuHuynh;
    @Column(name = "id_The_Chat")
    private String idTC;

    @Column(name = "id_lichTrinh")
    private Integer idLT;
    @Column(name = "id_Doi_Tuyen_Quoc_Gia")
    private Integer idDTQG;

    @Column(name = "id_background")
    private Integer idBackGround;

    // define constructors

    public Athlete() {

    }

    public Athlete(long maVDV, String hoTen, String gioiTinh, Time ngaySinh, String dienThoai, String cccd, String diaChi, String idPhuHuynh, String idTC, Integer idLT, Integer idDTQG, Integer idBackGround) {
        this.maVDV = maVDV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.cccd = cccd;
        this.diaChi = diaChi;
        this.idPhuHuynh = idPhuHuynh;
        this.idTC = idTC;
        this.idLT = idLT;
        this.idDTQG = idDTQG;
        this.idBackGround = idBackGround;
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

    public Time getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Time ngaySinh) {
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

    public Integer getIdLT() {
        return idLT;
    }

    public void setIdLT(Integer idLT) {
        this.idLT = idLT;
    }

    public Integer getIdDTQG() {
        return idDTQG;
    }

    public void setIdDTQG(Integer idDTQG) {
        this.idDTQG = idDTQG;
    }

    public Integer getIdBackGround() {
        return idBackGround;
    }

    public void setIdBackGround(Integer idBackGround) {
        this.idBackGround = idBackGround;
    }
}