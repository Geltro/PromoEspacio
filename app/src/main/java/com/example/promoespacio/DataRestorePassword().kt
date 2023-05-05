package com.example.promoespacio

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.promoespacio.ui.theme.BlueBackground
import com.example.promoespacio.ui.theme.WhiteFont

@Composable
fun DataRestorePassword(navController: NavHostController) {

    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(color = BlueBackground)
    ) {
        ImageHeader()
        BodyDataRestorePassword(
            Modifier.align(Alignment.Center),navController
        )
    }
}

@Composable
fun BodyDataRestorePassword(modifier: Modifier,navController: NavHostController) {


    Column(modifier = modifier) {
        Spacer(modifier = Modifier.size(16.dp))
        RestorePasrwordTitle(Modifier.align(Alignment.Start))
        Spacer(modifier = Modifier.size(8.dp))
        User(user_email = "") {

        }
        Spacer(modifier = Modifier.size(4.dp))
        NewPassword(password = "") {

        }
        Spacer(modifier = Modifier.size(4.dp))
        NewPasswordConfirm(password = "") {

        }
        Spacer(modifier = Modifier.size(4.dp))
        VerificationCode(user_email = "") {

        }
        Spacer(modifier = Modifier.size(8.dp))
        RestoreButton(Modifier.align(Alignment.CenterHorizontally), true,navController)

        //if(loginViewModel.state.isLoading!!)  LoadingWheel()
    }
}

@Composable
fun VerificationCode(user_email: String, onTextChanged: (String) -> Unit) {
    TextField(
        value = user_email,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 8.dp)
            .border(1.5.dp, Color.White, RoundedCornerShape(8.dp)),
        //shape = RoundedCornerShape(1.dp),

        placeholder = {
            Text(
                text = stringResource(R.string.verification_code),
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
fun NewPasswordConfirm(password: String, onTextChanged: (String) -> Unit) {
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
                text = stringResource(R.string.confirm_password),
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
fun NewPassword(password: String, onTextChanged: (String) -> Unit) {
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
                text = stringResource(R.string.new_password),
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

