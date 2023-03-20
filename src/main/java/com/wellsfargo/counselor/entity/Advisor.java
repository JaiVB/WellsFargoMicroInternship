package com.wellsfargo.counselor.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {

    }

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Client> clients;
    
    private List<Security> securities;
    
        public Advisor(String firstName, String lastName, String address, String phone, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.phone = phone;
            this.email = email;
        }
    
        public Long getAdvisorId() {
            return advisorId;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public String getPhone() {
            return phone;
        }
    
        public void setPhone(String phone) {
            this.phone = phone;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public List<Client> getClients() {
            return clients;
        }
    
        public void setClients(List<Client> clients) {
            this.clients = clients;
        }
    
        public void addClient(Client client) {
            clients.add(client);
            client.setAdvisor(this); // Maintain bidirectional relationship
        }
    
        public void removeClient(Client client) {
            clients.remove(client);
            client.setAdvisor(null); // Remove relationship
        }

        public void setSecurities(List<Security> securities) {
            this.securities = securities;
        }

        public void addSecurities(Security securities) {
            this.securities.add(securities);
            securities.setSecurity(this); // Maintain bidirectional relationship
        }

        public void removeSecurities(Security securities) {
            this.securities.remove(securities);
            securities.setSecurity(null); // Remove relationship
        }
    
    
        
}
