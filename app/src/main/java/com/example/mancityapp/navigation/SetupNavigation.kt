package com.example.mancityapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mancityapp.main.presentation.MainScreen
import com.example.mancityapp.main.presentation.Menu

@Composable
fun SetupNavigation(navController:NavHostController){
    NavHost(navController = navController, startDestination = "MainScreen"){
        composable("MainScreen"){ MainScreen()}
        composable("Menu"){ Menu {}}
    }
}