package com.hsblox.api.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by devops on 4/6/18.
 */
@Entity
@Table(name = "AUTH_STATERGY")
public class AuthStatergy
{
    @Id
    public int id;
    public String userName;
    public String password;
    public String certificateCommonName;
    public String certificatePrivateKey;
    public String refreshToken;

    public String getCertificateCommonName() {
        return certificateCommonName;
    }

    public void setCertificateCommonName(String certificateCommonName) {
        this.certificateCommonName = certificateCommonName;
    }

    public String getCertificatePrivateKey() {
        return certificatePrivateKey;
    }

    public void setCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
