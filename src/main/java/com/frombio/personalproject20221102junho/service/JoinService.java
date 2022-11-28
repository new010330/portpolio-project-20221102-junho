package com.frombio.personalproject20221102junho.service;

import com.frombio.personalproject20221102junho.dto.member.JoinReqDto;

public interface JoinService {
    public boolean join(JoinReqDto joinReqDto) throws Exception;

}
