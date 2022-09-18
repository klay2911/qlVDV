package entity;

import java.sql.Time;

@Entity
@Table(name = "Schedule")
public class Schedule {
    @idLT
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_Lich_Trinh")
    private String idLT;

    @Column(name="ma_Van_Dong_Vien")
    private long maVDV;

    @Column(name="giai_Thi_Dau")
    private String giaiThiDau;

    @Column(name="dia_Diem_Thi_Dau")
    private String diaDiemThiDau;

    @Column(name="noi_Dung_Thi_Dau")
    private String noiDungThiDau;

    @Column(name="nhom_Tuoi_Thi_Dau")
    private String nhomTuoiThiDau;

    @Column(name="thanh_Tich_Thi_Dau")
    private String thanhTichThiDau;
    @Column(name="ngay_Bat_Dau")
    private Time ngayBatDau;

    @Column(name="ngay_Ket_Thuc")
    private Time ngayKetThuc;

    public Schedule(){
    }
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

    public String getIdLT() {
        return idLT;
    }

    public void setIdLT(String idLT) {
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
