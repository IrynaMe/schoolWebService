package com.schoolWebService.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@AllArgsConstructor
@Data
public class AllievoInClasseId implements Serializable {

    @Column(name = "anno_scolastico", nullable = false, length = 9)
    private String annoScolastico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cf_allievo", referencedColumnName = "cf", nullable = false)
    private Allievo allievo;


}