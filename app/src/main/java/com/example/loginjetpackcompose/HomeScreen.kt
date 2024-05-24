package com.example.loginjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){

    var text by remember {
        mutableStateOf("")

    }
Column(
    modifier = Modifier
        .fillMaxSize()
        .padding(18.dp)
) {
    Spacer(modifier = Modifier.size(20.dp))
    Text(text = "Hi there  \uD83D\uDE0A", style = TextStyle(fontSize = 26.sp))

    Spacer(modifier = Modifier.size(20.dp))

    Text(text = "Let's learn about You !", style = TextStyle(fontSize = 21.sp))

    Spacer(modifier = Modifier.size(20.dp))

    Text(
        text = "This app will prepare a details page based on input provide by you !",
        style = TextStyle(fontSize = 16.sp)
    )

    Spacer(modifier = Modifier.size(55.dp))
    Text(text = "Name", style = TextStyle(fontSize = 16.sp))

    Spacer(modifier = Modifier.size(16.dp))

    OutlinedTextField(value = text,
        onValueChange ={text = it} ,
        label = {
            Text(text = "Enter your name")
        })


    Spacer(modifier = Modifier.size(45.dp))

    Row(
        modifier = Modifier
            .fillMaxWidth()


    )  {
        Image(painter = painterResource(id = R.drawable.cats),
            contentDescription = "Image",
            modifier = Modifier
                .size(160.dp)
                .clickable {

                }
        )

        Image(painter = painterResource(id = R.drawable.dog),
            contentDescription = "Image",
            modifier = Modifier
                .size(165.dp)
                .clickable {

                }
        )
    }

    Spacer(modifier = Modifier.size(60.dp))

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FilledTonalButton(onClick = {  navController.navigate("details_screen")}) {
            Text(text = "Go to Deatil screen")
        } 
           

        
    }

}

}








