package com.example.mancityapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mancityapp.R

// Set of Material typography styles to start with

val Sf = FontFamily(
    Font(R.font.sfprodisplaybold),
    Font(R.font.sfprodisplayblackitalic),
    Font(R.font.sfprodisplayheavyitalic),
    Font(R.font.sfprodisplaylightitalic),
    Font(R.font.sfprodisplaymedium),
    Font(R.font.sfprodisplayregular),
    Font(R.font.sfprodisplaythinitalic)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = Sf,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    titleMedium =TextStyle(
        fontFamily = Sf,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 36.sp
    ),
    titleSmall = TextStyle(
        fontFamily = Sf,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        lineHeight = 36.sp
    )
)




    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
