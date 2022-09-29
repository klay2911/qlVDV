package vu.ql_vdv.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "award_discipline")
public class Award_Discipline implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private String ID;

    @Column(name = "so_KhenThuong_KiLuat")
    private String soKTKL;

    @Column(name = "Noi_Dung")
    private String noiDung;

    @Column(name = "Ngay")
    private Time ngay;

    @Column(name = "ma_van_dong_vien", nullable = false)
    private long maVDV;

    @Column(name = "Loai")
    private String loai;

    public Award_Discipline() {
    }

    public Award_Discipline(String ID, String soKTKL, String noiDung, Time ngay, long maVDV, String loai) {
        this.ID = ID;
        this.soKTKL = soKTKL;
        this.noiDung = noiDung;
        this.ngay = ngay;
        this.maVDV = maVDV;
        this.loai = loai;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSoKTKL() {
        return soKTKL;
    }

    public void setSoKTKL(String soKTKL) {
        this.soKTKL = soKTKL;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Time getNgay() {
        return ngay;
    }

    public void setNgay(Time ngay) {
        this.ngay = ngay;
    }

    public long getMaVDV() {
        return maVDV;
    }

    public void setMaVDV(long maVDV) {
        this.maVDV = maVDV;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
