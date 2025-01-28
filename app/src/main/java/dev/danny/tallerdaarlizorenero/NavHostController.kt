package dev.danny.tallerdaarlizorenero

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.danny.tallerdaarlizorenero.Components.HomePlace
import dev.danny.tallerdaarlizorenero.Components.MenuScreen
import dev.danny.tallerdaarlizorenero.Components.ParamScreen
import dev.danny.tallerdaarlizorenero.Components.ParamScreen2
import dev.danny.tallerdaarlizorenero.Components.UserScreen


@Composable
fun NavHostController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") { HomePlace(navController) }
        composable(route = "userlist") { UserScreen(navController) }
        composable(
            route = "param/{userName}",
            arguments = listOf(
                navArgument("userName") {
                    type = NavType.StringType
                }
            )
        ) { stackEntry ->
            val userName = stackEntry.arguments?.getString("userName")
            ParamScreen(navController, userName)
        }
        composable(
            route = "param2/{userName}",
            arguments = listOf(
                navArgument("userName") {
                    type = NavType.StringType
                }
            )
        ) { stackEntry ->
            val userName = stackEntry.arguments?.getString("userName")
            ParamScreen2(navController, userName)
        }
        //composable(route = "param") { ParamScreen(navController) }
      composable(route = "menu") { MenuScreen(navController) }


    }
}
