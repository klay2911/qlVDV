package vu.ql_vdv.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "parent")
public class Parent implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="IDPhuHuynh")
    private String idPhuHuynh;
    @Column(name="HoTenBo")
    private String hoTenBo;
    @Column(name="dienThoaiBo")
    private String dienThoaiBo;
    @Column(name="HoTenMe")
    private String hoTenMe;
    @Column(name="DienThoaiMe")
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
