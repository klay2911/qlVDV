package vu.ql_vdv.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "award_discipline")
public class Award_Disclipline implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID", unique = true, nullable = false)
    private String ID;

    @Column(name="SoKTKL")
    private String soKTKL;

    @Column(name="NoiDung")
    private String noiDung;

    @Column(name="Ngay")
    private Time ngay;

    @Column(name="MaVDV", nullable = false)
    private long maVDV;

    @Column(name="Loai")
    private String loai;

    public Award_Disclipline() {
    }

    public Award_Disclipline(String ID, String soKTKL, String noiDung, Time ngay, long maVDV, String loai) {
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

    @Override
    public String toString() {
        return "Award_Discipline{" +
                "ID='" + ID + '\'' +
                ", soKTKL='" + soKTKL + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", ngay=" + ngay +
                ", maVDV=" + maVDV +
                ", loai='" + loai + '\'' +
                '}';
    }
}

