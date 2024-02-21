package com.sungeon.realEstate.service;

import com.sungeon.realEstate.dto.request.CheckIdRequestDto;
import com.sungeon.realEstate.dto.request.SendCodeRequestDto;
import com.sungeon.realEstate.dto.response.CheckIdResponseDto;
import com.sungeon.realEstate.dto.response.SendCodeResponseDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckIdRequestDto dto);
	SendCodeResponseDto sendCode(SendCodeRequestDto dto);
}