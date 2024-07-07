package com.schoolWebService.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@EqualsAndHashCode
@Data

@NoArgsConstructor
@Table(name = "utente")
public class Utente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "username", nullable = false, length = 255)
    private String username;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "abilitato", nullable = false, length = 1)
    private int abilitato = 1;

    @Column(name = "profilo", nullable = false)
    private int profilo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cf_allievo", referencedColumnName = "cf")
    private Allievo allievo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cf_docente", referencedColumnName = "cf")
    @JsonIgnoreProperties({"nome", "cognome", "sesso", "statoNascita", "provinciaNascita",
            "comuneNascita", "dataNascita", "email", "abilitato"})
    private Docente docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cf_amministrativo", referencedColumnName = "cf")
    private Amministrativo amministrativo;

    public Utente(String username, String password, int abilitato, int profilo, Allievo allievo, Docente docente, Amministrativo amministrativo) {
        this.username = username;
        this.password = password;
        this.abilitato = abilitato;
        this.profilo = profilo;
        if (this.profilo == 1) {
            this.amministrativo = amministrativo;
        } else if (this.profilo == 2) {
            this.docente = docente;
        }else if (this.profilo == 1) {
            this.allievo = allievo;
        }
    }
}