package com.hsblox.api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "API_INTERFACE")
public class ApiInterface implements Serializable {

    private Long interfaceId;
    private String name;
    private String createdUser;
    private Timestamp createdDate;
    private String modifiedUser;
    private Timestamp modifiedDate;

    private Set<ApiAuth> apiAuthList;
    private Set<ApiUriMethod> apiUriMethodList;

    public ApiInterface() {
    }

    public ApiInterface(Long interfaceId, String name, String createdUser, Timestamp createdDate, String modifiedUser,
                        Timestamp modifiedDate, Set<ApiAuth> apiAuthList, Set<ApiUriMethod> apiUriMethodList) {
        this.interfaceId = interfaceId;
        this.name = name;
        this.createdUser = createdUser;
        this.createdDate = createdDate;
        this.modifiedUser = modifiedUser;
        this.modifiedDate = modifiedDate;
        this.apiAuthList = apiAuthList;
        this.apiUriMethodList = apiUriMethodList;
    }

    public ApiInterface(String name, String createdUser, Timestamp createdDate, String modifiedUser, Timestamp modifiedDate) {
        this.name = name;
        this.createdUser = createdUser;
        this.createdDate = createdDate;
        this.modifiedUser = modifiedUser;
        this.modifiedDate = modifiedDate;
    }

    public ApiInterface(String name, String createdUser, Timestamp createdDate, String modifiedUser,
                        Timestamp modifiedDate, Set<ApiAuth> apiAuthList) {
        this.name = name;
        this.createdUser = createdUser;
        this.createdDate = createdDate;
        this.modifiedUser = modifiedUser;
        this.modifiedDate = modifiedDate;
        this.apiAuthList = apiAuthList;
    }

    public ApiInterface(String name, String createdUser, Timestamp createdDate, String modifiedUser,
                        Timestamp modifiedDate, Set<ApiAuth> apiAuthList, Set<ApiUriMethod> apiUriMethodList) {
        this.name = name;
        this.createdUser = createdUser;
        this.createdDate = createdDate;
        this.modifiedUser = modifiedUser;
        this.modifiedDate = modifiedDate;
        this.apiAuthList = apiAuthList;
        this.apiUriMethodList = apiUriMethodList;
    }

    @Id
    @GeneratedValue
    public Long getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Long interfaceId) {
        this.interfaceId = interfaceId;
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "interfaceId")
    public Set<ApiAuth> getApiAuthList() {
        return apiAuthList;
    }

    public void setApiAuthList(Set<ApiAuth> apiAuthList) {
        this.apiAuthList = apiAuthList;
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "interfaceId")
    public Set<ApiUriMethod> getApiUriMethodList() {
        return apiUriMethodList;
    }

    public void setApiUriMethodList(Set<ApiUriMethod> apiUriMethodList) {
        this.apiUriMethodList = apiUriMethodList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
