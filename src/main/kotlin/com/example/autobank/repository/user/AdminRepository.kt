package com.example.autobank.repository.user

import com.example.autobank.data.user.Admin
import org.springframework.data.jpa.repository.JpaRepository

interface AdminRepository : JpaRepository<Admin, String> {
    fun existsByOnlineId(id: String): Boolean

}