import java.sql.Time;

public class Parent {
    public Parent(String idPhuHuynh, String hoTenBo, String dienThoaiBo,String hoTenMe, String dienThoaiMe ) {
        this.idPhuHuynh = idPhuHuynh;
        this.hoTenBo = hoTenBo;
        this.dienThoaiBo = dienThoaiBo;
        this.hoTenMe = hoTenMe;
        this.dienThoaiMe = dienThoaiMe;
    }

    private String idPhuHuynh;
    private String hoTenBo;
    private String dienThoaiBo;
    private String hoTenMe;
    private String dienThoaiMe;

    public String getIdPhuHuynh() {
        return idPhuHuynh;
    }

    public void setIdPhuHuynh(String idPhuHuynh) {
        this.idPhuHuynh = idPhuHuynh;
    }

    public String getHoTenBo() {
        return hoTenBo;
    }

    public void setHoTenBo(String hoTenBo) {
        this.hoTenBo = hoTenBo;
    }

    public String getDienThoaiBo() {
        return dienThoaiBo;
    }

    public void setDienThoaiBo(String dienThoaiBo) {
        this.dienThoaiBo = dienThoaiBo;
    }

    public String getHoTenMe() {
        return hoTenMe;
    }

    public void setHoTenMe(String hoTenMe) {
        this.hoTenMe = hoTenMe;
    }

    public String getDienThoaiMe() {
        return dienThoaiMe;
    }

    public void setDienThoaiMe(String dienThoaiMe) {
        this.dienThoaiMe = dienThoaiMe;
    }
}
