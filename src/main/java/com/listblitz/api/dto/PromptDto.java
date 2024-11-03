package com.listblitz.api.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "prompts")
public class PromptDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String promptText;

    @Column(nullable = false)
    private Long blitzPackId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPromptText() {
        return promptText;
    }

    public void setPromptText(String promptText) {
        this.promptText = promptText;
    }

    public Long getBlitzPackId() {
        return blitzPackId;
    }

    public void setBlitzPackId(Long blitzPackId) {
        this.blitzPackId = blitzPackId;
    }
}
