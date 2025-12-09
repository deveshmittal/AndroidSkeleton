package com.deveshmittal.androidskeleton.data

import androidx.compose.runtime.Stable


@Stable
data class Earthquake (
    val dateTime: String,
    val depth: Double,
    val eqId: String
)

@Stable
data class EarthquakeList(
    val eqList: List<Earthquake>
)
