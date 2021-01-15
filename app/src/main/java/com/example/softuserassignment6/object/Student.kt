package com.example.softuserassignment6.`object`

import com.example.softuserassignment6.model.student

object Student {
    var lstStudent= arrayListOf<student>()
    fun addStudent(){
        lstStudent= arrayListOf();
        lstStudent.add(student(
            studentName ="Aayush Maharjan",studentAge = "21",studentGender = "Male",
            studentAddress ="Kitipur", imageLink = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVzcUGslfVPVqes4Z0oY0vaSifqQ626RLUAw&usqp=CAU"
        ))

        lstStudent.add(student(
            studentName ="Aavash Neupane",studentAge = "20",studentGender = "Male",
            studentAddress ="Kathmandu", imageLink = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKu0otXsIZXhoLdMdcnkbhlAdqkieKanP1SA&usqp=CAU"
        ))
    }
}