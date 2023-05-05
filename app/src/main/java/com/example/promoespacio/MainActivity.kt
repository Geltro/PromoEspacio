package com.example.promoespacio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.promoespacio.ui.theme.PromoEspacioTheme


import androidx.compose.material.*
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import com.example.promoespacio.model.Routes


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PromoEspacioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.Screen0.route
                    ) {
                        //composable("screen1") { Screen1(navController = navigationController) }
                        //omposable("screen2") { Screen2(navController = navigationController) }
                        composable(Routes.Screen0.route) { StartScreen(navController = navigationController) }
                        composable(Routes.Screen1.route) { LoginScreen(navController = navigationController) }
                        composable(Routes.Screen2.route) { ForgotPassword(navController = navigationController) }
                        composable(Routes.Screen3.route) { DataRestorePassword(navController = navigationController) }



                    }


                    DefaultPreview()//LoginViewModel()
                    //LoginScreen()//LoginViewModel()
                    //StartScreen()

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    //StartScreen()
    //LoginScreen()
    //ForgotPassword()
    //DataRestorePassword()
    //LoadingScreen()
    //LoadingScreenTwo()
    //DownloadFiles()
    //PrincipalMenu()
}


@Composable
fun Screen1(navController: NavHostController) {
    Button(
        onClick = { navController.navigate("screen2") },

        ) {
        Text(text = "Ir a la pantalla 2")
    }
}

@Composable
fun Screen2(navController: NavHostController) {
    Button(
        onClick = { navController.popBackStack() },

        ) {
        Text(text = "Volver a la pantalla anterior")

    }
}