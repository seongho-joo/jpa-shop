<h1>π± μ€νλ§ λΆνΈμ JPA νμ© 1 - μΉ μ νλ¦¬μΌμ΄μ κ°λ°</h1> 

> μ€νλ§λΆνΈ νλ‘μ νΈ νκ²½μ€μ  μ λ¦¬   
> κ°μ λ΄μ©μ κΈ°λ³ΈνΈ μκ° ν μ λ¦¬ν  μμ   

<details>
<summary>Table of Contents</summary>

- [νλ‘μ νΈ νκ²½μ€μ ](#νλ‘μ νΈ-νκ²½μ€μ )
  - [νλ‘μ νΈ μμ±](#νλ‘μ νΈ-μμ±)
  - [H2 λ°μ΄ν°λ² μ΄μ€ μ€μΉ](#h2-λ°μ΄ν°λ² μ΄μ€-μ€μΉ)
  - [JPA λ° DB μ€μ ](#jpa-λ°-db-μ€μ )
</details>

___

## νλ‘μ νΈ νκ²½μ€μ 

### νλ‘μ νΈ μμ±
[μ€νλ§λΆνΈ μ€ννΈ](https://start.spring.io/)μμ μλ μ¬μ§κ³Ό κ°μ΄ μ€μ 

![image](https://user-images.githubusercontent.com/45463495/160622343-b3afb8c7-d5db-4f34-a242-ed36c8a754e8.png "μ€νλ§λΆνΈ νλ‘μ νΈ μ€μ ")

**Lombok μ μ©**
1. Preferences -> plugin -> lombok κ²μ μ€ν
2. Preferences -> Annotation Processor κ²μ -> Enable annotation processing μ²΄ν¬
3. μ¬μμ

### H2 λ°μ΄ν°λ² μ΄μ€ μ€μΉ
- [H2](https://h2database.com/h2-2019-10-14.zip) λ§ν¬μμ λ€μ΄λ‘λ λ° μ€μΉ

### JPA λ° DB μ€μ 
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
  - μ νλ¦¬μΌμ΄μ μ€ν μμ μ νμ΄λΈμ drop νκ³ , λ€μ μμ±νλ€.