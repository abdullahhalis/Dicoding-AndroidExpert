package com.dicoding.mysimplelogin

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.context.loadKoinModules
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject

class MainActivityTest : KoinTest {
    private val userRepository: UserRepository by inject()
    private val username = "bedul"

    @Before
    fun setUp() {
        loadKoinModules(storageModule)
        userRepository.loginUser(username)
    }

    @After
    fun tearDown() {
        stopKoin()
    }

    @Test
    fun getUsernameFromRepository() {
        val requestedUsername = userRepository.getUser()
        assertEquals(username, requestedUsername)
    }
}