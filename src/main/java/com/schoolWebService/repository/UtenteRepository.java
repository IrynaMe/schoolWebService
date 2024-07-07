package com.schoolWebService.repository;

import com.schoolWebService.entity.Utente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.Optional;
@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {

    Optional<Utente> findByUsernameAndPassword(String username, String password);

    Optional<Utente> findByUsername(String username);

    @Query("SELECT u FROM Utente u LEFT JOIN FETCH u.docente WHERE u.username = :username")
    Optional<Utente> findByUsernameWithDocente(@Param("username") String username);
}