package com.example.hello.service;

import com.example.hello.domain.Member;
import com.example.hello.repository.MemberRepository;
import com.example.hello.repository.MemoryMemberRepository;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    /**
     * 회원가입
     */
    public Long join(Member member){
        // 같은 이름이 있는 중복 회원 x
        O
        memberRepository.save(member);
        return member.getId();

    }

}
