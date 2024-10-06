package com.seolbong.portfolio.domain.entity

import jakarta.persistence.*


@Entity
class Link(
    name: String,
    content: String,
    isActive: Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // db가 알아서 PK 만듦
    @Column(name = "Link_id")
    var id: Long? = null

    var name: String = name

    var content: String = content

    var isActive: Boolean = isActive // is_active로 자동으로 mapping
}