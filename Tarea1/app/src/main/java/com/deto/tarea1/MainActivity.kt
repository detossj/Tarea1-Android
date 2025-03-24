package com.deto.tarea1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.deto.tarea1.ui.theme.Tarea1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Inicio", "La app se inicio")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column {
                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )

                        Mensaje1()
                        Mensaje2()
                        Mensaje3("Jorge")
                    }


                }
            }
        }
    }
}

@Composable
fun Mensaje1( modifier: Modifier = Modifier ){

    val mensaje1 = stringResource(R.string.mensaje1)

    Text(
        text = mensaje1
    )

    Log.d("Mensajes", "Mensaje 1 desplegado")
}

@Composable
fun Mensaje2( modifier: Modifier = Modifier ){

    val mensaje2 = stringResource(R.string.mensaje2)

    Text(
        text = mensaje2
    )

    Log.d("Mensajes", "Mensaje 2 desplegado")
}

@Composable
fun Mensaje3( name: String ,modifier: Modifier = Modifier ){

    val mensaje3 = stringResource(R.string.mensaje1)

    Text(
        text = mensaje3 + " ${name}"
    )

    Log.d("Mensajes", "Mensaje 3 desplegado")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarea1Theme {
        Greeting("Android")
    }
}