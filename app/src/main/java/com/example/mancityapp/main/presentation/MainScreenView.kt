package com.example.mancityapp.main.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.mancityapp.navigation.SetupNavigation


@Composable
fun MainScreenView(){
    val navController = rememberNavController()
        SetupNavigation(navController = navController)
}