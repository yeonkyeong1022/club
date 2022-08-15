package org.zerock.club.security;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootTest
public class PasswordTests {
    @Autowired
    private PasswordEncoder passwordEndcoder;

    @Test
    public void testEncoder(){
        String password = "1111";

        String enPw = passwordEndcoder.encode(password);

        System.out.println("enPw: "+enPw);

        boolean matchResult = passwordEndcoder.matches(password, enPw);

        System.out.print("matchResult: " + matchResult);

    }
}
