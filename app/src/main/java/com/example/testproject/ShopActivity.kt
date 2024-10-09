package com.example.testproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testproject.ui.theme.TestProjectTheme

class ShopActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            shop()

        }
    }
}


@Preview
@Composable


fun shop(){

    Column (


        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(),


        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top




    )




    {


        Text("Creative tools for endless imagination")








    }

Spacer(modifier = Modifier.height(120.dp))

Row{

    Button(onClick = {

    }) { Text("ALL") }


       Button(onClick = {

       }) { Text("Apparel") }



    Button(onClick = {}) { Text("Art Supplies") }

    Button(onClick = {}) { Text("Furniture") }









}

Spacer(modifier = Modifier.width(150.dp))

Row {


    Column {



        Image(
            painter = painterResource(id = R.drawable.n),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .padding(10.dp)
                .clip(RoundedCornerShape(10))
                .padding(0.dp)

        )

    }
    Column {



        Image(
            painter = painterResource(id = R.drawable.n),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .padding(10.dp)
                .clip(RoundedCornerShape(10))
                .padding(0.dp)

        )

    }




}






    Row {


        Column {



            Image(
                painter = painterResource(id = R.drawable.n),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10))
                    .padding(0.dp)

            )

        }
        Column {



            Image(
                painter = painterResource(id = R.drawable.n),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10))
                    .padding(0.dp)

            )

        }




    }



























}







































