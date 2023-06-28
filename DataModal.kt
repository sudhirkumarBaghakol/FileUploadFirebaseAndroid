package com.example.postapidataview

data class DataModal(
    val token: String,
    val user: User
)

data class User(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val email: String,
    val password: String,
    val updatedAt: String,
    val username: String
)
data class Userdata(
    val username: String,
    val email: String,
    val password: String,
)
