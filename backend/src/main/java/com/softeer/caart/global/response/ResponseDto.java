package com.softeer.caart.global.response;

import com.softeer.caart.global.ResultCode;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ResponseDto {
	private final Boolean success;
	private final Integer statusCode;
	private final String message;

	public static ResponseDto of(Boolean success, ResultCode resultCode) {
		return new ResponseDto(success, resultCode.getStatusCode(), resultCode.getMessage());
	}

	public static ResponseDto success() {
		return new ResponseDto(true, ResultCode.OK.getStatusCode(), ResultCode.OK.getMessage());
	}
}
