package com.seolbong.portfolio.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
class Achievement : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // db가 알아서 PK 만듦
    @Column(name = "achievement_id")
    var id: Long? = null
}