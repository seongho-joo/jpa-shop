<h1>🌱 스프링 부트와 JPA 활용 1 - 웹 애플리케이션 개발</h1> 

> 스프링부트 프로젝트 환경설정 정리   
> 강의 내용은 기본편 완강 후 정리할 예정  

<details>
<summary>Table of Contents</summary>

- [프로젝트 환경설정](#프로젝트-환경설정)
  - [프로젝트 생성](#프로젝트-생성)
  - [H2 데이터베이스 설치](#h2-데이터베이스-설치)
  - [JPA 및 DB 설정](#jpa-및-db-설정)
</details>

___

## 프로젝트 환경설정

### 프로젝트 생성
[스프링부트 스타트](https://start.spring.io/)에서 아래 사진과 같이 설정

![image](https://user-images.githubusercontent.com/45463495/160622343-b3afb8c7-d5db-4f34-a242-ed36c8a754e8.png "스프링부트 프로젝트 설정")

**Lombok 적용**
1. Preferences -> plugin -> lombok 검색 실행
2. Preferences -> Annotation Processor 검색 -> Enable annotation processing 체크
3. 재시작

### H2 데이터베이스 설치
- [H2](https://h2database.com/h2-2019-10-14.zip) 링크에서 다운로드 및 설치

### JPA 및 DB 설정
`src/main/resources/application.yml`
```yml
spring:
  datasource:
    url: jdbc:h2:tcp://localhost/~/jpashop
    username: sa
    password:
    driver-class-name: org.h2.Driver
  jpa:
    hibernate:
      ddl-auto: create
    properties:
      hibernate:
        # show_sql: true
        format_sql: true
logging.level:
  org.hibernate.SQL: debug
  # org.hibernate.type: trace
```
- spring.jpa.hibernate.ddl-auto: create
  - 애플리케이션 실행 시점에 테이블을 drop 하고, 다시 생성한다.