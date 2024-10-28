export interface CourseResponse {
    response: Course[]
    httpststus: string
    message: string
  }
  
  export interface Course {
    id: number
    title: string
    description: string
    category: string
    difficulty: string
    price: number
    duration: number
    instructorName: string
    email: string
    imageUrl: string
    createdAt: string
    updatedAt: string
  }
  