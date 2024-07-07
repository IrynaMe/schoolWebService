package com.schoolWebService.controller;

import com.schoolWebService.UtenteDTO;
import com.schoolWebService.entity.Utente;
import com.schoolWebService.service.UtenteService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@Slf4j
@Validated
@RestController
@RequestMapping("/scuola")
@SecurityRequirement(name = "wsRestSecurityScheme")
@CrossOrigin(origins = "*")
public class UtenteController {
    private final UtenteService utenteService;

    public UtenteController(UtenteService utenteService) {
        this.utenteService = utenteService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
        Optional<Utente> utente = utenteService.getByNamePassword(username, password);
       // log.info("Searching for Utente with username: {}", username);
      //  log.info("Password: {}", password);
        if (utente == null) {
            return ResponseEntity.notFound().build();
        }
        UtenteDTO utenteDTO = new UtenteDTO(utente.get());
        return ResponseEntity.ok(utenteDTO);
    }


}//