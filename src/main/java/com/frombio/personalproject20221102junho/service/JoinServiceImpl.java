package com.frombio.personalproject20221102junho.service;

import com.frombio.personalproject20221102junho.domain.User;
import com.frombio.personalproject20221102junho.dto.member.JoinReqDto;
import com.frombio.personalproject20221102junho.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinServiceImpl implements JoinService {

    private final MemberRepository memberRepository;

    @Override
    public boolean join(JoinReqDto joinReqDto) throws Exception {
        User userEntity = joinReqDto.toUserEntity();
        int result = memberRepository.save(userEntity);

        return result != 0;
    }
}
