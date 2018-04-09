package com.hsblox.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by devops on 4/6/18. This can be created
 */
@Entity
@Table(name = "PARAMETERS")
public class Parameters
{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
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

    @Id
    public int id;
    public String parameterType;
    public String name;
    public String value;


}
