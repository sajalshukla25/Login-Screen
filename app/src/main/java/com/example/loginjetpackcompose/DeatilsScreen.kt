package com.example.loginjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp)
    ) {
        Spacer(modifier = Modifier.size(20.dp))
        Text(text = "Welcome  \uD83D\uDE0D", style = TextStyle(fontSize = 26.sp))

        Spacer(modifier = Modifier.size(20.dp))

        Text(text = "Thank You! for sharing your data", style = TextStyle(fontSize = 21.sp))

        Spacer(modifier = Modifier.size(70.dp))



        TextWithShadow(value = "You are a dog lover \uD83D\uDC36")

        FactComposable(value = "Here is the first fact. ")





    }
}

@Composable
fun TextWithShadow(value : String){
    val shadowOffset = Offset(x = 1f , y = 2f)
    Text(text = value,
        fontSize = 24.sp,
        fontWeight = FontWeight.Light,
        style = TextStyle(
            shadow = Shadow(Color.Black,shadowOffset,2f)
        )
    )
}


@Composable
fun FactComposable(value: String){
    Card(modifier = Modifier
        .padding(32.dp)
        .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(18.dp,24.dp)
        ) {
Image(painter = painterResource(id = R.drawable.doubleinvertedcomma),
    contentDescription = "Quote Image",
    modifier = Modifier
        .rotate(180f)
        .size(15.dp)

    )
            Spacer(modifier = Modifier.size(24.dp))

            TextWithShadow(value = value)

            Spacer(modifier = Modifier.size(24.dp))

            Image(painter = painterResource(id = R.drawable.doubleinvertedcomma),
                contentDescription = "Quote Image",
                modifier = Modifier
                    .size(15.dp))
        }
    }

}

@Preview
@Composable
fun FactComposablePreview(){
    FactComposable(value = "ABCDEFS")
}


