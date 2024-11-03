package com.listblitz.api.rest;

import com.listblitz.api.dto.PromptDto;
import com.listblitz.application.service.PromptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/prompts")
public class PromptController {

    private final PromptService promptService;

    @Autowired
    public PromptController(PromptService promptService) {
        this.promptService = promptService;
    }

    // Fetch prompts in batches
    @GetMapping
    public List<PromptDto> getPrompts(@RequestParam Long blitzPackId,
                                      @RequestParam(defaultValue = "0") int offset,
                                      @RequestParam(defaultValue = "10") int limit) {
        return promptService.getPromptsForBlitzPack(blitzPackId, offset, limit);
    }
}