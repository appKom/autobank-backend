package com.example.autobank.repository;

import com.example.autobank.data.Economicrequest
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository

@Repository
interface EconomicrequestRepository : JpaRepository<Economicrequest, Int> {




}
