package com.example.autobank.data.user

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "regularuser")
class RegularUser(
    onlineId: String,
    email: String
) : OnlineUser(onlineId, email)