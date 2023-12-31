package com.javabrains.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "theatre")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Theatre extends BaseModel {

    private String name;
    private String address;

    @OneToMany
    private List<Hall> halls;

    @ManyToOne
    @JsonIgnore
    private City city;


}