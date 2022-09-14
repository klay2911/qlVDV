import java.sql.Time;

public class BackGround {
    public Parent(String idTL, String hoTen, String gioiTinh, Time thoiGianTapLuyen, String monThiDau, String tuyenVDV, String hlvPhuHuynh, String dangCapVDV ) {
        this.idTl = idTL;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.thoiGianTapLuyen = thoiGianTapLuyen;
        this.monThiDau = monThiDau;
        this.tuyenVDV = tuyenVDV;
        this.hlvPhuTrach = hlvPhuHuynh;
        this.dangCapVDV = dangCapVDV;
    }

    private String idTl;
    private String hoTen;
    private String gioiTinh;
    private Time thoiGianTapLuyen;
    private String monThiDau;
    private String tuyenVDV;
    private String hlvPhuTrach;
    private String dangCapVDV;

    public String getIdTl() {
        return idTl;
    }

    public void setIdTl(String idTl) {
        this.idTl = idTl;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Time getThoiGianTapLuyen() {
        return thoiGianTapLuyen;
    }

    public void setThoiGianTapLuyen(Time thoiGianTapLuyen) {
        this.thoiGianTapLuyen = thoiGianTapLuyen;
    }

    public String getMonThiDau() {
        return monThiDau;
    }

    public void setMonThiDau(String monThiDau) {
        this.monThiDau = monThiDau;
    }

    public String getTuyenVDV() {
        return tuyenVDV;
    }

    public void setTuyenVDV(String tuyenVDV) {
        this.tuyenVDV = tuyenVDV;
    }

    public String getHlvPhuTrach() {
        return hlvPhuTrach;
    }

    public void setHlvPhuTrach(String hlvPhuTrach) {
        this.hlvPhuTrach = hlvPhuTrach;
    }

    public String getDangCapVDV() {
        return dangCapVDV;
    }

    public void setDangCapVDV(String dangCapVDV) {
        this.dangCapVDV = dangCapVDV;
    }
}
