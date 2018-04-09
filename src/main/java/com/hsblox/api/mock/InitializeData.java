package com.hsblox.api.mock;

import com.hsblox.api.model.ApiAuth;
import com.hsblox.api.model.ApiInterface;
import com.hsblox.api.model.ApiParameterType;
import com.hsblox.api.model.ApiUriMethod;
import com.hsblox.api.repository.ApiAuthRepository;
import com.hsblox.api.repository.ApiInterfaceRepository;
import com.hsblox.api.repository.ApiParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class InitializeData {


    public void loadInterfaceMockData() {
        ApiInterface apiInterface = new ApiInterface();
        apiInterface.setInterfaceId(1000L);
        apiInterface.setCreatedUser("someUser");
        apiInterface.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        apiInterface.setName("AllScripts");
        apiInterface.setModifiedDate(new Timestamp(System.currentTimeMillis()));
        apiInterface.setModifiedUser("someUser");

       // apiInterfaceRepository.save(apiInterface);

        ApiAuth apiAuth = new ApiAuth();
        apiAuth.setUserName("someAPIuser");
        apiAuth.setRefreshToken("30292ioqereoor");
        apiAuth.setPassword("ieurieurie");
        apiAuth.setCertificatePrivateKey("someprvatekey");
        apiAuth.setAuthId(1000L);
        apiAuth.setEndPointUri("http://localhost:8080/mock/auth");
        apiAuth.setCertificateCommonName("someCommonName");
        apiAuth.setInterfaceId(1000L);

        //apiAuthRepository.save(apiAuth);
    }
}
