package vu.ql_vdv.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="fitnessindex")
public class FitnessIndex implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="IDTC")
    private String idTC;
    @Column(name="ChieuCao")
    private Float chieuCao;
    @Column(name="canNang")
    private Float canNang;
    @Column(name="chieudaichan")
    private Float chieuDaiChan;
    @Column(name="chieudaitay")
    private Float chieuDaiTay;
    @Column(name="ganASin")
    private Float ganASin;
    @Column(name="NhipTim")
    private int nhipTim;
    @Column(name="huyetAp")
    private int huyetAp;
    @Column(name="TinhTrangSucKhoe")
    private String tinhTrangSucKhoe;
    public FitnessIndex(){
    }
    public FitnessIndex(String idTC, Float chieuCao, Float canNang, Float chieuDaiChan, Float chieuDaiTay, Float ganASin, int nhipTim, int huyetAp, String tinhTrangSucKhoe) {
        this.idTC = idTC;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
        this.chieuDaiChan = chieuDaiChan;
        this.chieuDaiTay = chieuDaiTay;
        this.ganASin = ganASin;
        this.nhipTim = nhipTim;
        this.huyetAp = huyetAp;
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
    }

    public String getIdTC() {
        return idTC;
    }

    public void setIdTC(String idTC) {
        this.idTC = idTC;
    }

    public Float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(Float chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Float getCanNang() {
        return canNang;
    }

    public void setCanNang(Float canNang) {
        this.canNang = canNang;
    }

    public Float getChieuDaiChan() {
        return chieuDaiChan;
    }

    public void setChieuDaiChan(Float chieuDaiChan) {
        this.chieuDaiChan = chieuDaiChan;
    }

    public Float getChieuDaiTay() {
        return chieuDaiTay;
    }

    public void setChieuDaiTay(Float chieuDaiTay) {
        this.chieuDaiTay = chieuDaiTay;
    }

    public Float getganASin() {
        return ganASin;
    }

    public void setganASin(Float ganASin) {
        this.ganASin = ganASin;
    }

    public int getNhipTim() {
        return nhipTim;
    }

    public void setNhipTim(int nhipTim) {
        this.nhipTim = nhipTim;
    }

    public int getHuyetAp() {
        return huyetAp;
    }

    public void setHuyetAp(int huyetAp) {
        this.huyetAp = huyetAp;
    }

    public String getTinhTrangSucKhoe() {
        return tinhTrangSucKhoe;
    }

    public void setTinhTrangSucKhoe(String tinhTrangSucKhoe) {
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
    }

    @Override
    public String toString() {
        return "FitnessIndex[" +
                "idTC='" + idTC + '\'' +
                ", chieuCao=" + chieuCao +
                ", canNang=" + canNang +
                ", chieuDaiChan=" + chieuDaiChan +
                ", chieuDaiTay=" + chieuDaiTay +
                ", ganASin=" + ganASin +
                ", nhipTim=" + nhipTim +
                ", huyetAp=" + huyetAp +
                ", tinhTrangSucKhoe='" + tinhTrangSucKhoe + '\'' +
                ']';
    }
}
