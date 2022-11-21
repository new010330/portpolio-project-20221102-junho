package com.frombio.personalproject20221102junho.dto.member;

import com.frombio.personalproject20221102junho.domain.User;
import com.frombio.personalproject20221102junho.dto.validation.ValidationGroups;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class JoinReqDto {

    @NotNull(message = "아이디를 입력해 주세요.", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 4, max = 16, message = "아이디는 영문소문자 또는 숫자 4~16자로 입력해 주세요.", groups = ValidationGroups.SizeCheckGroup.class)
    private String id;
    private String pw;
    private String confirmPw;
    private String name;
    private int phone;
    @Email(message = "유효한 이메일을 입력해 주세요.")
    @NotBlank(message = "이메일을 입력해 주세요.", groups = ValidationGroups.NotBlankGroup.class)
    private String email;

    private User toUserEntity() {
        return User.builder()
                .user_id(id)
                .pw(pw)
                .confirm_pw(confirmPw)
                .name(name)
                .phone(phone)
                .email(email)
                .role_id(1)
                .build();
    }
}
