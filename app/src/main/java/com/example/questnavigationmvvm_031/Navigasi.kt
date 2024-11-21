package com.example.questnavigationmvvm_031

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.questnavigationmvvm_031.ui.viewmodel.MahasiswaViewModel

enum class Halaman {
    Form,
    Data
}
@Composable
fun Navigasi(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
)
