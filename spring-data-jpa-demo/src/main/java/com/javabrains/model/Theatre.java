package com.javabrains.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theatre")
@Getter
@Setter
public class Theatre extends BaseModel {

    private String name;
    private String address;

    @OneToMany
    private List<Hall> halls;

    @ManyToOne
    private City city;


}