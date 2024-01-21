package com.abdullahhalis.mysimplecleanarchitecture.di

import com.abdullahhalis.mysimplecleanarchitecture.data.IMessageDataSource
import com.abdullahhalis.mysimplecleanarchitecture.data.MessageDataSource
import com.abdullahhalis.mysimplecleanarchitecture.data.MessageRepository
import com.abdullahhalis.mysimplecleanarchitecture.domain.IMessageRepository
import com.abdullahhalis.mysimplecleanarchitecture.domain.MessageInteractor
import com.abdullahhalis.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}