package com.deveshmittal.androidskeleton.data

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import kotlinx.collections.immutable.ImmutableList


@Stable
data class Earthquake (
    val dateTime: String,
    val depth: Double,
    val eqId: String
)

@Stable
data class EarthquakeList(
    val eqList: ImmutableList<Earthquake>
)
