package com.example.courseapidata.Topic.TopicService;

import com.example.courseapidata.Topic.TopicEntity.Topic;
import com.example.courseapidata.Topic.TopicRepository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    List<Topic> topics= new ArrayList<>(Arrays.asList(
//            new Topic("spring","Spring framework","Descrption"),
//            new Topic("java","Core","Java_Descrption"),
//            new Topic("spring_Boot","Spring_Boot_framework","Descrption"))
//    );

    public List<Topic> getAllTopics(){

        //return  topics;
        List<Topic> topics=new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }



    public Optional<Topic> getTopic(String id){

      //eturn  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        List<Topic> topics=new ArrayList<>();
        return topicRepository.findById(id);
    }



    public void addTopic(Topic topic) {


        //topics.add(topic);
        topicRepository.save(topic);
    }



    public void updateTopic(Topic topic, String id) {
//        for(int i=0;i<topics.size();i++)
//        {
//            Topic t=topics.get(i);
//             if (t.getId().equals(id)) {
//                 topics.set(i,topic);
//                 return;
//
//        }
//        }
        topicRepository.save(topic);
    }




    public void deleteTopic(String id) {

        //topics.removeIf(t->t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
