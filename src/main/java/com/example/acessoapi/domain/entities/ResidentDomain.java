package com.example.acessoapi.domain.entities;

public class ResidentDomain extends Person{

    private String cpf;
    private String adress;
    private String phone;

    private ResidentDomain (Builder builder){
        super(builder.id, builder.name);
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

    public static class Builder{

        private Long id;
        private String name;
        private String cpf;
        private String adress;
        private String phone;

        public Builder id (Long id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder cpf(String cpf){
            this.cpf = cpf;
            return this;
        }

        public Builder adress(String adress){
            this.adress = adress;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public ResidentDomain build(){
            return new ResidentDomain(this);
        }

    }
}
