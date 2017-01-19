/**
 * This file was generated by the JPA Modeler
 */
package com.eshop.cart.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author User
 */
@Entity
@Table(name = "PRO_ORDER")
public class ProductOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String amount;

    @ManyToMany(targetEntity = Product.class)
    @JoinTable(name = "PRODUCTORDER_PRODUCT", inverseJoinColumns = {
        @JoinColumn(name = "PRODUCTS_ID1")})
    private List<Product> products;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}