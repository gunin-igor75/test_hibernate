package ru.gil.test_hibernate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gil.test_hibernate.entity.Topic;
import ru.gil.test_hibernate.service.TopicService;

@RestController
@RequestMapping("/topic")
@RequiredArgsConstructor
public class TopicController {

    private final TopicService topicService;

    @PostMapping
    public ResponseEntity<Topic> createTopic(@RequestBody Topic topic) {
        Topic newTopic = topicService.createTopic(topic);
        return ResponseEntity.ok(newTopic);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteTopic(@PathVariable(name = "id") int id) {
        boolean isDeleteTopic = topicService.deleteTopic(id);
        return ResponseEntity.ok(isDeleteTopic);
    }

    @GetMapping("{id}")
    public ResponseEntity<Topic> getTopic(@PathVariable(name = "id") int id) {
        Topic topic = topicService.findTopicById(id);
        return ResponseEntity.ok(topic);
    }

    @PatchMapping
    public ResponseEntity<Topic> updateTopic(@RequestBody Topic topic) {
        Topic newTopic = topicService.updateTopic(topic);
        return ResponseEntity.ok(newTopic);
    }
}
