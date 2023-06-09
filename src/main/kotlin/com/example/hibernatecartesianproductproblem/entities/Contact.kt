package com.example.hibernatecartesianproductproblem.entities

import jakarta.persistence.*
import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable

@Entity
@Table(name = "CONTACT")
@Immutable
class Contact(

    @Id
    @Column(name = "ID")
    val id: String
)
