package com.example.projeto_telaconfig

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview


val HeaderTextStyle = TextStyle(
    fontSize = 28.sp,
    fontWeight = FontWeight.ExtraBold
)


@Composable
fun SettingsHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            style = HeaderTextStyle,
            modifier = Modifier.padding(end = 10.dp)
        )

        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = stringResource(id = R.string.settings_icon_description)
        )
    }
}


@Composable
fun SettingsImage() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(id = R.string.settings_profile_image),
            fontSize = 18.sp
        )

        Image(
            painterResource(id = R.drawable.sunflower),
            contentDescription = stringResource(id = R.string.settings_profile_image),
            modifier = Modifier
                .padding(end = 10.dp)
                .height(34.dp)
                .clickable { }
        )
    }
}


@Composable
fun SettingsCheckbox() {
    var isChecked by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = stringResource(id = R.string.settings_consent),
            fontSize = 18.sp
        )

        Checkbox(
            checked = isChecked,
            onCheckedChange = { isChecked = it }
        )
    }
}


@Composable
fun SettingsSwitch() {
    var isChecked by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = stringResource(id = R.string.settings_mobile_data),
            fontSize = 18.sp
        )

        Switch(
            checked = isChecked,
            onCheckedChange = { isChecked = it }
        )
    }
}


@Composable
fun SettingsSlider() {
    var sliderValue by remember { mutableStateOf(0f) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .padding(start = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(id = R.string.settings_text_size),
            fontSize = 18.sp
        )

        Slider(
            value = sliderValue,
            onValueChange = { sliderValue = it },
            steps = 2,
            valueRange = 0f..100f
        )
    }
}


@Composable
fun SettingsRadioButtons() {
    var selected by remember { mutableStateOf("PayPal") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(stringResource(id = R.string.payment_method))

        listOf("PayPal", "Credit Card", "Bank Transfer").forEach {
            Row(verticalAlignment = Alignment.CenterVertically) {

                RadioButton(
                    selected = selected == it,
                    onClick = { selected = it }
                )

                Text(it, modifier = Modifier.padding(start = 8.dp))
            }
        }
    }
}


@Composable
fun SettingsAlertDialog() {
    var showDialog by remember { mutableStateOf(false) }

    Button(onClick = { showDialog = true }) {
        Text(stringResource(id = R.string.sign_out))
    }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text(stringResource(id = R.string.alert_title)) },
            text = { Text(stringResource(id = R.string.alert_message)) },
            confirmButton = {
                Button(onClick = { showDialog = false }) {
                    Text(stringResource(id = R.string.ok))
                }
            },
            dismissButton = {
                Button(onClick = { showDialog = false }) {
                    Text(stringResource(id = R.string.cancel))
                }
            }
        )
    }
}


@Composable
fun SettingsContainer(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // 👈 ESSENCIAL
    ) {

        SettingsHeader()
        Spacer(modifier = Modifier.height(8.dp))

        SettingsImage()
        Spacer(modifier = Modifier.height(8.dp))

        SettingsCheckbox()
        Spacer(modifier = Modifier.height(8.dp))

        SettingsSwitch()
        Spacer(modifier = Modifier.height(8.dp))

        SettingsSlider()
        Spacer(modifier = Modifier.height(8.dp))

        SettingsRadioButtons()
        Spacer(modifier = Modifier.height(16.dp))

        SettingsAlertDialog()
    }
}


@Preview(showBackground = true)
@Composable
fun SettingsPreview() {
    SettingsContainer()
}