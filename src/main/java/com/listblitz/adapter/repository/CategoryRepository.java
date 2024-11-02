package com.listblitz.adapter.repository;

import com.listblitz.api.dto.CategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryDto, Long> {
    // Additional query methods (if needed) can be added here
}