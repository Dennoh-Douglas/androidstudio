package com.example.testproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testproject.ui.theme.TestProjectTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           Picha()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Picha(){

    Column(
        modifier = Modifier.fillMaxSize()


    ) {
        Image(
            painter = painterResource(id = R.drawable.n),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(10.dp)
                .clip(RoundedCornerShape(10))
                .border(2.dp, Color.Cyan )
                .padding(0.dp)

        )


        val about = LocalContext.current
        Button(onClick = {

            about.startActivity(Intent(about, AboutActivity::class.java)
            )

        }
        ) {




            Text(text = "About")



        }







    Spacer(modifier = Modifier.height(70.dp))

        val yy = LocalContext.current




        Text("Clickable Text",
            modifier = Modifier
                .clickable {
                    yy.startActivity(Intent(yy, CardsActivity::class.java))
                }



        )























    }











}















