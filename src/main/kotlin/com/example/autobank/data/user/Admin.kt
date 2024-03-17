package com.example.autobank.data.user

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "admin")
class Admin(
    onlineId: String,
    email: String
) : OnlineUser(onlineId, email)