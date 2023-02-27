package com.example.mancityapp.model

import com.google.gson.annotations.SerializedName

data class League(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("country") val country: String,
    @SerializedName("logo") val logo: String?
)
