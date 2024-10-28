package com.ocms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocms.entity.Course;
import com.ocms.responsehandeler.GlobalResponseHandler;
import com.ocms.service.CourseService;

@RestController
@RequestMapping("/api/v1/course")
@CrossOrigin
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping("/create")
	public ResponseEntity<Object> createCourse(@RequestBody Course course) {

		Course createCourse = courseService.createCourse(course);

		return GlobalResponseHandler.createResponse(createCourse, HttpStatus.CREATED,
				"course created successfully !!!");
	}

	@GetMapping("/get")
	public ResponseEntity<Object> getAllCouse() {

		List<Course> allCourses = courseService.getAllCourses();

		return GlobalResponseHandler.createResponse(allCourses, HttpStatus.OK,
				" all courses fetched successfully !!!");
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> createCourse(@PathVariable Long id) {

		Course courseById = courseService.getCourseById(id);

		return GlobalResponseHandler.createResponse(courseById, HttpStatus.OK, "course fetched successfully !!!");
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateCourse(@RequestBody Course course, @PathVariable Long id) {

		Course updatedCourse = courseService.updateById(course, id);

		return GlobalResponseHandler.createResponse(updatedCourse, HttpStatus.OK,
				"course updated successfully !!!");
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteCourse(@PathVariable Long id) {

		String deleteById = courseService.deleteById(id);

		return GlobalResponseHandler.createResponse(deleteById, HttpStatus.OK, "course deleted successfully !!!");
	}

}
