package data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class ReportResponse(
    val result: Boolean
)
