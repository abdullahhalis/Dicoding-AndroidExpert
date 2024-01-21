package com.abdullahhalis.mysimplecleanarchitecture.data

import com.abdullahhalis.mysimplecleanarchitecture.domain.IMessageRepository
import com.abdullahhalis.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}