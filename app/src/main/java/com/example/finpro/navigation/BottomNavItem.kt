package com.example.finpro.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector


data class BottomNavItem(
    val route: String,
    val label: String,
    val icon: ImageVector
)

object NavItems {
    val Home = BottomNavItem("home", "Home", Icons.Default.Home)
    val Explore = BottomNavItem("explore", "Explore", Icons.Default.Explore)
    val Profile = BottomNavItem("profile", "Profile", Icons.Default.Person)

    val items = listOf(Home, Explore, Profile)
}