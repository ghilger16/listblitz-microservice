package com.listblitz.api.rest;

import com.listblitz.api.dto.BlitzPackDto;
import com.listblitz.application.service.BlitzPackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/blitz-packs") // Updated endpoint path
public class BlitzPackController {

    private final BlitzPackService blitzPackService;

    @Autowired
    public BlitzPackController(BlitzPackService blitzPackService) {
        this.blitzPackService = blitzPackService;
    }

    @GetMapping
    public List<BlitzPackDto> getAllBlitzPacks() {
        return blitzPackService.getAllBlitzPacks();
    }
}
