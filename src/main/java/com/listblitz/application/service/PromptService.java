package com.listblitz.application.service;

import com.listblitz.adapter.repository.PromptRepository;
import com.listblitz.api.dto.PromptDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromptService {

    private final PromptRepository promptRepository;

    @Autowired
    public PromptService(PromptRepository promptRepository) {
        this.promptRepository = promptRepository;
    }

    public List<PromptDto> getPromptsForBlitzPack(Long blitzPackId, int offset, int limit) {
        return promptRepository.findRandomPromptsByBlitzPackId(blitzPackId, offset, limit);
    }
}
