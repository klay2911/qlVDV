package database;

import java.sql.Time;

public class Schedule {
    public Schedule(String idLT, long maVDV, String giaiThiDau, String diaDiemThiDau, String noiDungThiDau, String nhomTuoiThiDau, String thanhTichThiDau, Time ngayBatDau, Time ngayKetThuc) {
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
    private String idLT;
    private long  maVDV;
    private String giaiThiDau;
    private String diaDiemThiDau;
    private String noiDungThiDau;
    private String nhomTuoiThiDau;
    private String thanhTichThiDau;
    private Time ngayBatDau;
    private Time ngayKetThuc;


    public String getidLT() {
        return idLT;
    }

    public void setidLT(String idLT) {
        this.idLT = idLT;
    }

    public long  getmaVDV() {
        return maVDV;
    }

    public void setmaVDV(long  maVDV) {
        this.maVDV = maVDV;
    }

    public String getgiaiThiDau() {
        return giaiThiDau;
    }

    public void setgiaiThiDau(String giaiThiDau) {
        this.giaiThiDau = giaiThiDau;
    }

    public String getdiaDiemThiDau() {
        return diaDiemThiDau;
    }

    public void setdiaDiemThiDau(String diaDiemThiDau) {
        this.diaDiemThiDau = diaDiemThiDau;
    }

    public String getnoiDungThiDau() {
        return noiDungThiDau;
    }

    public void setnoiDungThiDau(String noiDungThiDau) {
        this.noiDungThiDau = noiDungThiDau;
    }

    public String getnhomTuoiThiDau() {return nhomTuoiThiDau;}

    public void setnhomTuoiThiDau(String nhomTuoiThiDau) {this.nhomTuoiThiDau = nhomTuoiThiDau;}

    public String getthanhTichThiDau() {
        return thanhTichThiDau;
    }

    public void setthanhTichThiDau(String thanhTichThiDau) {
        this.thanhTichThiDau = thanhTichThiDau;
    }

    public Time getngayBatDau() {
        return ngayBatDau;
    }

    public void setngayBatDau(Time IDPTC) {
        this.ngayBatDau= ngayBatDau;
    }

    public Time getngayKetThuc() {
        return ngayKetThuc;
    }

    public void setngayKetThuc(Time ngayKetThuc) {
        this.ngayKetThuc= ngayKetThuc;
    }

}

