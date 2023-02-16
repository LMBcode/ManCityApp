package com.example.mancityapp.main

import android.media.Image
import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.End
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.mancityapp.R
import com.example.mancityapp.ui.theme.Pink40
import com.example.mancityapp.ui.theme.Sf
import com.example.mancityapp.ui.theme.SkyBlue
import com.example.mancityapp.ui.theme.Typography
import com.example.mancityapp.ui.theme.cityzenDarkBlue
import com.example.mancityapp.ui.theme.lightStoneGray


@Composable
fun MainScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = SkyBlue)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.city), contentDescription = "",
                Modifier
                    .size(80.dp, 80.dp)
                    .padding(16.dp)
            )

            Spacer(Modifier.weight(1f, true))

            Spacer(Modifier.weight(1f, true))
            Row(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Text(text = "Menu", modifier = Modifier.align(Alignment.CenterVertically), color = cityzenDarkBlue)
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "")
                }
            }
        }
        Body()
        Footer()
    }
}

@Composable
fun Body(text : String ?= null , image : Int ?= null){
    Box(
        modifier = Modifier
            .padding(top = 16.dp)
            .height(550.dp)
    ) {
        Column(modifier = Modifier.padding(top = 16.dp)) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp),
                shape = RectangleShape
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mahrez),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            Text(
                text = "Mahrez strike secures crucial three points at Chelsea",
                modifier = Modifier.padding(16.dp),
                style = Typography.headlineMedium,
                color = cityzenDarkBlue
            )

                Text(
                    text = "Men's team",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .wrapContentSize(align = Alignment.BottomEnd),
                    style = Typography.titleSmall,
                    color = cityzenDarkBlue
                )
        }
    }
}

@Composable
fun Footer(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(400.dp)
        .background(color = lightStoneGray)
    ) {

        Text("Next Fixture", Modifier.padding(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(text = "Sun 08 Jan", textAlign = TextAlign.Center, color = cityzenDarkBlue, style = Typography.titleMedium)

            Text(text = "FA Cup", Modifier.padding(top = 8.dp), textAlign = TextAlign.Center)

            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.city), contentDescription = "",
                        Modifier
                            .size(60.dp, 60.dp)
                            .padding(top = 8.dp, end = 12.dp),
                        Alignment.CenterStart
                    )
                    Text(text = "Man City", Modifier.padding(top = 8.dp), textAlign = TextAlign.Center, style = Typography.titleSmall)
                }
                Column() {
                    Text(text = "16:30", Modifier.padding(top = 8.dp), textAlign = TextAlign.Center, color = cityzenDarkBlue, style = Typography.titleMedium)

                    Text(text = "GMT", Modifier.padding(top = 8.dp), textAlign = TextAlign.Center)
                }
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.chelsi), contentDescription = "",
                        Modifier
                            .size(60.dp, 60.dp)
                            .padding(top = 8.dp, start = 12.dp),
                        Alignment.CenterStart
                    )

                    Text(text = "Chelsea", Modifier.padding(top = 8.dp,start = 12.dp), textAlign = TextAlign.Center,style = Typography.titleSmall)
                }

            }
        }
    }
}


