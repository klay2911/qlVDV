import java.sql.Time;

public class Award_Discipline {
    public FitnessIndex(String id, String soKTKL, String noiDung, Time ngay, int maVDV, String loai) {
        this.id = id;
        this.soKTKL = soKTKL;
        this.noiDung = noiDung;
        this.ngay = ngay;
        this.maVDV = maVDV;
        this.loai = loai;
    }
    private String id;
    private String soKTKL;
    private String noiDung;
    private Time ngay;
    private int maVDV;
    private String loai;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getMaVDV() {
        return maVDV;
    }

    public void setMaVDV(int maVDV) {
        this.maVDV = maVDV;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
