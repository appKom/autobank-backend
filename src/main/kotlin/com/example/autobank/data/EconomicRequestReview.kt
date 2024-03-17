package com.example.autobank.data

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "economicRequestReview")
class EconomicRequestReview (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "economicRequestReviewId", nullable = false)
        val economicRequestReviewId: Int,

        @Column(name = "economicRequestId", nullable = false)
        val economicRequestId: Int,

        @Column(name = "date", nullable = false)
        val date: LocalDateTime,

        @Column(name = "adminId", nullable = false)
        val adminID: String,

        @Column(name = "description", nullable = true)
        val description: String?,

        @Column(name = "status", nullable = true)
        var status: Boolean?

)