package com.wellsfargo.counselor.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    

    @Column(nullable = false)
    private int creationDate;

    public Portfolio(Client client, int creationDate){
        this.creationDate = creationDate;
    }
 
    public long getPortfolioId(){
        return portfolioId;
    }
    
    public int getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(int creationDate){
        this.creationDate = creationDate;
    }
    

    

    
}
