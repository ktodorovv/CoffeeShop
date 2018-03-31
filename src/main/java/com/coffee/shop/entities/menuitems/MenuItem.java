package com.coffee.shop.entities.menuitems;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class MenuItem {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
	private String id;
    
    @Column(nullable = false, unique = true)
    private String name;
    
    @Column(nullable = false)
    private double price;
    
    @Column(nullable = false)
    private double calories;
    
    @Column(nullable = false)
    private double quantity;
    
    @Column(name = "picture_link", nullable = false)
    private String pictureLink;
}