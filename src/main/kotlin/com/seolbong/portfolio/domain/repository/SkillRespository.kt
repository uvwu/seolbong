package com.seolbong.portfolio.domain.repository

import com.seolbong.portfolio.domain.entity.Achievement
import com.seolbong.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRespository : JpaRepository<Skill, Long> {

}