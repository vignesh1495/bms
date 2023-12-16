package com.javabrains.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name="user",uniqueConstraints = {@UniqueConstraint(columnNames = {"firstname", "lastname"})})
public class User extends BaseModel {

	private String firstname;
	private String lastname;
	private String password;
	private String address;
}
