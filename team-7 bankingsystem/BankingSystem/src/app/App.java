package app;

import com.bankingsystem.model.*;


	
	import service.*;
	import java.util.*;

	public class App {
	    private static final Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        bankingservice service = new BankingSystemImp();

	        while (true) {
	            System.out.println("\n--- Banking System ---");
	            System.out.println("1. Add Customer");
	            System.out.println("2. Add Account");
	            System.out.println("3. Add Beneficiary");
	            System.out.println("4. Add Transaction");
	            System.out.println("5. Find Customer by Id");
	            System.out.println("6. List Accounts of a Customer");
	            System.out.println("7. List Transactions of an Account");
	            System.out.println("8. List Beneficiaries of a Customer");
	            System.out.println("9. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = Integer.parseInt(sc.nextLine());

	            try {
	                switch (choice) {
	                    case 1 -> addCustomer(service);
	                    case 2 -> addAccount(service);
	                    case 3 -> addBeneficiary(service);
	                    case 4 -> addTransaction(service);
	                    case 5 -> findCustomer(service);
	                    case 6 -> listAccounts(service);
	                    case 7 -> listTransactions(service);
	                    case 8 -> listBeneficiaries(service);
	                    case 9 -> {
	                        System.out.println("Thank you!");
	                        return;
	                    }
	                    default -> System.out.println("Invalid choice!");
	                }
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        }
	    }

	    // --- Menu Methods ---
	    private static void addCustomer(bankingservice service) {
	        System.out.print("Enter Customer ID: ");
	        int id = Integer.parseInt(sc.nextLine());
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Address: ");
	        String address = sc.nextLine();
	        System.out.print("Enter Contact: ");
	        String contact = sc.nextLine();

	        Customer c = new Customer(id, name, address, contact);
	        service.addCustomer(c);
	        System.out.println("Customer added successfully!");
	    }

	    private static void addAccount(bankingservice service) {
	        System.out.print("Enter Account ID: ");
	        int accId = Integer.parseInt(sc.nextLine());
	        System.out.print("Enter Customer ID: ");
	        int custId = Integer.parseInt(sc.nextLine());
	        System.out.print("Enter Account Type (Saving/Current): ");
	        String type = sc.nextLine();
	        System.out.print("Enter Balance: ");
	        double balance = Double.parseDouble(sc.nextLine());

	        Account a = new Account(accId, custId, type, balance);
	        service.addAccount(a);
	        System.out.println("Account created successfully!");
	    }

	    private static void addBeneficiary(bankingservice service) {
	        System.out.print("Enter Beneficiary ID: ");
	        int benId = Integer.parseInt(sc.nextLine());
	        System.out.print("Enter Customer ID: ");
	        int custId = Integer.parseInt(sc.nextLine());
	        System.out.print("Enter Beneficiary Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Account Number: ");
	        String accNo = sc.nextLine();
	        System.out.print("Enter Bank Details: ");
	        String bank = sc.nextLine();

	        Beneficiary b = new Beneficiary(benId, custId, name, accNo, bank);

	        service.addBeneficiary(b);
	        System.out.println("Beneficiary added successfully!");
	    }

	    private static void addTransaction(bankingservice service) {
	        System.out.print("Enter Account ID: ");
	        int accId = Integer.parseInt(sc.nextLine());
	        System.out.print("Enter Type (Deposit/Withdrawal): ");
	        String type = sc.nextLine();
	        System.out.print("Enter Amount: ");
	        double amount = Double.parseDouble(sc.nextLine());

	        Transaction t = new Transaction(accId, type, amount);
	        service.addTransaction(t);
	        System.out.println("Transaction successful!");
	    }

	    private static void findCustomer(bankingservice service) {
	        System.out.print("Enter Customer ID: ");
	        int id = Integer.parseInt(sc.nextLine());
	        Customer c = service.findCustomerById(id);
	        System.out.println(c != null ? c : "Customer not found!");
	    }

	    private static void listAccounts(bankingservice service) {
	        System.out.print("Enter Customer ID: ");
	        int id = Integer.parseInt(sc.nextLine());
	        List<Account> accounts = service.getAccountsByCustomerId(id);
	        if (accounts.isEmpty()) {
	            System.out.println("No accounts found.");
	        } else {
	            accounts.forEach(System.out::println);
	        }
	    }

	    private static void listTransactions(bankingservice service) {
	        System.out.print("Enter Account ID: ");
	        int id = Integer.parseInt(sc.nextLine());
	        List<Transaction> txns = service.getTransactionsByAccountId(id);
	        if (txns.isEmpty()) {
	            System.out.println("No transactions found.");
	        } else {
	            txns.forEach(System.out::println);
	        }
	    }

	    private static void listBeneficiaries(bankingservice service) {
	        System.out.print("Enter Customer ID: ");
	        int id = Integer.parseInt(sc.nextLine());
	        List<Beneficiary> bens = service.getBeneficiariesByCustomerId(id);
	        if (bens.isEmpty()) {
	            System.out.println("No beneficiaries found.");
	        } else {
	            bens.forEach(System.out::println);
	        }
	    }
	}



