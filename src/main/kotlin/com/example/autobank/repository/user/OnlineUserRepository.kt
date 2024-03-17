package com.example.autobank.repository.user

import com.example.autobank.data.user.OnlineUser
import org.springframework.data.jpa.repository.JpaRepository

interface OnlineUserRepository : JpaRepository<OnlineUser, String>
