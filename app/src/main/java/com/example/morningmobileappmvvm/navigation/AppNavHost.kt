package com.example.morningmobileappmvvm.navigation

//import AddClient
//import ViewClientsScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.morningmobileappmvvm.ui.theme.screens.client.UpdateClient
import com.example.morningmobileappmvvm.ui.theme.screens.clients.AddClient
import com.example.morningmobileappmvvm.ui.theme.screens.clients.ViewClientsScreen
import com.example.morningmobileappmvvm.ui.theme.screens.home.HomeScreen
import com.example.morningmobileappmvvm.ui.theme.screens.home.HomeScreensPreview
import com.example.morningmobileappmvvm.ui.theme.screens.login.Login
import com.example.morningmobileappmvvm.ui.theme.screens.register.Greeting

@Composable
fun AppNavHost(navController:NavHostController= rememberNavController(),
startDestination: String = ROUTE_VIEW_CLIENT){


    NavHost(navController =navController, startDestination = startDestination ){
    composable(ROUTE_REGISTER){ Greeting(name = "Adebah", navController )}
    composable(ROUTE_HOME){ HomeScreen(navController )}
    composable(ROUTE_LOGIN){ Login(navController )}
    composable(ROUTE_ADD_CLIENT){ AddClient(navController)}
    composable(ROUTE_UPDATE_CLIENT){ UpdateClient(navController)}
    composable(ROUTE_VIEW_CLIENT){ ViewClientsScreen(navController)}


}

}