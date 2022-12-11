package com.example.complaintApp_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compliant")
public class Complaint {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String aadharno;
    private String address;
    private String mobile;
    private String username;
    private String password;
    private String cpassword;

    public Complaint() {
    }

    public Complaint(int id, String name, String aadharno, String address, String mobile, String username, String password, String cpassword) {
        this.id = id;
        this.name = name;
        this.aadharno = aadharno;
        this.address = address;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
        this.cpassword = cpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharno() {
        return aadharno;
    }

    public void setAadharno(String aadharno) {
        this.aadharno = aadharno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
}
