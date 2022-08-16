# 내용 정리

# Chapter 10. Spring Boot와 Spring Security 연동

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7b362e4a-bc2a-43f6-9996-19d5b9e18492/Untitled.png)

- 계정을 만들어 로그인과 로그아웃을 진행
    - ID는 이메일로 등록, 비밀번호는 PasswordEncoder를 통해 생성
    - 패스워드를 인코딩하여 암호화 해 원본 내용을 볼 수 없도록 한다.
- 회원 정보를 구성해주고, 권한을 구분해준다.

# Chapter 11. 스프링 시큐리티 소셜 로그인

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ae38f3ca-86a8-499a-b642-6b83ee60cd14/Untitled.png)

- 소셜 로그인을 할 수 있도록 한다.(oauth2 사용)
    - 구글 계정으로 별도 절차 없이 로그인 처리 된다.
- 일반 로그인의 경우 쿠키(remember-me)를 생성하여 사이트를 닫고 재접속해도 로그인 기록이 남아있도록 한다.
- @PeAuthorize 를 활용해 접근 제한 설정을 해준다.

# Chapter 12. API 서비스 만들기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f524a50f-14eb-41ca-93d5-8912f682e04a/Untitled.png)

- JSON을 이용해 API 서버를 구성한다.
    - Yet Another REST Client 활용
- 제목과 내용이 있는 Note 를 작성할 수 있도록 한다.
    - 등록과 삭제, 수정이 가능하도록 한다.
- API 서버 필터를 이용해 JWT 토큰을 받아와 검사한다.
    - [https://jwt.io에](https://jwt.io에) 접속해 JWT 문자열을 구성한다.