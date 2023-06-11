package com.example.study.chapter6.code

class Chapter612 {
    data class User(
        val age: Int?,
    )

    fun getMeanAge(users: List<User>): Double? {
        if (users.isEmpty()) {
            return null
        }

        return users.sumOf { it.age?.toDouble() ?: 0.0 }
            .div(users.size.toDouble())
    }
}
