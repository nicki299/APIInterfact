package com.hsblox.api;

import com.hsblox.api.mock.InitializeData;
import com.hsblox.api.model.ApiParameterType;
import com.hsblox.api.model.ApiUriMethod;
import com.hsblox.api.repository.ApiAuthRepository;
import com.hsblox.api.repository.ApiInterfaceRepository;
import com.hsblox.api.repository.ApiParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@ComponentScan({"com.hsblox.api"})
@Configuration
@EnableJpaRepositories(
        basePackages = {"com.hsblox.api.repository"}
)
@EnableTransactionManagement
@EnableAutoConfiguration
public class ApiApplication implements CommandLineRunner{

    @Autowired
    private static InitializeData mockData;

    @Autowired
    private ApiInterfaceRepository apiInterfaceRepository;
    @Autowired
    private ApiAuthRepository apiAuthRepository;
    @Autowired
    private ApiParameterRepository apiParameterRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
       // mockData.loadInterfaceMockData();
        System.out.println("API Application is Running!!!");
    }
}
