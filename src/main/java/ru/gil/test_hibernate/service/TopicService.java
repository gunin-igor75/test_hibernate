package ru.gil.test_hibernate.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gil.test_hibernate.entity.Topic;
import ru.gil.test_hibernate.repository.TopicRepository;

@Service
@RequiredArgsConstructor
public class TopicService {

    private final TopicRepository topicRepository;
    public Topic createTopic(Topic topic) {
       return topicRepository.save(topic);
    }

    public Topic findTopicById(int id) {
        return topicRepository.findById(id).orElseThrow();
    }

    public boolean deleteTopic(int id) {
        Topic topic = findTopicById(id);
        topicRepository.delete(topic);
        return true;
    }

    @Transactional
    public Topic updateTopic(Topic topic) {
        Topic persistentTopic = findTopicById(topic.getId());
        persistentTopic.setTitle("corrected");
        return persistentTopic;
    }
}
