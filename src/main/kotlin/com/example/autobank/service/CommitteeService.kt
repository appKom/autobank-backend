package com.example.autobank.service;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;

@Service
class CommitteeService(private val db: JdbcTemplate) {


    fun addCommittee(name: String) = db.update("insert into comitee (name) VALUES ('${name}')");

    }
