package com.example.Spring.Data.Bidirectional.relationships.ManyToOne

import javax.persistence.*

@Entity
class MyOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private var id:Long;
 /*
 This reference it
 order is name of column in OrderItems
  */

    @OneToMany(mappedBy = "order")
    var orderItems:MutableList<OrderItems>?;
    constructor(){
        id = 0;
        orderItems = null;

    }
}