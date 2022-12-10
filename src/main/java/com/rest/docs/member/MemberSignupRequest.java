package com.rest.docs.member;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * fileName : MemberSignupRequest
 * author :  KimSangHoon
 * date : 2022/12/09
 */
@Getter
public class MemberSignupRequest {

    @Email
    @Size(max = 30)
    private String email;

    @NotNull
    @Size(max = 10)
    private String name;

    private MemberStatus status;

    public Member toEntity() {
        return new Member(email, name, status);
    }
}
