package com.schoolWebService.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@AllArgsConstructor
@Data
public class ClasseId implements Serializable {

    @EqualsAndHashCode.Include
    @Column(name = "livello", nullable = false, length = 1)
    private int livello;

    @EqualsAndHashCode.Include
    @Column(name = "sezione", nullable = false, length = 2)
    private String sezione;
}