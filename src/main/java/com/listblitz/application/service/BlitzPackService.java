package com.listblitz.application.service;

import com.listblitz.adapter.repository.BlitzPackRepository;
import com.listblitz.api.dto.BlitzPackDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlitzPackService {

    private final BlitzPackRepository blitzPackRepository;

    @Autowired
    public BlitzPackService(BlitzPackRepository blitzPackRepository) {
        this.blitzPackRepository = blitzPackRepository;
    }

    public List<BlitzPackDto> getAllBlitzPacks() {
        return blitzPackRepository.findAll();
    }
}
