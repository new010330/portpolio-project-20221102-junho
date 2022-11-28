package com.frombio.personalproject20221102junho.repository;

import com.frombio.personalproject20221102junho.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepository {
    public int save(User user);
}
