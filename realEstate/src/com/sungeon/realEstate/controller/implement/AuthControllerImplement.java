package com.sungeon.realEstate.controller.implement;

import com.sungeon.realEstate.controller.AuthController;
import com.sungeon.realEstate.dto.request.CheckIdRequestDto;
import com.sungeon.realEstate.dto.request.SendCodeRequestDto;
import com.sungeon.realEstate.dto.response.CheckIdResponseDto;
import com.sungeon.realEstate.dto.response.SendCodeResponseDto;
import com.sungeon.realEstate.interfaces.Code;
import com.sungeon.realEstate.service.AuthService;
import com.sungeon.realEstate.service.implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto request) {
		boolean validId = request.validId();
		if (!validId) return new CheckIdResponseDto(Code.VF, null);
		
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEmail();
		if (!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
		return response;
	}

}