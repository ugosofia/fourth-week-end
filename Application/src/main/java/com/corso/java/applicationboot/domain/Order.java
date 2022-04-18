package com.corso.java.applicationboot.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order")
public class Order {


    @Id
    private String id;
    private String client;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
