package org.zerock.club.security;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.club.security.util.JWTUtil;

public class JWTTests {
    private JWTUtil jwtUtil;

    @BeforeEach
    public void testBefore(){
        System.out.println("testBefore..................");
        jwtUtil = new JWTUtil();
    }

    @Test
    public void testEncode() throws Exception{
        String email = "user95@zerock.org";
        String str  = jwtUtil.generateToken(email);

        System.out.println(str);
    }
}
