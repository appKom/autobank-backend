package com.example.autobank.service;

import com.example.autobank.data.user.Admin
import com.example.autobank.data.user.OnlineUser
import com.example.autobank.repository.user.AdminRepository
import org.springframework.stereotype.Service;


@Service
class AdminService(private val repository: AdminRepository) {
    fun getAdmins(): List<Admin> {
        return repository.findAll()
    }

    fun checkIfAdmin(user: OnlineUser): Boolean {
        return repository.existsByOnlineId(user.onlineId)
    }
}
