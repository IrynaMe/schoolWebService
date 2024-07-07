package com.schoolWebService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "allievo")
public class Allievo implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "cf", nullable = false, length = 16)
    private String cf;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @Column(name = "cognome", nullable = false, length = 255)
    private String cognome;

    @Column(name = "sesso", nullable = false, length = 1)
    private String sesso;

    @Column(name = "stato_nascita", nullable = false, length = 255)
    private String statoNascita;

    @Column(name = "provincia_nascita", nullable = false, length = 255)
    private String provinciaNascita;

    @Column(name = "comune_nascita", nullable = false, length = 255)
    private String comuneNascita;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascita", nullable = false)
    private Date dataNascita;

    @Column(name = "email", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "abilitato", nullable = false, length=1)
    private int abilitato=1;

    public Allievo(String cf) {
        this.cf = cf;
    }
}
