package database;

import java.sql.Time;

public class Athlete {
    public Athlete(long maVDV, String hoTen, String gioiTinh, Time ngaySinh, String dienThoai, String cccd, String diaChi, String idPhuHuynh, String idTL, String idTC, String idDTQG) {
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

    private long maVDV;
    private String hoTen;
    private String gioiTinh;
    private Time ngaySinh;
    private String dienThoai;
    private String cccd;
    private String diaChi;
    private String idPhuHuynh;
    private String idTC;
    private String idDTQG;


    public long getmaVDV() {
        return maVDV;
    }

    public void setmaVDV(long maVDV) {
        this.maVDV = maVDV;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getgioiTinh() {
        return gioiTinh;
    }

    public void setgioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Time getngaySinh() {
        return ngaySinh;
    }

    public void setngaySinh(Time ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getdienThoai() {
        return dienThoai;
    }

    public void setdienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getcccd() {return cccd;}

    public void setcccd(String cccd) {this.cccd = cccd;}

    public String getdiaChi() {
        return diaChi;
    }

    public void setdiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getidPhuHuynh() {
        return idPhuHuynh;
    }

    public void setidPhuHuynh(String idPhuHuynh) {
        this.idPhuHuynh= idPhuHuynh;
    }

    public String getidTC() {
        return idTC;
    }

    public void setidTC(String IDPTC) {
        this.idTC= idTC;
    }

    public String getidDTQG() {
        return idDTQG;
    }

    public void setidDTQG(String idDTQG) {
        this.idDTQG= idDTQG;
    }

}
