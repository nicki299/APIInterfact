package com.hsblox.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by devops on 4/6/18.
 */
@Entity
@Table(name = "HOST_URI")
public class HostURI
{
    @Id
    public int id;
    public String methods;
    public String hostUri;

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }





    public String getHostUri() {
        return hostUri;
    }

    public void setHostUri(String hostUri) {
        this.hostUri = hostUri;
    }


}
