package com.rest.docs.member;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * fileName : MemberSignupRequest
 * author :  KimSangHoon
 * date : 2022/12/09
 */
@Getter
public class MemberModificationRequest {

    @NotNull
    @Size(max=10)
    private String name;
}
