public class Athlete {
    public Athlete(int maVDV, String hoTen, String gioiTinh, String ngaySinh, int dienThoai, int cccd, String diaChi, String idPhuHuynh, String idTL, String idTC, String idDTQG) {
        this.maVDV = maVDV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.cccd = cccd;
        this.diaChi = diaChi;
        this.idPhuHuynh = idPhuHuynh;
        this.idTL = idTL;
        this.idTC = idTC;
        this.idDTQG = idDTQG;
    }

    private int maVDV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private int dienThoai;
    private int cccd;
    private String diaChi;
    private String idPhuHuynh;
    private String idTL;
    private String idTC;
    private String idDTQG;


    public int getmaVDV() {
        return maVDV;
    }

    public void setmaVDV(int maVDV) {
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

    public String getngaySinh() {
        return ngaySinh;
    }

    public void setngaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getdienThoai() {
        return dienThoai;
    }

    public void setdienThoai(int dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getcccd() {return cccd;}

    public void setcccd(int cccd) {this.cccd = cccd;}

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

    public String getidTL() {
        return idTL;
    }

    public void setidTL(String idTL) {
        this.idTL= idTL;
    }

    public String getidDTQG() {
        return idDTQG;
    }

    public void setidDTQG(String idDTQG) {
        this.idDTQG= idDTQG;
    }

}
