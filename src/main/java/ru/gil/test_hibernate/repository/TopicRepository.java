package ru.gil.test_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gil.test_hibernate.entity.Topic;

import javax.swing.*;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
}
