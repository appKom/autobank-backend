package com.example.autobank.service

import com.example.autobank.data.user.OnlineUser
import com.example.autobank.repository.user.OnlineUserRepository
import org.springframework.stereotype.Service

@Service
class OnlineUserService(val repository: OnlineUserRepository) {

    fun getUsers(): List<OnlineUser>{
        return repository.findAll()
    }
}