package com.hsblox.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by devops on 4/6/18.
 */
@Entity
@Table(name = "URI_METHOD")
public class URIMethod
{
    @Id
    public int id;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String parameter;
    public String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
