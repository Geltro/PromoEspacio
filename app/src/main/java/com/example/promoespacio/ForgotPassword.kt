package com.example.promoespacio

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.promoespacio.model.Routes
import com.example.promoespacio.ui.theme.*


@Composable
fun ForgotPassword(navController: NavHostController) {

    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(color = BlueBackground)
    ) {
        ImageHeader()
        BodyForgotPassword(
            Modifier.align(Alignment.Center),navController
        )
    }
}

@Composable
fun BodyForgotPassword(modifier: Modifier,navController: NavHostController) {


    Column(modifier = modifier) {
        Spacer(modifier = Modifier.size(16.dp))
        RestorePasrwordTitle(Modifier.align(Alignment.Start))
        Spacer(modifier = Modifier.size(8.dp))
        User(user_email = "") {

        }

        RestoreButton(Modifier.align(Alignment.CenterHorizontally), true, navController)

        //if(loginViewModel.state.isLoading!!)  LoadingWheel()
    }
}


@Composable
fun RestoreButton(modifier: Modifier, loginEnable: Boolean,navController: NavHostController) {
    Button(
        modifier = modifier.padding(top = 15.dp),
        onClick = {navController.navigate(Routes.Screen3.route)
        },
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(1.dp, Color.White),
        enabled = loginEnable,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = BlueBackground,
            disabledBackgroundColor = Purple200,
            contentColor = WhiteFont,
            disabledContentColor = WhiteFont
        )

    )
    {
        Text(
            text = stringResource(R.string.restore),
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = WhiteFont
        )
    }

}

@Composable
fun User(user_email: String, onTextChanged: (String) -> Unit) {
    TextField(
        value = user_email,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 20.dp)
            .border(1.5.dp, Color.White, RoundedCornerShape(8.dp)),
        //shape = RoundedCornerShape(1.dp),

        placeholder = {
            Text(
                text = stringResource(R.string.user_password),
                color = Color.Gray
            )
        },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        colors = TextFieldDefaults.textFieldColors(
            textColor = WhiteFont,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )


    )
}

@Composable
fun RestorePasrwordTitle(modifier: Modifier) {
    Text(
        text = stringResource(R.string.restore_password),
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFE3EBFE),
        modifier = Modifier.padding(start = 20.dp)
    )

}
