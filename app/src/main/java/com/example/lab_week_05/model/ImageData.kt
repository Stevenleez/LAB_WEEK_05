package com.example.lab_week_05.model
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class ImageData(
    @field:Json(name = "url") val imageUrl: String,
    @field:Json(name = "breeds") val breeds: List<CatBreedData> = emptyList()
) {
    // Use first breed name or "Unknown"
    val displayBreed: String
        get() = breeds.firstOrNull()?.name ?: "Unknown"
}
