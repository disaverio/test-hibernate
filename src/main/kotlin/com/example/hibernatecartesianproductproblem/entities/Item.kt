package com.example.hibernatecartesianproductproblem.entities

import jakarta.persistence.*
import org.hibernate.annotations.Immutable

@Entity
@Table(name = "ITEM")
@Immutable
class Item(

    @Column(name = "ID")
    val id: String,

    @Id
    @Column(name = "UUID")
    val uuid: String,

    @Column(name = "NAME")
    val name: String,

    @Embedded
    val details: Details
)
