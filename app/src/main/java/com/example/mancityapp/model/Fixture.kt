package com.example.mancityapp.model

import com.google.gson.annotations.SerializedName

class Fixture(
    @SerializedName("fixture_id") val fixtureId: Int,
    @SerializedName("league") val league: League,
    @SerializedName("homeTeam") val homeTeam: Team,
    @SerializedName("awayTeam") val awayTeam: Team,
    @SerializedName("goalsHomeTeam") val goalsHomeTeam: Int?,
    @SerializedName("goalsAwayTeam") val goalsAwayTeam: Int?,
    @SerializedName("status") val status: String,
    @SerializedName("event_date") val eventDate: String
)