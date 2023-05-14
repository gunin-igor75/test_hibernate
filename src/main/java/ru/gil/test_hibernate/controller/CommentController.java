package ru.gil.test_hibernate.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gil.test_hibernate.service.CommentService;

@RestController
@RequestMapping("/topic")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

}
