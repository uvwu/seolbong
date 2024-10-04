package com.seolbong.portfolio.domain.repository

import com.seolbong.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievemenetRespository : JpaRepository<Achievement, Long> {

}