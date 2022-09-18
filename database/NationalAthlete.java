package database;

import java.sql.Time;

public class NationalAthlete {
    public NationalAthlete(String idDTQG, String doiTuong, Time thoiGianTapTrung, Time thoiGianVe, long maVDV ) {
        this.idDTQG = idDTQG;
        this.doiTuong = doiTuong;
        this.thoiGianTapTrung = thoiGianTapTrung;
        this.thoiGianVe = thoiGianVe;
        this.maVDV = maVDV;
    }

    private String idDTQG;
    private String doiTuong;
    private Time thoiGianTapTrung;
    private Time thoiGianVe;
    private long maVDV;

    public String getIdDTQG() {
        return idDTQG;
    }

    public void setIdDTQG(String idDTQG) {
        this.idDTQG = idDTQG;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public Time getThoiGianTapTrung() {
        return thoiGianTapTrung;
    }

    public void setThoiGianTapTrung(Time thoiGianTapTrung) {
        this.thoiGianTapTrung = thoiGianTapTrung;
    }

    public Time getThoiGianVe() {
        return thoiGianVe;
    }

    public void setThoiGianVe(Time thoiGianVe) {
        this.thoiGianVe = thoiGianVe;
    }

    public long getMaVDV() {
        return maVDV;
    }

    public void setMaVDV(long maVDV) {
        this.maVDV = maVDV;
    }
}

