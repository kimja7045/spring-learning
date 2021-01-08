package hello.hellospring.domain;

public class Member {
    private Long id; // 시스템이 정하는 아이디

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
