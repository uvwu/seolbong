package com.seolbong.portfolio.domain.entity

import jakarta.persistence.*


@Entity
class ProjectSkill : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // db가 알아서 PK 만듦
    @Column(name = "project_skill_id")
    var id: Long? = null
}