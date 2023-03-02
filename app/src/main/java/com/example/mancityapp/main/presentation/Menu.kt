package com.example.mancityapp.main.presentation

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mancityapp.ui.theme.ManCityAppTheme
import com.example.mancityapp.ui.theme.SkyBlue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen() {

    Box(modifier = Modifier.fillMaxSize().background(SkyBlue)) {
        Menu(onClose = {})
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(
                        width = 2.dp,
                        color = SkyBlue,
                        shape = RoundedCornerShape(8.dp)
                    ),
                value = "",
                onValueChange = { /* TODO */ },
                label = { Text(text = "Search", color = Color.Gray) }
            )
        }
    }
}

@Composable
fun Menu(onClose: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(onClick = onClose) {
                Icon(Icons.Default.Close, contentDescription = null)
            }
        }
        LazyColumn(
            modifier = Modifier.padding(top = 40.dp, start = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            item {
                Text("Home", fontSize = 30.sp, modifier = Modifier.clickable {
                    Log.d(TAG,"Home Clicked")
                })
            }
            item {
                Text("Teams", fontSize = 30.sp)
            }
            item {
                Text("Players", fontSize = 30.sp)
            }
            item {
                Text("Shop", fontSize = 30.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    ManCityAppTheme {
            MenuScreen()
    }
}
