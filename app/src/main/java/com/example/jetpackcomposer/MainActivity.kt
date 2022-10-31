package com.example.jetpackcomposer
//importações
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

//definição das Funções
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Android")
        }
    }
}
//Criação das mensagens de texto
@Composable
fun MessageCard(name:String) {
    Text(text = "MB em $name")
}
//Criação da mensagem de texto do Preview
@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(name = "Jefinho")
}