package com.schoolWebService.service;

import com.schoolWebService.entity.Utente;
import com.schoolWebService.repository.UtenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    @Transactional(readOnly = true)
    public Optional<Utente> getByNamePassword(String username, String password) {
        return utenteRepository.findByUsernameAndPassword(username, password);
    }

    @Transactional(readOnly = true)
    public Optional<Utente> getByUsername(String username) {
        return utenteRepository.findByUsername(username);
    }

    // Add a method to eagerly fetch Utente with Docente
    @Transactional(readOnly = true)
    public Optional<Utente> getUtenteWithDocente(String username) {
        return utenteRepository.findByUsernameWithDocente(username);
    }
}