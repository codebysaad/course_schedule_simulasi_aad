package com.dicoding.courseschedule.data

//TODO 1 : Define a local database table using the schema in app/schema/course.json
data class Course(
    val id: Int = 0,
    val courseName: String,
    val day: Int,
    val startTime: String,
    val endTime: String,
    val lecturer: String,
    val note: String
)
