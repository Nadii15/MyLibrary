package com.ryckluk.mylibrary.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Details : Screen("details/{bookIndex}") {
        fun createRoute(index: Int) = "details/$index"
    }
}