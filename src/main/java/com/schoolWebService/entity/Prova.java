package com.schoolWebService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@EqualsAndHashCode
@Data
@AllArgsConstructor
@Table(name = "prova")
public class Prova implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "data_ora", nullable = false)
    private Date dataOra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cf_allievo", referencedColumnName = "cf", insertable = false, updatable = false)
    private Allievo allievo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cf_docente", referencedColumnName = "cf", insertable = false, updatable = false)
    private Docente docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nome_materia", referencedColumnName = "nome", insertable = false, updatable = false)
    private Materia materia;

    @Column(name = "voto")
    private Integer voto;

    @Column(name = "abilitato", nullable = false, length=1)
    private int abilitato=1;
}