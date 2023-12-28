package com.example.consumerestapi

import com.example.consumerestapi.navigation.DestinasiNavigasi

object DestinasiHome : DestinasiNavigasi {
    override val route : String = "home"
    override val titleRes : String = "Kontak"
}

sealed class HomeScreen
