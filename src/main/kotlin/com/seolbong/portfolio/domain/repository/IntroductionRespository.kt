package com.seolbong.portfolio.domain.repository

import com.seolbong.portfolio.domain.entity.Achievement
import com.seolbong.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRespository : JpaRepository<Introduction, Long> {

}