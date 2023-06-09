package com.example.hibernatecartesianproductproblem.entities

import jakarta.persistence.*

@Embeddable
class Details(
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "ITEM_ADDRESS",
        joinColumns = [JoinColumn(name = "ITEM_ID", referencedColumnName = "ID")],
        inverseJoinColumns = [JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ID")]
    )
    val addresses: Set<Address>,

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "ITEM_CONTACT",
        joinColumns = [JoinColumn(name = "ITEM_ID", referencedColumnName = "ID")],
        inverseJoinColumns = [JoinColumn(name = "CONTACT_ID", referencedColumnName = "ID")]
    )
    var contacts: Set<Contact>
)
