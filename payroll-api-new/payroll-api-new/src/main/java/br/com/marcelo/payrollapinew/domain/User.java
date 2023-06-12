package br.com.marcelo.payrollapinew.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;

}
