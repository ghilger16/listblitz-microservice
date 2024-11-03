package com.listblitz.adapter.repository;

import com.listblitz.api.dto.BlitzPackDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlitzPackRepository extends JpaRepository<BlitzPackDto, Long> {
    // Additional query methods (if needed) can be added here
}