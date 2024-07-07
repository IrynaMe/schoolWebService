package com.schoolWebService;

import com.schoolWebService.entity.Utente;
import lombok.Data;

@Data
public class UtenteDTO {
    private String username;
    private String password;
    private int abilitato;
    private int profilo;
    private String cfAllievo;
    private String cfAmministrativo;
    private String cfDocente; // or include the cf from Docente directly
    // other fields as needed

    public UtenteDTO(Utente utente) {
        this.username = utente.getUsername();
        this.password = utente.getPassword();
        this.abilitato = utente.getAbilitato();
        this.profilo = utente.getProfilo();
        this.cfAllievo = utente.getAllievo() != null ? utente.getAllievo().getCf() : null;
        this.cfAmministrativo = utente.getAmministrativo() != null ? utente.getAmministrativo().getCf() : null;
        this.cfDocente = utente.getDocente() != null ? utente.getDocente().getCf() : null;
    }
}