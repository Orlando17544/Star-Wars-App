package com.example.android.starwarsapp.network

import com.squareup.moshi.Json

data class Character (
    val name: String,
    val height: Int,
    val mass: Int,
    @Json(name = "hair_color") val hairColor: String,
    @Json(name = "skin_color") val skinColor: String,
    @Json(name = "eye_color") val eyeColor: String,
    @Json(name = "birth_year") val birthYear: String,
    val gender: String
        )