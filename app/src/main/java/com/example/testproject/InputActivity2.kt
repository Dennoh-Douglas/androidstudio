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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testproject.ui.theme.TestProjectTheme

class InputActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestProjectTheme {

                Input()


            }
        }
    }
}
@Preview
@Composable
fun Input(){

//    TEXTFIELDS


Column (
    modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight(),



    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceAround





){



    var email by remember {

    mutableStateOf(TextFieldValue(""))

}


    TextField(value = email,
        onValueChange = { email = it },
        label = { Text("Enter Email") }

    )



    var phone by remember {

        mutableStateOf(TextFieldValue(""))
    }

    OutlinedTextField(value = phone,
        onValueChange = {phone = it},
        label = { Text("Enter Phone") }

    )




    Spacer(modifier = Modifier.height(100.dp))


    val ff = LocalContext.current

    Text("MainActivity",
        modifier = Modifier
            .clickable {
                ff.startActivity(Intent(ff, MainActivity::class.java))

            }



    )
    Spacer(modifier = Modifier.height(10.dp))

    val rr = LocalContext.current

    Text("HotelActivity",
        modifier = Modifier
            .clickable {
                ff.startActivity(Intent(rr, HotelActivity::class.java))

            }



    )








































}

































}