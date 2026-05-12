package com.example.androidbasicclass.ui.login.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidbasicclass.ui.login.model.LoginCredentials
import com.example.androidbasicclass.ui.login.model.LoginModel
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    private val loginModel = LoginModel()

    var email by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    var passwordVisible by mutableStateOf(false)
        private set

    var isLoading by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    var isLoggedIn by mutableStateOf(false)
        private set

    fun updateEmail(newEmail: String) {
        email = newEmail
        errorMessage = null // Clear error when user types
    }

    fun updatePassword(newPassword: String) {
        password = newPassword
        errorMessage = null // Clear error when user types
    }

    fun togglePasswordVisibility() {
        passwordVisible = !passwordVisible
    }

    fun login() {
        if (email.isBlank() || password.isBlank()) {
            errorMessage = "Please fill in all fields"
            return
        }

        isLoading = true
        errorMessage = null

        viewModelScope.launch {
            val credentials = LoginCredentials(email, password)
            val result = loginModel.authenticate(credentials)

            result.onSuccess {
                isLoggedIn = true
            }.onFailure { exception ->
                errorMessage = exception.message ?: "Login failed"
            }

            isLoading = false
        }
    }
}