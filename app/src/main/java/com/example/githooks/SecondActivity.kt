package com.example.githooks

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githooks.ui.theme.GitHooksTheme
import com.google.firebase.crashlytics.FirebaseCrashlytics
import java.text.DateFormat
import java.util.*

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

                 super.onCreate(savedInstanceState)
                              FirebaseCrashlytics.getInstance().sendUnsentReports();
                       throw ReflectiveOperationException(localClassName)
        setContent {
            GitHooksTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {

                    Greeting1("Android")


                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Column(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            color = Color.Black,
            text = "Crash test",
        )


        Button(
            modifier = Modifier
                .fillMaxSize(),
            shape = RectangleShape,
            onClick = {
                Log.d("TAG", "Greeting: ")
                Log.d("TAG", "Greeting: ")
                FirebaseCrashlytics.getInstance().setUserId("dfddddd");
                Log.d("TAG", "Greeting: ")
                Log.d("TAG", "Greeting: ")
                try {
                    throw java.lang.Exception("chetan")
                } catch (e: Exception) {
                    FirebaseCrashlytics.getInstance().recordException(e)
                    // handle your exception here
                }
                //throw TypeCastException("dddd tytttt")
            },
            colors = ButtonDefaults
                .buttonColors(
                    backgroundColor = Color.Cyan
                ),
            elevation = ButtonDefaults.elevation(0.dp)
        )
        {
            Text(
                color = Color.Black,
                text = "Crash test ttttt",
            )
        }


    }

}

@Composable
fun Greeting1(name: String) {
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Log.d("TAG", "Greeting: ")
    Column(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            color = Color.Black,
            text = "Crash test",
        )

        Button(
            modifier = Modifier
                .fillMaxSize(),
            shape = RectangleShape,
            onClick = {


                Log.d("TAG", "Greeting: ")
                Log.d("TAG", "Greeting: ")

                Log.d("TAG", "Greeting: ")
                Log.d("TAG", "Greeting: ")
                throw TooManyListenersException("222 Crash")
                /*   try {
                       throw java.lang.Exception("chetan")
                   } catch (e: Exception) {
                       FirebaseCrashlytics.getInstance().recordException(e)
                       // handle your exception here
                   }*/


                // FirebaseCrashlytics.getInstance().recordException(Exception("My first Android non-fatal error"));
            },
            colors = ButtonDefaults
                .buttonColors(
                    backgroundColor = Color.Cyan
                ),
            elevation = ButtonDefaults.elevation(0.dp)
        )
        {
            Text(
                color = Color.Black,
                text = "Crash test 11111",
            )
        }
        Button(
            modifier = Modifier
                .fillMaxSize(),
            shape = RectangleShape,
            onClick = {
                FirebaseCrashlytics.getInstance().setUserId("3989843984398hdbd");

                Log.d("TAG", "Greeting: ")
                Log.d("TAG", "Greeting: ")

                Log.d("TAG", "Greeting: ")
                Log.d("TAG", "Greeting: ")

                /*   try {
                       throw java.lang.Exception("chetan")
                   } catch (e: Exception) {
                       FirebaseCrashlytics.getInstance().recordException(e)
                       // handle your exception here
                   }*/


                // FirebaseCrashlytics.getInstance().recordException(Exception("My first Android non-fatal error"));
            },
            colors = ButtonDefaults
                .buttonColors(
                    backgroundColor = Color.Cyan
                ),
            elevation = ButtonDefaults.elevation(0.dp)
        )
        {
            Text(
                color = Color.Black,
                text = "Crash test ttttt",
            )
        }


    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GitHooksTheme {
        Greeting("Android")
    }
}
