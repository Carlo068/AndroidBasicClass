package com.example.androidbasicclass.ui.personalinformation.homePersonalInformation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.androidbasicclass.ui.personalinformation.homePersonalInformation.model.HomePersonalInformationModel

/**
 * ViewModel for the Personal Information home screen.
 * Holds and exposes UI state via [HomePersonalInformationModel] to [HomePersonalInformationView].
 */
class HomePersonalInformationViewModel : ViewModel() {
    val homeModel = HomePersonalInformationModel()
}
