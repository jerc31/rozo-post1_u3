package com.jhoseth_rozo.myactivity.domain

interface TaskRepository {
    suspend fun getAllTasks(): List<Task>
    suspend fun addTask(title: String)

}
