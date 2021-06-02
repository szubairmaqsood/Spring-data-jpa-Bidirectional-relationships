package com.example.Spring.Data.Bidirectional.relationships.ManyToOne

import javax.persistence.*

@Entity

class OrderItems {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private var id:Long;
    private var description:String;

    /*
    This owns it
     */
    @ManyToOne
    @JoinColumn(name="fk_Order")
    private var order:MyOrder?;

    constructor(){
        id = 0;
        description="";
        order = null;
    }
}