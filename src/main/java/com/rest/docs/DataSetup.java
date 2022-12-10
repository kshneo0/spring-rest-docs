package com.rest.docs;

import com.rest.docs.member.Member;
import com.rest.docs.member.MemberRepository;
import com.rest.docs.member.MemberStatus;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * fileName : DataSetup
 * author :  KimSangHoon
 * date : 2022/12/08
 */
@Component
@AllArgsConstructor
public class DataSetup implements ApplicationRunner {

    private final MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        final List<Member> members = new ArrayList<>();

        members.add(new Member("yun@bbb.com", "yun", MemberStatus.BAN));
        members.add(new Member("jin@bbb.com", "jin", MemberStatus.NORMAL));
        members.add(new Member("han@bbb.com", "han", MemberStatus.NORMAL));
        members.add(new Member("jo@bbb.com", "jo", MemberStatus.LOCK));

        memberRepository.saveAll(members);
    }
}
