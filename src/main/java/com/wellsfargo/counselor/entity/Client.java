package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

	@Entity
	public class Client {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long clientId;

	    private String name;

	    @Column(name = "contact_information")
	    private String contactInformation;

	    @ManyToOne
	    @JoinColumn(name = "advisor_id")
	    private FinancialAdvisor financialAdvisor;

	    // Constructors
	    public Client() {
	    }

	    public Client(String name, String contactInformation, FinancialAdvisor financialAdvisor) {
	        this.name = name;
	        this.contactInformation = contactInformation;
	        this.financialAdvisor = financialAdvisor;
	    }

	    // Getters and Setters
	    public Long getClientId() {
	        return clientId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getContactInformation() {
	        return contactInformation;
	    }

	    public void setContactInformation(String contactInformation) {
	        this.contactInformation = contactInformation;
	    }

	    public FinancialAdvisor getFinancialAdvisor() {
	        return financialAdvisor;
	    }

	    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
	        this.financialAdvisor = financialAdvisor;
	    }
	}


