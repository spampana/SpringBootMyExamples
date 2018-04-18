package com.helpezee.springbootstarter.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, String> {
	
	public List<Lesson> findByName(String name);
	
	public List<Lesson> findByDescription(String desc);
	
	public List<Lesson> findByCourseId(String courseId);

}
