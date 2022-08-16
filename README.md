# 내용 정리

# Chapter 10. Spring Boot와 Spring Security 연동
![Untitled (5)](https://user-images.githubusercontent.com/89283563/184798058-f16f5a93-eab2-4c95-a4ca-265fc7d5ec4a.png)


- 계정을 만들어 로그인과 로그아웃을 진행
    - ID는 이메일로 등록, 비밀번호는 PasswordEncoder를 통해 생성
    - 패스워드를 인코딩하여 암호화 해 원본 내용을 볼 수 없도록 한다.
- 회원 정보를 구성해주고, 권한을 구분해준다.

# Chapter 11. 스프링 시큐리티 소셜 로그인
![Untitled (6)](https://user-images.githubusercontent.com/89283563/184798071-77fa53e4-d49a-42e4-8603-3319549b1927.png)


- 소셜 로그인을 할 수 있도록 한다.(oauth2 사용)
    - 구글 계정으로 별도 절차 없이 로그인 처리 된다.
- 일반 로그인의 경우 쿠키(remember-me)를 생성하여 사이트를 닫고 재접속해도 로그인 기록이 남아있도록 한다.
- @PeAuthorize 를 활용해 접근 제한 설정을 해준다.

# Chapter 12. API 서비스 만들기
![Untitled (7)](https://user-images.githubusercontent.com/89283563/184798081-75b85ed3-236b-4801-b6ff-48ae855500b1.png)

- JSON을 이용해 API 서버를 구성한다.
    - Yet Another REST Client 활용
- 제목과 내용이 있는 Note 를 작성할 수 있도록 한다.
    - 등록과 삭제, 수정이 가능하도록 한다.
- API 서버 필터를 이용해 JWT 토큰을 받아와 검사한다.
    - [https://jwt.io에](https://jwt.io에) 접속해 JWT 문자열을 구성한다.
        ![Untitled](https://user-images.githubusercontent.com/89283563/184798105-9d87966b-f375-443b-be78-ccb8f7b254be.png)
