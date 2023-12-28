package com.example.consumerestapi

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consumerestapi.navigation.DestinasiNavigasi
import com.example.consumerestapi.ui.PenyediaViewModel
import com.example.consumerestapi.ui.home.viewmodel.HomeViewModel

object DestinasiHome : DestinasiNavigasi {
    override val route : String = "home"
    override val titleRes : String = "Kontak"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    modifier: Modifier = Modifier,
    onDetailClick: (Int) -> Unit ={},
    viewModel: HomeViewModel = viewModel(factory = PenyediaViewModel.Factory)
){

}

