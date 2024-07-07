package com.schoolWebService.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode
@Data
@AllArgsConstructor
@Table(name = "docente_materia")
public class DocenteMateria implements Serializable {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private DocenteMateriaId id;

    @Column(name = "abilitato", nullable = false, length=1)
    private int abilitato=1;
}