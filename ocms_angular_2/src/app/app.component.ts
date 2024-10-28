import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterOutlet } from '@angular/router';
import { CourseService } from './course.service';
import { Course } from './Response';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule,ReactiveFormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  // title = 'ocms_angular';

  constructor( private courseService:CourseService, private router:Router){};

  courses:Course[]=[];

 

  ngOnInit(){
     this.loadAllCourses();
  }


  loadAllCourses() {
  
    this.courseService.getAllCourses().subscribe((response) => {
      console.log(response);

      this.courses = response.response;
      
    });
  }

  deleteCourse(id:any){

   this.courseService.deleteCourse(id).subscribe((response)=>{

    console.log(response);

     this.ngOnInit();
   })


  }

  addModalVisible = false;

  showAddCourseModal(){

    this.addModalVisible=true;
  }

  

title=new FormControl("",[]);
description=new FormControl("",[]);
category=new FormControl("{}",[]);
difficulty = new FormControl("true",[]);
price = new FormControl("true",[])
duration = new FormControl("true",[])
instructorName = new FormControl("true",[])
email = new FormControl("true",[])
imageUrl = new FormControl("true",[])

  addCourseForm=new FormGroup({

 title:this.title,
description:this.description,
category:this.category,
difficulty :this.difficulty,
price :this.price,
duration:this.duration,
instructorName :this.instructorName,
email:this.email,
imageUrl :this.imageUrl
  })

  
 
  saveCourse(){
 
     if(this.addCourseForm.valid){
 
       this.courseService.saveCourse(this.addCourseForm.value).subscribe((response)=>{
         console.log(response);
 
     });
       
     }
 
   }




}
