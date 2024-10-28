package com.ocms.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="courses")
public class Course {
	
	//{ title, description, category, difficulty (easy, medium, hard), price,duration, instructorName, email, imageUrl }. 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title",nullable = false)
	private String title;
	
	@Column(name="description",nullable = false)
	private String description;
	
	@Column(name="category",nullable = false)
	private String category;
	
	@Column(name="difficulty",nullable = false)
	private String difficulty;
	
	@Column(name="price",nullable = false)
	private Long price;
	
	@Column(name="duration",nullable = false)
	private Double duration;
	
	@Column(name="instructorname",nullable = false)
	private String instructorName;
	
	@Column(name="email",nullable = false)
	private String email;
	
	@Column(name="imageUrl",nullable = false,length = Integer.MAX_VALUE)
	private String imageUrl;
	
	@Column(name="created_at")
	@CreationTimestamp
	private Timestamp createdAt;
	
	@Column(name="updated_at")
	@UpdateTimestamp
	private Timestamp updatedAt;

	public Course() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Course(Long id, String title, String description, String category, String difficulty, Long price,
			Double duration, String instructorName, String email, String imageUrl, Timestamp createdAt,
			Timestamp updatedAt) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.difficulty = difficulty;
		this.price = price;
		this.duration = duration;
		this.instructorName = instructorName;
		this.email = email;
		this.imageUrl = imageUrl;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", category=" + category
				+ ", difficulty=" + difficulty + ", price=" + price + ", duration=" + duration + ", instructorName="
				+ instructorName + ", email=" + email + ", imageUrl=" + imageUrl + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
		
	
}
