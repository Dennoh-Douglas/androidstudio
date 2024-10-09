package com.example.testproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.testproject.ui.theme.TestProjectTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {



            About()





        }
    }
}

@Preview(showBackground = true)
@Composable
fun About(){

 Column(


     modifier = Modifier
         .background(Color.DarkGray)
         .fillMaxSize()
         .fillMaxWidth()
         .fillMaxHeight(),


     horizontalAlignment = Alignment.CenterHorizontally,
     verticalArrangement = Arrangement.SpaceAround




 ) {







     Text(

         "This is about us!",
         fontSize = 20.sp,
         color = Color.Magenta,
         fontFamily = FontFamily.Cursive,
         fontWeight = FontWeight.SemiBold,
         fontStyle = FontStyle.Italic

     )










     val mainActivity = LocalContext.current

     Button(onClick = {

         mainActivity.startActivity(Intent(mainActivity, MainActivity::class.java))

     }


     ) {
         Text(text = "MainActivity")
     }





 }














}