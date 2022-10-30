package com.example.hello;
import static org.assertj.core.api.Assertions.*;
import com.example.hello.domain.Member;
import com.example.hello.repository.MemberRepository;
import com.example.hello.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class HelloApplicationTests {

      MemoryMemberRepository repository = new MemoryMemberRepository();
    @AfterEach
    public void afterEach(){
        repository.clearStore(); // test 할때마다 지워주는 역할
    }
    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        Assertions.assertEquals(member, null);


    }
    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring1");
        repository.save(member2);
    }


}
