package com.rest.docs.member;

import lombok.Getter;

import javax.validation.constraints.NotNull;

/**
 * fileName : MemberSignupRequest
 * author :  KimSangHoon
 * date : 2022/12/09
 */
@Getter
public class MemberModificationRequest {

    @NotNull
    private String name;
}
