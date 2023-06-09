package com.example.hibernatecartesianproductproblem.entities

import jakarta.persistence.*
import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable

@Entity
@Table(name = "ADDRESS")
@Immutable
class Address(

    @Id
    @Column(name = "ID")
    val id: String
)
