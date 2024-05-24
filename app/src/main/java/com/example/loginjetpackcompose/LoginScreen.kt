package com.example.loginjetpackcompose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController){

    var email by remember {
        mutableStateOf("")

    }

    var password by remember {
        mutableStateOf("")

    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription ="Login image",
            modifier = Modifier.size(200.dp))

        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        
        Spacer(modifier = Modifier.height(4.dp))
        
        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange ={
            email = it
        }, label = {
            Text(text = "Email address")
        } ,
            maxLines = 1)


        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange ={
           password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation(),
            maxLines = 1)

        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = {
            navController.navigate("home_screen")
            Log.i("Crendential","Email : $email Password : $password")
        }) {
            Text(text = "Login")
            
        }

        Spacer(modifier = Modifier.height(32.dp))
        
            Text(text = "Forget Password", modifier = Modifier.clickable { 
                
            })

        Spacer(modifier = Modifier.height(32.dp))
        
        Text(text = "Or sign in with", modifier = Modifier.clickable{

        })


        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.facebook),
                contentDescription ="Facebook",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {

                    }
            )

            Image(painter = painterResource(id = R.drawable.twitter),
                contentDescription ="Twitter",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {

                    }
            )

            Image(painter = painterResource(id = R.drawable.google),
                contentDescription ="Google",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {

                    }
            )
        }
    }
}


