package com.example.courseapidata.Course.CourseService;

import com.example.courseapidata.Course.CourseEntity.Course;
import com.example.courseapidata.Course.CourseRepository.CourseRepository;
//import com.example.courseapidata.Topic.TopicEntity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

//    List<Topic> topics= new ArrayList<>(Arrays.asList(
//            new Topic("spring","Spring framework","Descrption"),
//            new Topic("java","Core","Java_Descrption"),
//            new Topic("spring_Boot","Spring_Boot_framework","Descrption"))
//    );

    public List<Course> getAllCourses(String id){

        //return  topics;
        List<Course> courses=new ArrayList<>();
        courseRepository.findByTopicId(id)
                .forEach(courses::add);
        return courses;
    }



    public Optional<Course> getCourse(String id){

      //eturn  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
//        List<Course> courses=new ArrayList<>();

        return courseRepository.findById(id);
    }



    public void addCourse(Course course) {


        //topics.add(topic);
        courseRepository.save(course);
    }



    public void updateCourse(Course course) {
//        for(int i=0;i<topics.size();i++)
//        {
//            Topic t=topics.get(i);
//             if (t.getId().equals(id)) {
//                 topics.set(i,topic);
//                 return;
//
//        }
//        }
        courseRepository.save(course);
    }




    public void deleteCourse(String id) {

        //topics.removeIf(t->t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
