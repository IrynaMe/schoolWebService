package com.schoolWebService.service;

import com.schoolWebService.repository.AllievoRepository;
import org.springframework.stereotype.Service;

@Service
public class AllievoService {
    private final AllievoRepository allievoRepository;

    public AllievoService(AllievoRepository allievoRepository) {
        this.allievoRepository = allievoRepository;
    }
}
