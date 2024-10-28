import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Course, CourseResponse } from './Response';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

 
  constructor(private httpClient:HttpClient) { }


   //baseUrl="/api/v1/courses/get"

   getbaseUrl="http://localhost:8080/api/v1/course/get"

   baseUrl="http://localhost:8080/api/v1/course/delete"

   createbaseurl = "http://localhost:8080/api/v1/course/create"

  getAllCourses(): Observable<CourseResponse> {
    return this.httpClient.get<CourseResponse>(this.getbaseUrl);
  }

   
  deleteCourse(id:any):Observable<any> {

    return this.httpClient.delete(this.baseUrl+"/"+id)
  }

  saveCourse(course:any):Observable<Course>{

    return this.httpClient.post<Course>(this.createbaseurl,course)
  }

}

