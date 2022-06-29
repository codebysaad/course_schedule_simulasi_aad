package com.dicoding.courseschedule.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//TODO 1 : Define a local database table using the schema in app/schema/course.json
@Entity(tableName = DataCourseName.TABLE_NAME)
data class Course(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = DataCourseName.COL_ID)
    val id: Int = 0,
    @ColumnInfo(name = DataCourseName.COL_COURSE_NAME)
    val courseName: String,
    @ColumnInfo(name = DataCourseName.COL_DAY)
    val day: Int,
    @ColumnInfo(name = DataCourseName.COL_START_TIME)
    val startTime: String,
    @ColumnInfo(name = DataCourseName.COL_END_TIME)
    val endTime: String,
    @ColumnInfo(name = DataCourseName.COL_LECTURER)
    val lecturer: String,
    @ColumnInfo(name = DataCourseName.COL_NOTE)
    val note: String
)
