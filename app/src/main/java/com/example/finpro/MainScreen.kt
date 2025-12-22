package com.example.finpro

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.finpro.home.HomePage
import com.example.finpro.navigation.BottomNavbar
import com.example.finpro.profile.ProfilePage
import com.example.finpro.trx.TrxPage


@Composable
fun MainScreen(navController: NavHostController) {

    Scaffold(
        bottomBar = {
            BottomNavbar(navController)
        }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {

            composable("home") {
                HomePage()
            }
            composable("explore") {
                TrxPage()
            }
            composable("profile") {
                ProfilePage()
            }
        }
    }
}
