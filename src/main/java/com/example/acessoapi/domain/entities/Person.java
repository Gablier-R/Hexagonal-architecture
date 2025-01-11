package com.example.acessoapi.domain.entities;

public abstract class Person {

    private Long id;
    private String name;

    protected Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Person(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
