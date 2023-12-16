package com.javabrains.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="city")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City extends BaseModel {

    String name;
    @OneToMany
    List<Theatre> theatres;
}
