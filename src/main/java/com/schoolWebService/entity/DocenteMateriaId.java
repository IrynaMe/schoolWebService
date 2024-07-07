package com.schoolWebService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@Data
@AllArgsConstructor
public class DocenteMateriaId implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cf_docente", referencedColumnName = "cf", insertable = false, updatable = false)
    private Docente docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nome_materia", referencedColumnName = "nome", insertable = false, updatable = false)
    private Materia materia;
}