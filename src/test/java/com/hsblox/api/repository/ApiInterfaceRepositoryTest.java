package com.hsblox.api.repository;

import com.hsblox.api.model.ApiAuth;
import com.hsblox.api.model.ApiInterface;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class ApiInterfaceRepositoryTest {

    @Autowired
    ApiInterfaceRepository apiInterfaceRepository;

    private ApiInterface apiInterface;
    private Set<ApiAuth> apiAuthList = new HashSet<>();

    @Before
    public void setUp() {
        setApiAuthList();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        apiInterface = new ApiInterface(1000L,"TestInterface", "0", timestamp, "0", timestamp, apiAuthList, null);
    }

    @Test
    public void saveApiInterface() {
        ApiInterface savedInterface = apiInterfaceRepository.save(apiInterface);
        assertEquals(savedInterface.getName(), apiInterface.getName());
    }

    @Test
    public void updateApiInterface() {
        ApiInterface savedInterface = apiInterfaceRepository.save(apiInterface);
        savedInterface.setCreatedUser("otherUser");
        assertEquals(apiInterfaceRepository.save(savedInterface).getCreatedUser(), "otherUser");
    }

    @Test
    public void deleteApiInterface() {
        ApiInterface savedInterface = apiInterfaceRepository.save(apiInterface);
        apiInterfaceRepository.delete(savedInterface);
        assertEquals(apiInterfaceRepository.findAll(), new ArrayList<>());
    }

    @Test
    public void findAllApiInterface() {
        ApiInterface savedInterface = apiInterfaceRepository.save(apiInterface);
        List savedList = new ArrayList();
        savedList.add(savedInterface);

        ApiInterface foundInterface = apiInterfaceRepository.findById(savedInterface.getInterfaceId()).get();

        assertEquals(savedInterface.getInterfaceId(), foundInterface.getInterfaceId());
        assertEquals(savedInterface.getName(), foundInterface.getName());
    }

    private void setApiAuthList() {
        ApiAuth apiAuth = new ApiAuth();
        apiAuth.setCertificateCommonName("commonName");
        apiAuth.setCertificatePrivateKey("somekey");
        apiAuth.setPassword("somepaswword");
        apiAuth.setRefreshToken("983989384938ieurieur");
        apiAuth.setUserName("superUser");
        apiAuthList.add(apiAuth);
    }

}