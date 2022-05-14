package ru.dmitrytry.moviesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.dmitrytry.moviesapp.MainViewModel
import ru.dmitrytry.moviesapp.screens.MainScreen
import ru.dmitrytry.moviesapp.screens.SplashScreen
import ru.dmitrytry.moviesapp.until.Constants

sealed class Screens(val route: String){
    object Splash: Screens(route = Constants.Screens.SPLASH_SCREENS)
    object Main: Screens(route = Constants.Screens.MAIN_SCREENS)
    object Details: Screens(route = Constants.Screens.DETAILS_SCREENS)
}

@Composable
fun SetupNavHost(navController: NavHostController, viewModel: MainViewModel) {
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route
    ) {
        composable(route = Screens.Splash.route) {
            SplashScreen(navController = navController, viewModel = viewModel)
        }
        composable(route = Screens.Main.route) {
            MainScreen(navController = navController, viewModel = viewModel)
        }
        composable(route = Screens.Details.route) {

        }
    }
}