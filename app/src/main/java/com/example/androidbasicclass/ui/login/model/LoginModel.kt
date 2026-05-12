package com.example.androidbasicclass.ui.login.model

data class LoginCredentials(
    val email: String,
    val password: String
)

class LoginModel {
    // Mock authentication - in real app, this would call an API or database
    fun authenticate(credentials: LoginCredentials): Result<Unit> {
        return if (credentials.email == "user@example.com" && credentials.password == "password") {
            Result.success(Unit)
        } else {
            Result.failure(Exception("Invalid credentials"))
        }
    }
}