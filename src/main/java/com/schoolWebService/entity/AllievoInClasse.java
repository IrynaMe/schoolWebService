package com.schoolWebService.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode
@Data
@AllArgsConstructor
@Table(name = "allievo_in_classe")
public class AllievoInClasse implements Serializable {
    @EmbeddedId
    @EqualsAndHashCode.Include
    private AllievoInClasseId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "livello_classe", referencedColumnName = "livello", nullable = false),
            @JoinColumn(name = "sezione_classe", referencedColumnName = "sezione", nullable = false)
    })
    private Classe classe;

}