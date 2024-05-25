package com.ts.ts_config_server_1001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TsConfigServer1001Application {

	public static void main(String[] args) {
		SpringApplication.run(TsConfigServer1001Application.class, args);
		
		System.out.println("ts-config-server-1001 started on port number: 8080");
	}

}
