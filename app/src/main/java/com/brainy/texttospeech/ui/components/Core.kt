package com.brainy.texttospeech.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@Composable
fun TextButton(text: String, click: () -> Unit){
    TextButton(onClick = click) {
        Text(text = text)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField(value: String, onChange: (e: String) -> Unit){
    TextField(value = value, onValueChange = onChange)
}