# spring(boot)-tutorial

MVC, TDD

H2 DB install,
chmod 755 h2.sh - Mac

H@ DB RUN - ./h2.sh

jdbc way, spring 통합 테스트, jpa

------ jpa, 참조: Member.java---

jpa : interface, hibernate(구현체) 라이브러리를 주로 사용. mybatis와 비교

@Entity - 
jpa가 관리하는 entity

@Id - pk를 mappig 해줘야 함.
@GeneratedValue

@Column - column mapping

--- JpaMemberRepository.java

EntityManager - jpa는 EntityManager로 모든 동작을 하기 때문에 추가.
spring boot가 자동으로 EntityManager DB까지 다 연결해서 만들어줌

persist - e.g) em.persist()  // EntityManager em

find(), 

createQuery() - jpql, 객체 entity를 대상으로 쿼리를 날림

cmd + option + n - inline


---- MemberService

@Transactional - jpa를 쓸려면 항상 Transaction이 있어야 함, service에


지식 출처 : 스프링 입문 - 김영한(우아한형제들 개발팀장?) 강사님