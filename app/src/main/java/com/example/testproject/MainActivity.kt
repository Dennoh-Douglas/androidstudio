package com.example.testproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testproject.ui.theme.TestProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            John()

        }
    }
}



@Preview
@Composable
fun John(){



    Column (


//



                modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(),


        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround

    ){



        Text("Welcome to Android!")





        Text("This is my app")
















//     BUTTON

       val images = LocalContext.current
        Button(onClick = {

            images.startActivity(Intent(images, ImageActivity::class.java))

        }
        ) {


            Text(text = "Images")

        }



        Spacer(modifier = Modifier.height(100.dp))


        val zz = LocalContext.current

        Text("InputActivty2",
            modifier = Modifier
                .clickable {
                    zz.startActivity(Intent(zz, InputActivity2::class.java))

                }



        )

















    }






























































}












