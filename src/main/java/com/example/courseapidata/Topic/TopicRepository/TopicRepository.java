package com.example.courseapidata.Topic.TopicRepository;

import com.example.courseapidata.Topic.TopicEntity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {


}
