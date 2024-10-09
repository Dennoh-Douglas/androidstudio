package com.example.testproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testproject.ui.theme.TestProjectTheme

class HotelActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            hotel()


        }
    }
}

@Preview(showBackground = true)
@Composable
fun hotel(){



    LazyColumn (

        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(),



        verticalArrangement = Arrangement.SpaceAround


    ){

        item {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .fillMaxHeight(),

                horizontalArrangement = Arrangement.SpaceBetween



            ) {
                Column {






                             Text("Where you"   ,
                                 modifier = Modifier,
                                 fontSize = 20.sp ,





                             )


                                            Text(" wanna go?" ,
                                                 modifier = Modifier, 
                                                 fontSize = 20.sp ,


                                            )           }



                 Spacer(modifier = Modifier
                       .padding(15.dp) )
                Image(
                painter = painterResource(id = R.drawable.j
                ),
               contentDescription = null,
                modifier = Modifier
                    .size(100.dp)     )

            }























            Spacer(modifier = Modifier
                .height(10.dp)

            )

            Row(


                 modifier = Modifier                                  
                     .fillMaxSize()                                   
                     .fillMaxWidth()                                  
                     .fillMaxHeight(),                                
                                                                      
                
                                                                      




            ) {

                Card(


                    colors = CardDefaults.cardColors( Color(0xff45b1f9 )),
                    elevation = CardDefaults.cardElevation(50.dp),
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)

                ) {


                            Image(
                            painter = painterResource(id = R.drawable.c
                            ),
                           contentDescription = null,
                            modifier = Modifier
                                .size(30.dp)     )




                

                    Text(
                        "HOTEL" ,

                        modifier = Modifier
                            .fillMaxHeight(),

                        color = Color.White,
                        textAlign = TextAlign.Center,






                    )


                }


                Spacer(modifier = Modifier
                    .padding(2.dp)
                )


                Card(


                    colors = CardDefaults.cardColors( Color(0xffffffff )),
                    elevation = CardDefaults.cardElevation(20.dp),
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)

                ) {


                     Image(
                     painter = painterResource(id = R.drawable.h
                     ),
                    contentDescription = null,
                     modifier = Modifier
                         .size(30.dp)     )









                    Text(
                        "FLIGHT",

                        modifier = Modifier,
                        color = Color.Black





                    )


                }


                Spacer(modifier = Modifier
                    .padding(2.dp)
                )


                Card(


                    colors = CardDefaults.cardColors( Color(0xffffffff)),
                    elevation = CardDefaults.cardElevation(20.dp),
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)

                ) {



                      Image(
                      painter = painterResource(id = R.drawable.r
                      ),
                     contentDescription = null,
                      modifier = Modifier
                          .size(30.dp)     )


                    Text(
                        "PLACE",

                        modifier = Modifier,
                        color = Color.Black





                    )


                }

                Spacer(modifier = Modifier
                    .padding(2.dp)
                )

                Card(


                    colors = CardDefaults.cardColors( Color(0xffffffff )),
                    elevation = CardDefaults.cardElevation(30.dp),
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)

                ) {


                      Image(
                      painter = painterResource(id = R.drawable.o
                      ),
                     contentDescription = null,
                      modifier = Modifier
                          .size(30.dp)
                              
                      )




                    Text(
                        "FOOD",

                        modifier = Modifier,
                        color = Color.Black





                    )


                }







            }

            Spacer(modifier = Modifier
                .height(20.dp)

            )
            Column {

                Row (



                    modifier = Modifier                               
                        .fillMaxSize()                                
                        .fillMaxWidth()                               
                        .fillMaxHeight(),                             
                                                                      
                    horizontalArrangement = Arrangement.SpaceBetween  
                                                                      
                ){


                    Text("Popular Hotels",
                                            modifier = Modifier, 
                                            fontSize = 20.sp ,

                        )

                    Spacer(modifier = Modifier
                        .padding(15.dp)
                    )

                    val tx = LocalContext.current

                    Text(
                        "See all",

                        modifier = Modifier

                            .clickable {

                                tx.startActivity(Intent(tx, MainActivity::class.java))
                            },
                        color = Color(0xfff98445 )







                    )





                }


            }
                                            

            Spacer(modifier = Modifier.height(10.dp))

            Column {
                Row (






                    modifier = Modifier                               
                        .fillMaxSize()                                
                        .fillMaxWidth()                               
                        .fillMaxHeight(),                             
                                                                      
                    horizontalArrangement = Arrangement.SpaceBetween  
                                                                      


                ){
                    Image(
                        painter = painterResource(id = R.drawable.s
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)
                            .padding(10.dp)
                            .border(2.dp, Color.Transparent )
                            .clip(RoundedCornerShape(10))
                            .padding(0.dp)

                    )


                    Spacer(modifier = Modifier
//                        .padding(0.5.dp)
                    )
//
//
                    Image(
                        painter = painterResource(id = R.drawable.s
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)
                            .padding(10.dp)
                            .border(2.dp, Color.Transparent)
                            .clip(RoundedCornerShape(10))
                            .padding(0.dp)

                    )






                }







            }
            Spacer(modifier = Modifier.height(5.dp))


            Column {

                Text("Hot Deals",
                     modifier = Modifier, 
                     fontSize = 20.sp ,


                )
            }

            Spacer(modifier = Modifier.height(5.dp))



                Row(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxHeight()
                        .fillMaxSize()   ,







//                    horizontalArrangement = Arrangement.Center
                                                                      )



                {
                    Card(


                        elevation = CardDefaults.cardElevation(100.dp),
                        modifier = Modifier
//                            .height(100.dp)
//                            .width(100.dp)



                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.b
                            ),
                            contentDescription = null,
                            modifier = Modifier
                                .size(300.dp)
                                .padding(10.dp)
                                .border(3.dp, Color.Transparent )
                                .clip(RoundedCornerShape(20))
                                .padding(0.dp)

                        )






                    }



















                }




























        }


















































    }


























































































































}
