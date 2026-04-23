package com.ryckluk.mylibrary.navigation

import android.R.attr.type
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.ryckluk.mylibrary.ui_model.DetailsScreen
import com.ryckluk.mylibrary.ui_model.HomeScreen

@Composable
fun MyLibraryNavHost(
    navController: NavHostController,
    modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onBookClick = { index ->
                    navController.navigate(Screen.Details.createRoute(index))
                }
            )
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument("bookIndex") { type = androidx.navigation.NavType.IntType }
            )
        ) { backStackEntry ->
            val index = backStackEntry.arguments?.getInt("bookIndex") ?: 0
            DetailsScreen(
                bookIndex = index,
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}