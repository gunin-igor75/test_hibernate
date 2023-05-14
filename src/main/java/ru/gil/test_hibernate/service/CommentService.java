package ru.gil.test_hibernate.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gil.test_hibernate.repository.CommentRepository;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
}
