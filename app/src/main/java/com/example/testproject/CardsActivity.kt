package com.example.testproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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

class CardsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestProjectTheme {

                card()

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun card(){

    LazyColumn (
        modifier = Modifier.fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(),


//        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ){

        item {



            Column(

                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .fillMaxHeight(),


                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround

            ) {

                Card(


                    colors = CardDefaults.cardColors(Color.Magenta),
                    elevation = CardDefaults.cardElevation(50.dp)
                ) {

                    val tx = LocalContext.current

                    Text(
                        "This is a card.",
                        color = Color(0xff2980b9),
                        modifier = Modifier
                            .clickable {

                                tx.startActivity(Intent(tx, MainActivity::class.java))
                            }




                    )


                }


            }
        }














    }

























//
//column break
//    Spacer(modifier = Modifier.height(70.dp))
//
//
//
//    Row breaks
//            Spacer(
//                modifier = Modifier.width(12.dp)
//            )
//






}



