package ru.gil.test_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gil.test_hibernate.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
