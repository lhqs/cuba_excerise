package com.company.cubashare.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CUBASHARE_CUSTOMER")
@Entity(name = "cubashare_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -9198399741242954694L;

    @NotNull
    @Column(name = "USERNAME", nullable = false)
    protected String username;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}