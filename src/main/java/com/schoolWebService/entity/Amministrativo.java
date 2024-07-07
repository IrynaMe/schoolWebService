package com.schoolWebService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "amministrativo", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class Amministrativo implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "cf", length = 16, nullable = false)
    private String cf;

    @Column(name = "nome", length = 255, nullable = false)
    private String nome;

    @Column(name = "cognome", length = 255, nullable = false)
    private String cognome;

    @Column(name = "sesso", length = 1, nullable = false)
    private String sesso;

    @Column(name = "stato_nascita", length = 255, nullable = false)
    private String statoNascita;

    @Column(name = "provincia_nascita", length = 255, nullable = false)
    private String provinciaNascita;

    @Column(name = "comune_nascita", length = 255, nullable = false)
    private String comuneNascita;

    @Column(name = "data_nascita", nullable = false)
    private Date dataNascita;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @Column(name = "abilitato", nullable = false, length=1)
    private int abilitato=1;
    public Amministrativo(String cf) {
        this.cf = cf;
    }
}
