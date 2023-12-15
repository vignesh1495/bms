package com.javabrains.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="city")
@Getter
@Setter
public class City extends BaseModel {

    String name;
    @OneToMany
    List<Theatre> theatres;
}
