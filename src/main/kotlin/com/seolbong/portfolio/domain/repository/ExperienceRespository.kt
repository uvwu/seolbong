package com.seolbong.portfolio.domain.repository

import com.seolbong.portfolio.domain.entity.Achievement
import com.seolbong.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRespository : JpaRepository<Experience, Long> {

}