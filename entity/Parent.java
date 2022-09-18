package entity;

import java.sql.Time;

@Entity
@Table(name = "Parent")
public class Parent {

    @idPhuHuynh
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_PhuHuynh")
    private String idPhuHuynh;

    @Column(name="ho_Ten_Bo")
    private String hoTenBo;

    @Column(name="dienThoaiBo")
    private String dienThoaiBo;

    @Column(name="ho_Ten_Me")
    private String hoTenMe;

    @Column(name="dien_Thoai_Me")
    private String dienThoaiMe;

    public Parent(){
    }

    public Parent(String idPhuHuynh, String hoTenBo, String dienThoaiBo,String hoTenMe, String dienThoaiMe ) {
        this.idPhuHuynh = idPhuHuynh;
        this.hoTenBo = hoTenBo;
        this.dienThoaiBo = dienThoaiBo;
        this.hoTenMe = hoTenMe;
        this.dienThoaiMe = dienThoaiMe;
    }

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

    @Override
    public String toString() {
        return "Parent[" +
                "idPhuHuynh='" + idPhuHuynh + '\'' +
                ", hoTenBo='" + hoTenBo + '\'' +
                ", dienThoaiBo='" + dienThoaiBo + '\'' +
                ", hoTenMe='" + hoTenMe + '\'' +
                ", dienThoaiMe='" + dienThoaiMe + '\'' +
                ']';
    }
}
