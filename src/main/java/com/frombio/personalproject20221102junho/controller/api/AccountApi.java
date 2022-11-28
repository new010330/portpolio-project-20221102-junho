package com.frombio.personalproject20221102junho.controller.api;


import com.frombio.personalproject20221102junho.aop.annotation.LogAspect;
import com.frombio.personalproject20221102junho.aop.annotation.ValidAspect;
import com.frombio.personalproject20221102junho.dto.CMRespDto;
import com.frombio.personalproject20221102junho.dto.member.JoinReqDto;
import com.frombio.personalproject20221102junho.dto.validation.ValidationSequence;
import com.frombio.personalproject20221102junho.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/api/member")
@RequiredArgsConstructor
@RestController
public class AccountApi {

    private final JoinService joinService;
    @LogAspect
    @ValidAspect
    @PostMapping("/join")
    public ResponseEntity<?> join(@Validated(ValidationSequence.class) @RequestBody JoinReqDto joinReqDto, BindingResult br) throws Exception {

        joinService.join(joinReqDto);

        return ResponseEntity.ok().body(new CMRespDto<>(1, "Successfully registered", joinReqDto));
    }

}
