import java.sql.Time;

public class NationalAthelete {
    public NationalAthelete(String idDTQG, String doiTuong, Time thoiGianTapTrung, Time thoiGianVe, int maVDV ) {
        this.maVDV = maVDV;
        this.doiTuong = doiTuong;
        this.thoiGianTapTrung = thoiGianTapTrung;
        this.thoiGianVe = thoiGianVe;
        this.idDTQG = idDTQG;
    }

    private String idDTQG;
    private String doiTuong;
    private String thoiGianTapTrung;
    private String thoiGianVe;
    private int maVDV;


    public int getmaVDV() {
        return maVDV;
    }

    public void setmaVDV(int maVDV) {
        this.maVDV = maVDV;
    }

    public String getdoiTuong() {
        return doiTuong;
    }

    public void setdoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public String getthoiGianTapTrung() {
        return thoiGianTapTrung;
    }

    public void setthoiGianTapTrung(String thoiGianTapTrung) {
        this.thoiGianTapTrung = thoiGianTapTrung;
    }

    public Time getthoiGianVe() {
        return thoiGianVe;
    }

    public void setthoiGianVe(Time thoiGianVe) {
        this.thoiGianVe = thoiGianVe;
    }
    public Time getidDTQG() {
        return idDTQG;
    }

    public void setidDTQG(Time idDTQG) {
        this.idDTQG = idDTQG;

}

