package com.myclass.service;

import java.util.List;

import com.myclass.dto.CategoryDto;
import com.myclass.dto.CourseDto;
import com.myclass.entity.Category;
import com.myclass.entity.Course;

public interface CourseService {
	List<CourseDto> findAll();
	List<CourseDto> findDiscount();
	
	CourseDto findById(int id);
	void add(CourseDto courseDto);
	void update(CourseDto courseDto);
	void delete(int id);
	
	List<CourseDto> findByPopular();
	List<CourseDto> findAllCategory(int id);
	List<CourseDto> findAllNew();
}
