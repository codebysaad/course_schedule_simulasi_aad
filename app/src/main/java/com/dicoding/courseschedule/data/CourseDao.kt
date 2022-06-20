package com.dicoding.courseschedule.data

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.sqlite.db.SupportSQLiteQuery

//TODO 2 : Define data access object (DAO)
interface CourseDao {

    fun getNearestSchedule(query: SupportSQLiteQuery): LiveData<Course?>

    fun getAll(query: SupportSQLiteQuery): DataSource.Factory<Int, Course>

    fun getCourse(id: Int): LiveData<Course>

    fun getTodaySchedule(day: Int): List<Course>

    fun insert(course: Course)

    fun delete(course: Course)

    fun sort(params: String): DataSource.Factory<Int, Course>
}