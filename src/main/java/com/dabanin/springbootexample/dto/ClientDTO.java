package com.dabanin.springbootexample.dto;

/**
 * Created by D.Abanin on 06.04.2017.
 */
public class ClientDTO {

    private String name;

    private Boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
