package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private int purchaseDate;

    @Column(nullable = false)
    private int quantity;
    
    @SuppressWarnings("unused")
    private Advisor security;
    
    
        public Security(Portfolio portfolio, String securityName, String category, int purchasePrice, int purchaseDate, int quantity) {
            this.portfolio = portfolio;
            this.securityName = securityName;
            this.category = category;
            this.purchasePrice = purchasePrice;
            this.purchaseDate = purchaseDate;
            this.quantity = quantity;
        }
    
    
        public Long getSecurityId() {
            return securityId;
        }
    
        public String getSecurityName() {
            return securityName;
        }
    
        public void setSecurityName(String securityName) {
            this.securityName = securityName;
        }
    
        public String getCategory() {
            return category;
        }
    
        public void setCategory(String category) {
            this.category = category;
        }
    
        public int getPurchasePrice() {
            return purchasePrice;
        }
    
        public void setPurchasePrice(int purchasePrice) {
            this.purchasePrice = purchasePrice;
        }
    
        public int getPurchaseDate() {
            return purchaseDate;
        }
    
        public void setPurchaseDate(int purchaseDate) {
            this.purchaseDate = purchaseDate;
        }
    
        public int getQuantity() {
            return quantity;
        }
    
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    
    
        public void setSecurity(Advisor security) {
            this.security = security;
    }
    
}
