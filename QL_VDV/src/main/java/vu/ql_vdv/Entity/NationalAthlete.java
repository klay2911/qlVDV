package vu.ql_vdv.Entity;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "national_athlete")
public class NationalAthlete implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_Doi_Tuyen_Quoc_Gia")
    private Integer idDTQG;

    @Column(name="doi_Tuong")
    private String doiTuong;

    @Column(name="thoi_Gian_Tap_Trung")
    private Time thoiGianTapTrung;

    @Column(name="thoi_Gian_Ve")
    private Time thoiGianVe;

    @Column(name="ma_Van_Dong_Vien")
    private long maVDV;

    public NationalAthlete(){
    }
    public NationalAthlete(Integer idDTQG, String doiTuong, Time thoiGianTapTrung, Time thoiGianVe, long maVDV ) {
        this.maVDV = maVDV;
        this.doiTuong = doiTuong;
        this.thoiGianTapTrung = thoiGianTapTrung;
        this.thoiGianVe = thoiGianVe;
        this.idDTQG = idDTQG;
    }

    public Integer getIdDTQG() {
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

    @Override
    public String toString() {
        return "NationalAthlete[" +
                "idDTQG='" + idDTQG + '\'' +
                ", doiTuong='" + doiTuong + '\'' +
                ", thoiGianTapTrung=" + thoiGianTapTrung +
                ", thoiGianVe=" + thoiGianVe +
                ", maVDV=" + maVDV +
                ']';
    }
}
