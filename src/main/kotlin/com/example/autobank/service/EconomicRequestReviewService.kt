package com.example.autobank.service

import com.example.autobank.data.EconomicRequestReview
import com.example.autobank.data.Economicrequest
import com.example.autobank.data.user.OnlineUser
import com.example.autobank.repository.EconomicRequestReviewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class EconomicRequestReviewService {
    @Autowired
    lateinit var economicRequestReviewRepository : EconomicRequestReviewRepository
    fun checkIfRequest(economicrequest: Economicrequest) : Boolean {
        return economicRequestReviewRepository.existsByEconomicRequestId(economicrequest.id)
    }

    fun createEconomicrequestReview (status: Boolean, user: OnlineUser, description: String, economicrequest: Economicrequest) {
        val dato = LocalDateTime.now()
        val economicRequestReview = EconomicRequestReview( economicRequestReviewId = -1, economicRequestId = economicrequest.id, date = dato, adminID = user.onlineId, description = description, status = status )
        economicRequestReviewRepository.save(economicRequestReview)

    }

    fun updateStatus(economicRequestReview: EconomicRequestReview, status: Boolean){
        economicRequestReviewRepository.findEconomicRequestReviewsEconomicRequestIdAndUpdateStatus(economicRequestReview.economicRequestReviewId, status)
    }

    fun getReview(economicrequest: Economicrequest) : EconomicRequestReview{
        return economicRequestReviewRepository.getEconomicRequestReviewByEconomicRequestId(economicrequest.id)

    }
}