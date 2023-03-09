package com.mouhsinbourqaiba.jetcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mouhsinbourqaiba.jetcomposenavigation.ui.theme.FNavigationTheme
import com.mouhsinbourqaiba.jetcomposenavigation.ui.theme.JetComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController =  rememberNavController()
                    NavHost(navController = navController, startDestination = Destination.ScreenFirst.route) {
                        composable(Destination.ScreenFirst.route) { Screen1(navController) }
                        composable(Destination.ScreenSecond.route) { Screen2(navController) }
                        composable(Destination.ScreenThird.route) { Screen3(navController) }
                        composable(Destination.ScreenFour.route) { Screen4(navController) }
                        composable(Destination.ScreenFive.route) { Screen5(navController) }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetComposeNavigationTheme {
        Greeting("Android")
    }
}