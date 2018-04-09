package com.hsblox.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "API_PARAMETER_TYPE")
public class ApiParameterType {

    private Long parameterTypeid;
    private String type;
    // foriegn key
    private Long parameterId;

    public ApiParameterType() {
    }

    public ApiParameterType(Long parameterTypeid, String type, Long parameterId) {
        this.parameterTypeid = parameterTypeid;
        this.type = type;
        this.parameterId = parameterId;
    }

    @Id
    @GeneratedValue
    public Long getParameterTypeid() {
        return parameterTypeid;
    }

    public void setParameterTypeid(Long parameterTypeid) {
        this.parameterTypeid = parameterTypeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getParameterId() {
        return parameterId;
    }

    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }
}
