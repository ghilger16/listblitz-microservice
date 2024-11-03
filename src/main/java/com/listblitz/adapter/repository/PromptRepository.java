package com.listblitz.adapter.repository;

import com.listblitz.api.dto.PromptDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromptRepository extends JpaRepository<PromptDto, Long> {

    @Query(value = "SELECT * FROM prompts WHERE blitz_pack_id = :blitzPackId ORDER BY RANDOM() LIMIT :limit", nativeQuery = true)
    List<PromptDto> findRandomPromptsByBlitzPackId(@Param("blitzPackId") Long blitzPackId, @Param("limit") int limit, int i);
}
