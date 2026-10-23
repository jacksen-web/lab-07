package com.example.myapplication

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FormulaZeroTest2 {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>() // access MainActivity

    @Test
    fun nav_to_drivers_add_driver_clear_then_return_home() {
        // navigate to drivers screen
        composeTestRule.onNodeWithTag("driveButton").performClick()

        // verify driver screen
        composeTestRule.onNodeWithText("FormulaZero Drivers").assertExists()

        // enter a driver
        composeTestRule.onNodeWithTag("driverInput").performTextInput("Number Four")

        // add driver #1
        composeTestRule.onNodeWithTag("addDriverButton").performClick()

        // verify presence of drive #1
        composeTestRule.onNodeWithText("Number Four").assertExists()

        // enter another driver
        composeTestRule.onNodeWithTag("driverInput").performTextInput("Number Three")

        // add driver #2
        composeTestRule.onNodeWithTag("addDriverButton").performClick()

        // verify presence of drive #2
        composeTestRule.onNodeWithText("Number Three").assertExists()

        // clear all drivers
        composeTestRule.onNodeWithTag("clearDriversButton").performClick()

        // return to home screen
        composeTestRule.onNodeWithTag("backButton").performClick()

        // verify return to home screen
        composeTestRule.onNodeWithText("FormulaZero Home").assertExists()
    }
}