package com.example.finpro

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.finpro.home.HomePage
import com.example.finpro.navigation.BottomNavbar
import com.example.finpro.products.ProductDetail
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
                HomePage(navController)
            }
            composable("history") {
                TrxPage()
            }
            composable("profile") {
                ProfilePage()
            }

            composable(
                route = "detail/{productId}",
                arguments = listOf(
                    navArgument("productId") { type = NavType.IntType }
                )
            ) { backStackEntry ->
                val productId = backStackEntry.arguments?.getInt("productId")
                ProductDetail(
                    productId = productId,
                    navController = navController
                )
            }
        }
    }
}
