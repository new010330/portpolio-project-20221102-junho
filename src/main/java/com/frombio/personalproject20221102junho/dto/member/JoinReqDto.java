package com.frombio.personalproject20221102junho.dto.member;

import com.frombio.personalproject20221102junho.domain.User;
import com.frombio.personalproject20221102junho.dto.validation.ValidationGroups;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class JoinReqDto {

    @NotNull(message = "아이디를 입력해 주세요.", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 4, max = 16, message = "아이디는 영문소문자 또는 숫자 4~16자로 입력해 주세요.", groups = ValidationGroups.SizeCheckGroup.class)
    private String id;
    @Pattern(regexp = "^(?!((?:[A-Za-z]+)|(?:[~!@#$%^&*()_+={}|;:<>,.?/]+)|(?:[0-9]+))$)[A-Za-z\\d~!@#$%^&*()_+=]{8,16}$",
            message = "영문 대소문자/숫자/특수문자 중 2가지 이상 조합",
            groups = ValidationGroups.PatternCheckGroup.class)
    private String pw;
    private String confirmPw;
    private String name;
    private int tel1;
    private int tel2;
    private int tel3;

    @Email(message = "유효한 이메일을 입력해 주세요.")
    @NotBlank(message = "이메일을 입력해 주세요.", groups = ValidationGroups.NotBlankGroup.class)
    private String email;

    public User toUserEntity() {
        return User.builder()
                .user_id(id)
                .pw(pw)
                .confirm_pw(confirmPw)
                .name(name)
                .phone(tel1 + tel2 + tel3)
                .email(email)
                .role_id(1)
                .build();
    }
}
