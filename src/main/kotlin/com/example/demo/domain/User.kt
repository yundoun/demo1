package com.example.demo.domain

import jakarta.persistence.*

@Entity
@Table(name = "USERS")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long? = null,
    var name : String? = null,
    var email : String? = null,
    var password : String? = null
)
