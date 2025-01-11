package com.example.acessoapi.domain.entities;

public class VisitorDomain extends Person {

    private String rg;

    protected VisitorDomain(Long id, String name) {
        super(id, name);
    }

    protected VisitorDomain(String name) {
        super(name);
    }


    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
