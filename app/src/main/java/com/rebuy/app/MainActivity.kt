package com.rebuy.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.rebuy.app.ui.components.*
import com.rebuy.app.ui.screens.*
import com.rebuy.app.ui.screens.home.HomeScreen
import com.rebuy.app.ui.theme.ReBuyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReBuyTheme {
                ReBuyApp()
            }
        }
    }
}

@Composable
fun ReBuyApp() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: BottomNavItem.Home.route

    Scaffold(
        topBar = {
            ReBuyTopAppBar(
                onNotificationClick = { /* Handle notification click */ }
            )
        },
        bottomBar = {
            BottomNavBar(
                currentRoute = currentRoute,
                onItemClick = { item ->
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BottomNavItem.Home.route) {
                HomeScreen(
                    onProductClick = { product ->
                        // Navigate to product detail
                    }
                )
            }
            composable(BottomNavItem.Map.route) {
                MapScreen()
            }
            composable(BottomNavItem.Community.route) {
                CommunityScreen()
            }
            composable(BottomNavItem.Chat.route) {
                ChatScreen()
            }
            composable(BottomNavItem.Profile.route) {
                ProfileScreen()
            }
        }
    }
}
