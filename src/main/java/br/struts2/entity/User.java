package br.struts2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by allan on 23/08/16.
 */
@Entity
@Table(name = "user",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"userid"}))
public class User {

    @Getter @Setter
    @Id
    @GeneratedValue
    @Column(name = "userid")
    private Integer userid;

    @Getter @Setter
    @Column(name = "username")
    private String username;

    @Getter @Setter
    @Column(name = "password")
    private String password;
}
