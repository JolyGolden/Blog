package org.itstep.demo.entities;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class DbUser {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String email;

    private String password;


    public DbUser(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
