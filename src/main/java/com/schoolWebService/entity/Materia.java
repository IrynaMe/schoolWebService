package com.schoolWebService.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode
@Data
@AllArgsConstructor
@Table(name = "materia")
public class Materia implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "codice", nullable = false, length = 10)
    private String codice;

    @Column(name = "nome", nullable = false, length = 255, unique = true)
    private String nome;

    @Column(name = "abilitato", nullable = false, length=1)
    private int abilitato=1;
}