package com.rest.docs.member;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * fileName : MemberSignupRequest
 * author :  KimSangHoon
 * date : 2022/12/09
 */
@Getter
public class MemberSignupRequest {

    @Email
    private String email;

    @NotNull
    private String name;

    public Member toEntity(){
        return new Member(email, name);
    }
}
