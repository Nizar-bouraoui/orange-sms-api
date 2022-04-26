package com.nbouraoui.orangesmsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nbouraoui.orangesmsapi.services.AccessTokenManager;

@SpringBootApplication
public class OrangeSmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeSmsApiApplication.class, args);
		AccessTokenManager accessTokenManager = new AccessTokenManager();
//		String test = accessTokenManager.generateAccessToken("Basic V2dyNWtQaHFhUjhHQUFUOXlnWkhmd3RuZXVBcUFvRDE6UGNVYzFzZ21pemh4NUJoOQ==");
		String test = accessTokenManager.generateAccessToken("Wgr5kPhqaR8GAAT9ygZHfwtneuAqAoD1","PcUc1sgmizhx5Bh9");

		System.out.println(test);

	}

}
