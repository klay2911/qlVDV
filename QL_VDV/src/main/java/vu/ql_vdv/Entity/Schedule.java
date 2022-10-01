package vu.ql_vdv.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "schedule")
public class Schedule implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idLT")
    private Integer idLT;
    @Column(name="MaVDV")
    private long maVDV;
    @Column(name="giaiThiDau")
    private String giaiThiDau;
    @Column(name="diaDiemThiDau")
    private String diaDiemThiDau;

    @Column(name="noiDungThiDau")
    private String noiDungThiDau;

    @Column(name="nhomTuoiThiDau")
    private String nhomTuoiThiDau;

    @Column(name="thanhTichThiDau")
    private String thanhTichThiDau;
    @Column(name="ngayBatDau")
    private Time ngayBatDau;

    @Column(name="ngayKetThuc")
    private Time ngayKetThuc;

    public Schedule(){
    }
    public Schedule(Integer idLT, long maVDV, String giaiThiDau, String diaDiemThiDau, String noiDungThiDau, String nhomTuoiThiDau, String thanhTichThiDau, Time ngayBatDau, Time ngayKetThuc) {
        this.idLT = idLT;
        this.maVDV = maVDV;
        this.giaiThiDau = giaiThiDau;
        this.diaDiemThiDau = diaDiemThiDau;
        this.noiDungThiDau = noiDungThiDau;
        this.nhomTuoiThiDau = nhomTuoiThiDau;
        this.thanhTichThiDau = thanhTichThiDau;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public Integer getIdLT() {
        return idLT;
    }

    public void setIdLT(Integer idLT) {
        this.idLT = idLT;
    }

    public long getMaVDV() {
        return maVDV;
    }

    public void setMaVDV(long maVDV) {
        this.maVDV = maVDV;
    }

    public String getGiaiThiDau() {
        return giaiThiDau;
    }

    public void setGiaiThiDau(String giaiThiDau) {
        this.giaiThiDau = giaiThiDau;
    }

    public String getDiaDiemThiDau() {
        return diaDiemThiDau;
    }

    public void setDiaDiemThiDau(String diaDiemThiDau) {
        this.diaDiemThiDau = diaDiemThiDau;
    }

    public String getNoiDungThiDau() {
        return noiDungThiDau;
    }

    public void setNoiDungThiDau(String noiDungThiDau) {
        this.noiDungThiDau = noiDungThiDau;
    }

    public String getNhomTuoiThiDau() {
        return nhomTuoiThiDau;
    }

    public void setNhomTuoiThiDau(String nhomTuoiThiDau) {
        this.nhomTuoiThiDau = nhomTuoiThiDau;
    }

    public String getThanhTichThiDau() {
        return thanhTichThiDau;
    }

    public void setThanhTichThiDau(String thanhTichThiDau) {
        this.thanhTichThiDau = thanhTichThiDau;
    }

    public Time getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Time ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Time getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Time ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "Schedule[" +
                "idLT='" + idLT + '\'' +
                ", maVDV=" + maVDV +
                ", giaiThiDau='" + giaiThiDau + '\'' +
                ", diaDiemThiDau='" + diaDiemThiDau + '\'' +
                ", noiDungThiDau='" + noiDungThiDau + '\'' +
                ", nhomTuoiThiDau='" + nhomTuoiThiDau + '\'' +
                ", thanhTichThiDau='" + thanhTichThiDau + '\'' +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ']';
    }
}

