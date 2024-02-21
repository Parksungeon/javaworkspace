package com.sungeon.realEstate.controller;

import com.sungeon.realEstate.dto.request.CheckIdRequestDto;
import com.sungeon.realEstate.dto.request.SendCodeRequestDto;
import com.sungeon.realEstate.dto.response.CheckIdResponseDto;
import com.sungeon.realEstate.dto.response.SendCodeResponseDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckIdRequestDto request);
	SendCodeResponseDto sendCode(SendCodeRequestDto request);
}