package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    CardImage(message = stringResource(R.string.name_text), from = stringResource(R.string.major_text))
                }
            }
        }
    }
}



@Composable
fun CardImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(16.dp))
                .align(Alignment.TopCenter)
                .height(50.dp)
                .background(Color.Gray)
        )
        CardText(
            message = message,
            from = from,
            modifier = modifier.fillMaxSize(),
        )
    }
}

@Composable
fun CardText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(start = 12.dp, end = 12.dp, top = 15.dp, bottom = 15.dp)
            .fillMaxWidth() // Ensure the Column takes full width if needed
    ) {
        Spacer(modifier = Modifier.height(200.dp)) // Adds space at the top of the Column

        Text(
            text = message,
            fontSize = 50.sp,
            color = Color.Green
        )
        Text(
            text = from,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(450.dp),
            color = Color.LightGray
        )
        SmallWidgetOne()
        WidgetTextOne(message = "@Wtamu")
        SmallWidgetTwo()
        WidgetTextTwo(message = "(806)123-4567")
        SmallWidgetThree()
        WidgetTextThree(message = "Advasquez2@buffs.wtamu.edu")

    }
}

@Composable
fun WidgetTextOne(message: String) {
    Text(
        text = message,
        fontSize = 25.sp,
        color = Color.DarkGray
    )
}

@Composable
fun WidgetTextTwo(message: String) {
    Text(
        text = message,
        fontSize = 25.sp,
        color = Color.DarkGray
    )
}

@Composable
fun WidgetTextThree(message: String) {
    Text(
        text = message,
        fontSize = 25.sp,
        color = Color.DarkGray
    )
}

@Composable
fun SmallWidgetOne() {
    val image = painterResource(id = R.drawable.instagram_logo)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(16.dp))
                .align(Alignment.BottomCenter)
                .background(Color.Gray)
        )
        val textone = "@wtamu"
    }
}

@Composable
fun SmallWidgetTwo() {
    val image = painterResource(id = R.drawable.phone)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(16.dp))
                .align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun SmallWidgetThree() {
    val image = painterResource(id = R.drawable.email)
    Box {
        Image(
            painter = image,
            contentDescription = "Advasquez2@buffs.wtamu.edu",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(16.dp))
                .align(Alignment.BottomCenter)
        )
    }
}

@Preview(
        showBackground = true,
        showSystemUi= true)
    @Composable
    fun BusinessCardPreview() {
        BusinessCardTheme {
            CardImage(message = stringResource(R.string.name_text), from = stringResource(R.string.major_text))
        }
    }





