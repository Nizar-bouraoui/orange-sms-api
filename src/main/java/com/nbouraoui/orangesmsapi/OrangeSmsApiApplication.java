package com.nbouraoui.orangesmsapi;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nbouraoui.orangesmsapi.services.AccessTokenManager;
import com.nbouraoui.orangesmsapi.services.SmsManager;

@SpringBootApplication
public class OrangeSmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeSmsApiApplication.class, args);
//		AccessTokenManager accessTokenManager = new AccessTokenManager();
//		String test = accessTokenManager.generateAccessToken("Basic V2dyNWtQaHFhUjhHQUFUOXlnWkhmd3RuZXVBcUFvRDE6UGNVYzFzZ21pemh4NUJoOQ==");
//		String test = accessTokenManager.generateAccessToken("Wgr5kPhqaR8GAAT9ygZHfwtneuAqAoD1","PcUc1sgmizhx5Bh9");
		SmsManager smsManager = new SmsManager();
//		JSONObject jsonObject =  smsManager.sendMessage("+21653923179", "+21627623178", "Hello", "sOhNAEJFyAcYLZ11lfFhYGsvhN0V");
//		JSONObject jsonObject =  smsManager.viewSmsBalance("sOhNAEJFyAcYLZ11lfFhYGsvhN0V");
//		JSONObject jsonObject =  smsManager.viewSmsUsage("sOhNAEJFyAcYLZ11lfFhYGsvhN0V");
		JSONObject jsonObject =  smsManager.viewSmsPurchaseHistory("sOhNAEJFyAcYLZ11lfFhYGsvhN0V");
		System.out.println(jsonObject);
//		System.out.println(test);

	}

}
