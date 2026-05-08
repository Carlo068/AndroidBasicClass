package com.example.androidbasicclass.ui.navigation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AppNavigationViewModel : ViewModel() {
    private val _currentRoute = MutableStateFlow(AppRoute.ThirdPartialIDS2.route)
    val currentRoute: StateFlow<String> = _currentRoute

    fun navigateTo(route: String) {
        _currentRoute.value = route
    }
}

