package com.abdullahhalis.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String) : MessageEntity
}