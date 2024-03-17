package com.example.autobank.repository.user

import com.example.autobank.data.user.RegularUser
import org.springframework.data.jpa.repository.JpaRepository

interface RegularUserRepository : JpaRepository<RegularUser, String>