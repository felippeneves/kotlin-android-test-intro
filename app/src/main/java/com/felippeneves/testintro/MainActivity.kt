package com.felippeneves.testintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.felippeneves.testintro.ui.theme.TestIntroTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestIntroTheme {
                TestIntroApp()
            }
        }
    }
}

@Composable
fun TestIntroApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val income = calculateIncome(grossIncome = 100.0, taxRate = 0.1)
        val tax = calculateTax(grossIncome = 100.0, taxRate = 0.1)

        println(income)
        println(tax)
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestIntroTheme {
        TestIntroApp()
    }
}