package dev.lalanacha.graphqlscalars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Boolean isOnSales;
    private Float weight;
    private BigDecimal price;
    private LocalDateTime dateCreated;

    public Product(String title, Boolean isOnSales, Float weight, BigDecimal price, LocalDateTime dateCreated) {
        this.title = title;
        this.isOnSales = isOnSales;
        this.weight = weight;
        this.price = price;
        this.dateCreated = dateCreated;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getOnSales() {
        return isOnSales;
    }

    public void setOnSales(Boolean onSales) {
        isOnSales = onSales;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isOnSales=" + isOnSales +
                ", weight=" + weight +
                ", price=" + price +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
