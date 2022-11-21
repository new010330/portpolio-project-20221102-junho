package com.frombio.personalproject20221102junho.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private int id;
    private String user_id;
    private String oauth_id;
    private String pw;
    private String confirm_pw;
    private String name;
    private int phone;
    private String email;
    private int role_id;
    private Role role;

    private LocalDateTime create_date;
    private LocalDateTime update_date;
}
