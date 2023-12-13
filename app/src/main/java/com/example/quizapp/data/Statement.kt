package com.example.quizapp.data

import com.squareup.moshi.Json

data class Statement(
        @Json(name = "statement")
        val attr: String,
        val attr2: Boolean,
        val attr3: String
)