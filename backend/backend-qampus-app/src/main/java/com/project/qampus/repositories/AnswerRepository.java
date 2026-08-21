package com.project.qampus.repositories;

import com.project.qampus.model.comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<comentario, String> {
}