package com.listblitz.application.service;

import com.listblitz.adapter.repository.PromptRepository;
import com.listblitz.api.dto.PromptDto;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromptService {

    private final PromptRepository promptRepository;

    public PromptService(PromptRepository promptRepository) {
        this.promptRepository = promptRepository;
    }

    public List<PromptDto> getRandomPrompts(Long blitzPackId, int limit) {
        return promptRepository.findRandomPromptsByBlitzPackId(blitzPackId, PageRequest.of(0, limit));
    }
}
