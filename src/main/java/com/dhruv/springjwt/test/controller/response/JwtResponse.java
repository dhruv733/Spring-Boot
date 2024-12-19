package com.dhruv.springjwt.test.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtResponse {
	
	String jwtToken;
	
	String username;

}
