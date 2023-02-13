package com.example.mancityapp.main

import android.media.Image
import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import com.example.mancityapp.R


@Composable
fun MainScreen(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(id = R.drawable.city), contentDescription = "",Modifier.size(50.dp,50.dp))
            
            Spacer(Modifier.weight(1f, true))
            
            Text("Your menu items here")
            
            Spacer(Modifier.weight(1f, true))
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.End
            ) {
                Text(text = "Menu")


                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "")
                }
            }
        }
    }


}
