package com.hsblox.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by devops on 4/6/18.
 */
@Entity
@Table(name = "APPLICATION_INTERFACE")
public class ApplicationInterface
{
    @Id
    public int id;
    public String hostUri;
    public String auth;
}
