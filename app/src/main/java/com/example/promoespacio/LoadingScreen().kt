package com.example.promoespacio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.promoespacio.ui.theme.*


@Composable
fun LoadingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.uvc_new_color),
            contentDescription = "Imagen central"
        )
        Spacer(modifier = Modifier.size(3.dp))
        CircularProgressIndicator()
        Spacer(modifier = Modifier.size(3.dp))
        Text(
            text = stringResource(R.string.dont_close_app),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
        )
        //Spacer(modifier = Modifier.size(0.dp))
        Text(
            text = stringResource(R.string.loading_data),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
        )


    }

}


@Composable
fun LoadingScreenTwo() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.uvc_new_color),
                    contentDescription = "Imagen central"
                )
                Spacer(modifier = Modifier.size(2.dp))
                Text(
                    text = stringResource(R.string.update_data_will_be_downloaded),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
                Text(
                    text = "it's recommended to be connected to a Wi-Fi network",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
                Spacer(modifier = Modifier.size(20.dp))
                Text(
                    text = stringResource(R.string.update_size),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextGray,
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .align(Alignment.BottomCenter)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .size(width = 300.dp, height = 45.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = BlueButton,
                        disabledBackgroundColor = Purple200,
                        contentColor = WhiteFont,
                        disabledContentColor = WhiteFont
                    )

                ) {
                    Text(
                        text = stringResource(R.string.download),
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                        .size(width = 300.dp, height = 45.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = GrayButton,
                        disabledBackgroundColor = Purple200,
                        contentColor = WhiteFont,
                        disabledContentColor = WhiteFont
                    )
                ) {
                    Text(
                        text = stringResource(R.string.continue_without_downloading),
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp
                    )

                }
            }
        }
    }
}


@Composable
fun DownloadFiles() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.uvc_new_color),
            contentDescription = "Imagen central"
        )
        Spacer(modifier = Modifier.size(3.dp))
        CircularProgressIndicator()
        Spacer(modifier = Modifier.size(3.dp))
        Text(
            text = stringResource(R.string.dont_close_app),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
        )
        //Spacer(modifier = Modifier.size(0.dp))
        Text(
            text = stringResource(R.string.download_files),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
        )


    }

}




