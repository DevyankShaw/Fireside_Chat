package com.devyankshaw.chatapp.model


data class User(val name: String,
                val bio: String,
                val profilePicturePath: String?) {
    constructor(): this("", "", null)
}