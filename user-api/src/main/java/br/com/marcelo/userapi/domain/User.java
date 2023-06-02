package br.com.marcelo.userapi.domain;

import lombok.*;
import static lombok.EqualsAndHashCode.Include;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "TB_USER")
public class User {

    @Include
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;

}
