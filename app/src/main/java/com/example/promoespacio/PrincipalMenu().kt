package com.example.promoespacio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.promoespacio.ui.theme.BlueGreenSquare
import com.example.promoespacio.ui.theme.GraySquare

@Composable
fun PrincipalMenu() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)

    ) {
        Box(
            modifier = Modifier
                .background(color = Color.Black,
                shape = RoundedCornerShape(10.dp))
                .width(width = 250.dp)
                .height(height = 100.dp),

        ) {
            Image(
                painter = painterResource(id = R.drawable.uvc_new_color),
                contentDescription = "Imagen central",
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.size(16.dp))

        Box(
            modifier = Modifier
                .background(color = Color.Cyan,
                    shape = RoundedCornerShape(10.dp))
                .width(width = 125.dp)
                .height(height = 100.dp),

            ) {
            Image(
                painter = painterResource(id = R.drawable.uvc_new_color),
                contentDescription = "Imagen central",
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.size(16.dp))

        Box(
            modifier = Modifier
                .background(color = Color.Blue,
                    shape = RoundedCornerShape(10.dp))
                .width(width = 125.dp)
                .height(height = 50.dp),

            ) {
            Image(
                painter = painterResource(id = R.drawable.uvc_new_color),
                contentDescription = "Imagen central",
                modifier = Modifier.align(Alignment.Center)
            )
        }

    }
}

