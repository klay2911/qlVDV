package edu.neu.ql_vdvsys.entity;

import javax.persistence.*;

@Entity
@Table(schema ="qlvdv")
public class UserDtls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;
    private String username;

    private String password;

    private String role;

    private String fullname;
    private String position;

    public UserDtls() {
    }

    public UserDtls(int id_user, String username, String password, String role, String fullname, String position) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.role = role;
        this.fullname = fullname;
        this.position = position;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "UserDtls{" +
                "id_user=" + id_user +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", fullname='" + fullname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
