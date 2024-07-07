package com.schoolWebService.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@EqualsAndHashCode
@Data
@AllArgsConstructor
@Table(name = "docente_classe")
public class DocenteClasse implements Serializable {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private DocenteClasseId id;

    @Column(name = "abilitato", nullable = false, length=1)
    private int abilitato=1;
}