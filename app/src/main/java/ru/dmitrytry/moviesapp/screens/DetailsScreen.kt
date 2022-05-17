package ru.dmitrytry.moviesapp.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import ru.dmitrytry.moviesapp.MainViewModel

@Composable
fun DetailsScreen(navController: NavController, viewModel: MainViewModel,itemId: String) {
    Text("Details screen: item id: ${itemId}")
}