package com.mouhsinbourqaiba.jetcomposenavigation

sealed class Destination(val route: String) {
    object ScreenFirst : Destination("ScreenFirst")
    object ScreenSecond : Destination("ScreenSecond")
    object ScreenThird : Destination("ScreenThird")
    object ScreenFour : Destination("ScreenFour")
    object ScreenFive : Destination("ScreenFive")
}
