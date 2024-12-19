package com.dhruv.springjwt.test.controller.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtRequest {
	
	String email;
	
	String password;

}
