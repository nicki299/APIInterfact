package com.hsblox.api.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "API_PARAMETER")
public class ApiParameter {

    private Long parameterId;
    private String name;
    private String value;
    // foreign key
    private Long apiUriMethodId;

    private Set<ApiParameterType> apiParameterTypeList;

    public ApiParameter() {
    }

    public ApiParameter(Long parameterId, String name, String value, Long apiUriMethodId, Set<ApiParameterType> apiParameterTypeList) {
        this.parameterId = parameterId;
        this.name = name;
        this.value = value;
        this.apiUriMethodId = apiUriMethodId;
        this.apiParameterTypeList = apiParameterTypeList;
    }

    @Id
    @GeneratedValue
    public Long getParameterId() {
        return parameterId;
    }

    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "parameterId")
    public Set<ApiParameterType> getApiParameterTypeList() {
        return apiParameterTypeList;
    }

    public void setApiParameterTypeList(Set<ApiParameterType> apiParameterTypeList) {
        this.apiParameterTypeList = apiParameterTypeList;
    }

    public Long getApiUriMethodId() {
        return apiUriMethodId;
    }

    public void setApiUriMethodId(Long apiUriMethodId) {
        this.apiUriMethodId = apiUriMethodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
