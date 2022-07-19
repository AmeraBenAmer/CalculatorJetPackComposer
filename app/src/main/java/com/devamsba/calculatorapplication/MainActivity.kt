package com.devamsba.calculatorapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.devamsba.calculatorapplication.ui.theme.CalculatorApplicationTheme
import com.devamsba.calculatorapplication.ui.theme.MeduimGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorApplicationTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val spacingBetweenButton = 8.dp

                Calculator(
                    state = state, onAction = viewModel::onAction,
                    spacingBetweenButton = spacingBetweenButton,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MeduimGray)
                        .padding(16.dp)
                )

            }
        }
    }
}

