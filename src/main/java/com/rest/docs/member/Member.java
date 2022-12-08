package com.rest.docs.member;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * fileName : Member
 * author :  KimSangHoon
 * date : 2022/12/08
 */
@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable=false, unique=true)
    private String email;

    @Column(name = "name", nullable=false)
    private String name;

    @Column(name = "created_at", nullable=false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable=false)
    private LocalDateTime updatedAt;

    public Member(String email, String name) {
        this.email = email;
        this.name = name;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
