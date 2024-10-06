package com.seolbong.portfolio.domain.entity

import jakarta.persistence.*


@Entity
class ProjectDetail(content: String, url: String?, isActive: Boolean) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // db가 알아서 PK 만듦
    @Column(name = "project_detail_id")
    var id: Long? = null

    var content: String = content

    var url: String? = url

    var isActive = isActive

    fun update(content: String, url: String?, isActive: Boolean) {
        this.content = content
        this.url = url
        this.isActive = isActive
    }
}