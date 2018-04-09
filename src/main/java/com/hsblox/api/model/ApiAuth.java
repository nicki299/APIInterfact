package com.hsblox.api.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "API_AUTH")
public class ApiAuth {

    private Long authId;
    private String userName;
    private String password;
    private String certificateCommonName;
    private String certificatePrivateKey;
    private String refreshToken;
    private String endPointUri;
    // foriegn key
    private Long interfaceId;

    public ApiAuth() {
    }

    public ApiAuth(Long authId, String userName, String password, String certificateCommonName, String certificatePrivateKey,
                   String refreshToken, String endPointUri, Long interfaceId) {
        this.authId = authId;
        this.userName = userName;
        this.password = password;
        this.certificateCommonName = certificateCommonName;
        this.certificatePrivateKey = certificatePrivateKey;
        this.refreshToken = refreshToken;
        this.endPointUri = endPointUri;
        this.interfaceId = interfaceId;
    }

    @Id
    @GeneratedValue
    public Long getAuthId() {
        return authId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }

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

    public String getEndPointUri() {
        return endPointUri;
    }

    public void setEndPointUri(String endPointUri) {
        this.endPointUri = endPointUri;
    }

    public Long getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Long interfaceId) {
        this.interfaceId = interfaceId;
    }
}
