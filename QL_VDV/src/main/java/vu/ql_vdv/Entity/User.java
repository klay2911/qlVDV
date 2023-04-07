package vu.ql_vdv.Entity;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name ="User")
public class User implements Serializable {
    @Id
    @Column(name ="TenDangNhap", length = 50)
    private String username;
    @Column(name ="MatKhau", length = 50)
    private String password;
    @Column(name ="HoTen", length = 50)
    private String fullname;
    @Column(name ="VaiTro", length = 50)
    private String role;
    public User(){
        super();
    }
    public User(String username,String password, String fullname, String role){
        super();
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
