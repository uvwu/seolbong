package com.seolbong.portfolio.domain.repository

import com.seolbong.portfolio.domain.entity.Achievement
import com.seolbong.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinktRespository : JpaRepository<Link, Long> {

}