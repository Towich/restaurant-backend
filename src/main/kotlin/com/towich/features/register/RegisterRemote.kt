package com.towich.features.register

import kotlinx.serialization.Serializable

@Serializable
data class RegisterReceiveRemote(
    val email: String,
    val password: String
)

@Serializable
data class RegisterRespondRemote(
    val token: String
)
