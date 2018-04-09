package com.hsblox.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by devops on 4/6/18.
 */
@Entity
@Table(name = "PARAMETER_TYPE")
public class ParameterType
{
    @Id
    public int id;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String type;
}
