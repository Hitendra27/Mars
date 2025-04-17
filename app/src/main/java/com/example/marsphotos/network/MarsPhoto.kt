package com.example.marsphotos.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarsPhoto(
    val price: Int,
    val id: String,
    val type: String,
    @SerialName(value = "img_src")
    val imgSrc: String
)



