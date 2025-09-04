package com.bankingsystem.model;
public class Transaction {

private int transactionID;
private int accountID;
private String type;       
private double amount;
//private LocalDateTime timestamp;


public Transaction(int accountID, String type, double amount) {
    this.accountID = accountID;
    this.type = type;
    this.amount = amount;
}


public int getTransactionID() { 
	return transactionID; 
	}
public int getAccountID() {
	return accountID; 
	}
public String getType() { 
	return type; }
public double getAmount() { 
	return amount; 
	}
//public LocalDateTime getTimestamp() {
//	return timestamp; 
//	}


public void setTransactionID(int transactionID) {
	this.transactionID = transactionID; 
	}
public void setAccountID(int accountID) { 
	this.accountID = accountID; 
	}
public void setType(String type) {
	this.type = type; }
public void setAmount(double amount) { 
	this.amount = amount; }
//public void setTimestamp(LocalDateTime timestamp) { 
//	this.timestamp = timestamp; 
//	}

@Override
public String toString() {
    return "Transaction ID: " + transactionID + ", Account ID: " + accountID +
           ", Type: " + type + ", Amount: " + amount ;
}
}






	