package com.example.samplegithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.samplegithubapp.domain.use_cases.SearchRepoUseCase
import com.example.samplegithubapp.presentation.Main
import com.example.samplegithubapp.presentation.MainViewModel
import com.example.samplegithubapp.ui.theme.SampleGithubAppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        enableEdgeToEdge()
        setContent {
            SampleGithubAppTheme {
                Main(viewModel)
            }
        }
    }
}