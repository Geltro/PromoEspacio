package com.example.promoespacio

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.promoespacio.model.Routes
import com.example.promoespacio.ui.theme.*

@Composable
fun LoginScreen(navController: NavHostController) {

    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(color = BlueBackground)
    ) {
        ImageHeader()
        BodyLogin(
            Modifier.align(Alignment.Center), navController
        )
    }
}


@Composable
fun BodyLogin(modifier: Modifier, navController: NavHostController) {


    Column(modifier = modifier) {
        Spacer(modifier = Modifier.size(16.dp))
        LoginTitle(Modifier.align(Alignment.Start))
        Spacer(modifier = Modifier.size(8.dp))
        UserEmail(user_email = "") {

        }
        Spacer(modifier = Modifier.size(4.dp))
        Password(password = "") {

        }
        Spacer(modifier = Modifier.size(8.dp))
        ForgotPasswordText(Modifier.align(Alignment.End), navController)
        Spacer(modifier = Modifier.size(8.dp))
        LoginButton(Modifier.align(Alignment.CenterHorizontally), true)

        //if(loginViewModel.state.isLoading!!)  LoadingWheel()
    }
}

@Composable
fun LoginButton(modifier: Modifier, loginEnable: Boolean) {
    Button(
        modifier = modifier,
        onClick = {
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
            text = stringResource(R.string.login_button),
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
            //,color = WhiteFont
        )
    }

}


@Composable
fun LoginTitle(modifier: Modifier) {
    Text(
        text = stringResource(R.string.login),
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = WhiteFont,
        modifier = Modifier.padding(start = 20.dp, top = 200.dp)
    )
}

@Composable
fun ForgotPasswordText(modifier: Modifier, navController: NavHostController) {
    Text(
        text = stringResource(R.string.forgot_password),
        fontSize = 12.sp,
        color = WhiteFont,
        modifier = modifier
            .padding(top = 5.dp, end = 20.dp)
            .clickable {
                navController.navigate(
                    Routes.Screen2.route
                )
            }
    )
}

@Composable
fun UserEmail(user_email: String, onTextChanged: (String) -> Unit) {
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
                text = stringResource(R.string.user_email_placeholder),
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
fun Password(password: String, onTextChanged: (String) -> Unit) {
    var passwordVisibility by remember { mutableStateOf(false) }

    TextField(
        value = password,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 8.dp)
            .border(1.5.dp, Color.White, RoundedCornerShape(8.dp)),
        //shape = RoundedCornerShape(100.dp),
        placeholder = {
            Text(
                text = stringResource(R.string.password),
                color = Color.Gray
            )
        },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        colors = TextFieldDefaults.textFieldColors(
            textColor = WhiteFont,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        trailingIcon = {
            val imagen = if (passwordVisibility) {
                Icons.Filled.VisibilityOff
            } else {
                Icons.Filled.Visibility
            }
            IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                Icon(
                    imageVector = imagen,
                    contentDescription = stringResource(R.string.content_descrip_password),
                    tint = WhiteFont
                )
            }
        },
        visualTransformation = if (passwordVisibility) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        }
    )
}

@Composable
fun ImageHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(GraySquare, BlueGreenSquare),
                    //colors = listOf(Color(0xFF6495ED), Color(0xFF4169E1)),
                    start = Offset(0f, 0f),
                    end = Offset(0f, 400f)
                ),

                shape = RoundedCornerShape(bottomStart = 100.dp, bottomEnd = 100.dp)
            )
            .padding(start = 8.dp, end = 8.dp, top = 8.dp, bottom = 4.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_new_white_512),
            contentDescription = "Imagen central",
            modifier = Modifier.align(Alignment.Center)
        )
    }

}

@Composable
fun MatchParentSizeComposable() {
    Box {
        Spacer(
            Modifier
                .matchParentSize()
                .background(Color.LightGray)
        )
        //ArtistCard()
    }
}


@Composable
fun LoadingWheel() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            color = Color.Black
        )
    }
}