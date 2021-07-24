package br.com.dio.app.repositories.data.model

import com.google.gson.annotations.SerializedName

data class Owner (
    val login: String,

    @SerializedName("avatar-url")
    val avatarURL: String
)