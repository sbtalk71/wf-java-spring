package com.demo.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.demo.spring.entity.Emp;

@Component
public class RestClientRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("You Got Me!");
		
	RestTemplate rt = new RestTemplate();
	ResponseEntity<String> response=rt.getForEntity("http://localhost:8080/emp/find/101", String.class);
		
		System.out.println(response.getBody());
		
		HttpHeaders headers=new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_XML_VALUE);
		
		HttpEntity req=new HttpEntity<>(headers);
		
		ResponseEntity<String> response1
		=rt.exchange("http://localhost:8080/emp/find/101", HttpMethod.GET, req, String.class);
		
		System.out.println(response1.getBody());
		
		//------POST CALL-------//
		Emp e=new Emp(401,"Kiran","Mumbai",56000);
		
		headers.add("Accept", MediaType.TEXT_PLAIN_VALUE);
		headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		
		HttpEntity req2=new HttpEntity(e, headers);	
		
		ResponseEntity<String> response2
		=rt.exchange("http://localhost:8080/emp/save", HttpMethod.POST, req2, String.class);
		
		System.out.println(response2.getBody());
	}

}
