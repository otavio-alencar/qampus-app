package com.project.qampus.dto;

import com.project.qampus.model.comentario;

import java.time.LocalDateTime;

public record AnswerResponseDTO(
        String id,
        String content,
        String userId,
        String postId,
        LocalDateTime createdAt
) {

    public static AnswerResponseDTO from(comentario comentario) {
        return new AnswerResponseDTO(
                comentario.getId(),
                comentario.getContent(),
                comentario.getUser().getId(),
                comentario.getPost().getId(),
                comentario.getCreatedAt()
        );
    }
}