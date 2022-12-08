package com.rest.docs.member;

import lombok.Getter;

/**
 * fileName : MemberResponse
 * author :  KimSangHoon
 * date : 2022/12/09
 */
@Getter
public class MemberResponse {

    private final Long id;
    private final String email;
    private final String name;


    public MemberResponse(final Member member) {
        this.email = member.getEmail();
        this.name = member.getName();
        this.id = member.getId();
    }
}
