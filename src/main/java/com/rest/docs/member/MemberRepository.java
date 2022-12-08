package com.rest.docs.member;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * fileName : MemberRepository
 * author :  KimSangHoon
 * date : 2022/12/08
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}
