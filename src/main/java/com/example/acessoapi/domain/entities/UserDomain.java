package com.example.acessoapi.domain.entities;

public class UserDomain extends Person{

    private String email;
    private String password;
    private Boolean admin;

    public UserDomain(Builder builder) {
        super( builder.id, builder.name);
        this.email = builder.email;
        this.password = builder.password;
        this.admin = builder.admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String email;
        private String password;
        private Boolean admin;

        public Builder id (Long id){
            this.id = id;
            return this;
        }

        public Builder name (String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder admin(Boolean admin) {
            this.admin = admin;
            return this;
        }

        public UserDomain build() {
            return new UserDomain(this);
        }
    }
}
