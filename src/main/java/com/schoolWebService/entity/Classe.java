package com.schoolWebService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@EqualsAndHashCode
@Data
@AllArgsConstructor
@Table(name = "classe")

public class Classe implements Serializable {

    @EmbeddedId
    private ClasseId id;

    @Column(name = "abilitato", nullable = false, length = 1)
    private int abilitato = 1;
}

