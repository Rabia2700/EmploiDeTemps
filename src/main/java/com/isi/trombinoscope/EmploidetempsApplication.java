package com.isi.trombinoscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

@SpringBootApplication
@EnableEurekaClient
public class EmploidetempsApplication
//		extends SpringBootServletInitializer
{

//	@Override
//	// Configuring method has to be overridden
//	protected SpringApplicationBuilder
//	configure(SpringApplicationBuilder application)
//	{
//		return application.sources(
//				TrombinoscopeApplication.class);
//	}
	public static void main(String[] args) {
		SpringApplication.run(EmploidetempsApplication.class, args);
	}

}
