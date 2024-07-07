package com.schoolWebService.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@AllArgsConstructor
@Data
public class DocenteClasseId implements Serializable {

    @Column(name = "anno_scolastico", nullable = false, length = 9)
    private String annoScolastico;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cf_docente", referencedColumnName = "cf", nullable = false)
    private Docente docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "livello_classe", referencedColumnName = "livello", nullable = false),
            @JoinColumn(name = "sezione_classe", referencedColumnName = "sezione", nullable = false)
    })
    private Classe classe;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nome_materia", referencedColumnName = "nome",nullable = false)
    private Materia materia;
}