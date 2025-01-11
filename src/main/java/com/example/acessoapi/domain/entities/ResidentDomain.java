package com.example.acessoapi.domain.entities;

public class ResidentDomain extends Person{

    private String cpf;
    private String adress;
    private String phone;

    private ResidentDomain (ResidentDomainBuilder builder){
        super(builder.name);
        this.cpf = builder.cpf;
        this.adress = builder.adress;
        this.phone = builder.phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static class ResidentDomainBuilder{

        private String name;
        private String cpf;
        private String adress;
        private String phone;

        public ResidentDomainBuilder name(String name){
            this.name = name;
            return this;
        }

        public ResidentDomainBuilder cpf(String cpf){
            this.cpf = cpf;
            return this;
        }

        public ResidentDomainBuilder adress(String adress){
            this.adress = adress;
            return this;
        }

        public ResidentDomainBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public ResidentDomain build(){
            return new ResidentDomain(this);
        }

    }
}
