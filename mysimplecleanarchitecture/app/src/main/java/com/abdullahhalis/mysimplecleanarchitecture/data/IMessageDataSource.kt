package com.abdullahhalis.mysimplecleanarchitecture.data

import com.abdullahhalis.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}