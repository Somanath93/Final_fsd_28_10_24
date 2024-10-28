package com.ocms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocms.entity.Course;
import com.ocms.exception.NotFoundException;
import com.ocms.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	// save course

	public Course createCourse(Course course) {

		return courseRepository.save(course);

	}

	// get all courses

	public List<Course> getAllCourses() {

		List<Course> allCourses = courseRepository.findAll();

		return allCourses;

	}

	// get course by id

	public Course getCourseById(Long id) {

		Optional<Course> optionalCourse = courseRepository.findById(id);

		if (optionalCourse.isPresent()) {

			return optionalCourse.get();

		} else {

			throw new NotFoundException("course not found for given id !!!");
		}
	}

	// update course by id

	public Course updateById(Course course, Long id) {

		Optional<Course> optionalCourse = courseRepository.findById(id);

		if (optionalCourse.isPresent()) {

			 Course existingCourse = optionalCourse.get();
			 
			 existingCourse.setTitle(course.getTitle());
			 existingCourse.setCategory(course.getCategory());
			 existingCourse.setDescription(course.getDescription());
			 existingCourse.setDifficulty(course.getDifficulty());
			 existingCourse.setDuration(course.getDuration());
			 existingCourse.setEmail(course.getEmail());
			 existingCourse.setImageUrl(course.getImageUrl());
			 existingCourse.setInstructorName(course.getInstructorName());
			 existingCourse.setPrice(course.getPrice());
			 
			return courseRepository.save(existingCourse);			 

		} else {

			throw new NotFoundException("course not found for given id !!!");
		}

	}
	
	// delete by id
	
	public String deleteById(Long id) {
		
		Optional<Course> optionalCourse = courseRepository.findById(id);

		if (optionalCourse.isPresent()) {

			courseRepository.deleteById(id);
			
			return "course deleted !!";

		} else {

			throw new NotFoundException("course not found for given id !!!");
		}
		
	}	
	
}
