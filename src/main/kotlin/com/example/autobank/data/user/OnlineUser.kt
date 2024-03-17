package com.example.autobank.data.user

import jakarta.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "onlineuser")
open class OnlineUser(
    @Id
    @Column(name = "onlineId")
    open val onlineId: String,
    @Column(name = "email")
    open val email: String
)