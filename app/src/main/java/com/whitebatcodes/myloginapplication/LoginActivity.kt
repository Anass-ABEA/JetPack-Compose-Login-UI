package com.whitebatcodes.myloginapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.whitebatcodes.myloginapplication.interfaces.LoginForm
import com.whitebatcodes.myloginapplication.ui.theme.MyLoginApplicationTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent{
            MyLoginApplicationTheme {
                LoginForm()
            }
        }
    }
}