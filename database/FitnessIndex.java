package database;

public class FitnessIndex {
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
    private String idTC;
    private Float chieuCao;
    private Float canNang;
    private Float chieuDaiChan;
    private Float chieuDaiTay;
    private Float ganASin;
    private int nhipTim;
    private int huyetAp;
    private String tinhTrangSucKhoe;

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

    public Float getGanASin() {
        return ganASin;
    }

    public void setGanASin(Float ganASin) {
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
}