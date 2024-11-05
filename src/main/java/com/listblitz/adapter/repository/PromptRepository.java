package com.listblitz.adapter.repository;

import com.listblitz.api.dto.PromptDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromptRepository extends JpaRepository<PromptDto, Long> {

    @Query("SELECT p FROM PromptDto p WHERE p.blitzPackId = :blitzPackId ORDER BY function('RANDOM')")
    List<PromptDto> findRandomPromptsByBlitzPackId(Long blitzPackId, Pageable pageable);
}
