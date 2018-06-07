package com.example.courseapidata.Course.CourseRepository;

import com.example.courseapidata.Course.CourseEntity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);

}
