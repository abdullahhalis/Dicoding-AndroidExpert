package com.abdullahhalis.mysimplecleanarchitecture.data

import com.abdullahhalis.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Hello $name! Welcome to Clean Architecture")
}