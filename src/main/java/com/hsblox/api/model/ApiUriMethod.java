package com.hsblox.api.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "API_URI_METHOD")
public class ApiUriMethod {
    private Long apiUriMethodId;
    private String hostUri;
    private String method;
    private String context;

    //foriegn key
    private Long interfaceId;

    private Set<ApiParameter> apiParameterList;

    public ApiUriMethod() {
    }

    public ApiUriMethod(Long apiUriMethodId, String hostUri, String method, String context, Long interfaceId,
                        Set<ApiParameter> apiParameterList) {
        this.apiUriMethodId = apiUriMethodId;
        this.hostUri = hostUri;
        this.method = method;
        this.context = context;
        this.interfaceId = interfaceId;
        this.apiParameterList = apiParameterList;
    }

    @Id
    @GeneratedValue
    public Long getApiUriMethodId() {
        return apiUriMethodId;
    }

    public void setApiUriMethodId(Long apiUriMethodId) {
        this.apiUriMethodId = apiUriMethodId;
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "apiUriMethodId")
    public Set<ApiParameter> getApiParameterList() {
        return apiParameterList;
    }

    public void setApiParameterList(Set<ApiParameter> apiParameterList) {
        this.apiParameterList = apiParameterList;
    }

    public Long getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Long interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getHostUri() {
        return hostUri;
    }

    public void setHostUri(String hostUri) {
        this.hostUri = hostUri;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
