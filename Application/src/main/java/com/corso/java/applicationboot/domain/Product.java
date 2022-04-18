package com.corso.java.applicationboot.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {


    @Id
    private String id;
    private String name;
    private Integer qnt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}