package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Logo Android
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "null",
            modifier = Modifier
                .size(100.dp)
                .padding(top = 25.dp),
            contentScale = ContentScale.Crop
        )

        // Name and Title
        Text(
            text = "Siby Malick",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Android Developer",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .absolutePadding(bottom = 120.dp)
        )
        Row {
            Image(
                painter = painterResource(R.drawable.telephoner),
                modifier = Modifier
                    .size(55.dp),
                contentDescription = "null"
            )
            Text(
                text = "+225 07 69 53 61 24",
                modifier = Modifier
                    .absolutePadding(top = 12.dp),
                fontSize = 22.sp
            )
        }
        Row {
            Image(
                painter = painterResource(R.drawable.instagram),
                modifier = Modifier
                    .size(45.dp),
                contentDescription = "null"
            )
            Text(
                text = "@malick_siby",
                fontSize = 22.sp,
                modifier = Modifier
                    .absolutePadding(right = 58.dp, left = 5.dp, top = 10.dp)
            )
        }
        Row {
            Image(
                painter = painterResource(R.drawable.email),
                modifier = Modifier
                    .size(45.dp),
                contentDescription = "null"
            )
            Text(
                text = "malicksiby@gmail.com",
                fontSize = 22.sp,
                modifier = Modifier
                    .absolutePadding(top = 10.dp, left = 5.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCard()
}
