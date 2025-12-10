package com.example.componentsandnavigation.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.componentsandnavigation.components.MainTopAppBar
import com.example.componentsandnavigation.components.ScreenTopBar

@Composable
fun ScaffoldApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable(route = "home") { MainScreen(navController) }
        composable(route = "info") { InfoScreen(navController) }
        composable(route = "settings") { SettingsScreen(navController) }
    }
}
@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = { MainTopAppBar("My app",navController) },
    ) { innerPadding ->
        Text(text="Home Screen",modifier = Modifier.padding(innerPadding))
    }
}
@Composable
fun InfoScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar("Info",navController) },
    ) { innerPadding ->
        Text(text="Info Screen",modifier = Modifier.padding(innerPadding))
    }
}
@Composable
fun SettingsScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar("Settings", navController) },
    ) { innerPadding ->
        Text(text = "Settings Screen", modifier = Modifier.padding(innerPadding))
    }
}