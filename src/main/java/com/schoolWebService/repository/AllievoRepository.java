package com.schoolWebService.repository;

import com.schoolWebService.entity.Allievo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllievoRepository extends JpaRepository<Allievo, String> {
}
