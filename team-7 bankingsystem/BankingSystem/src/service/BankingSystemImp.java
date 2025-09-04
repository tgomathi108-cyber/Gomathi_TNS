package service;
import com.bankingsystem.model.*;
import java.util.*;
import java.time.LocalDateTime;

public class BankingSystemImp implements bankingservice {
    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, Account> accounts = new HashMap<>();
    private Map<Integer, Transaction> transactions = new HashMap<>();
    private Map<Integer, Beneficiary> beneficiaries = new HashMap<>();
    private int nextTransactionId = 1;

    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerID(), customer);
    }

    @Override
    public void addAccount(Account account) {
        accounts.put(account.getAccountID(), account);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        Account acc = accounts.get(transaction.getAccountID());
        if (acc != null) {
            if ("Deposit".equalsIgnoreCase(transaction.getType())) {
                acc.setBalance(acc.getBalance() + transaction.getAmount());
            } else if ("Withdrawal".equalsIgnoreCase(transaction.getType())) {
                if (acc.getBalance() >= transaction.getAmount()) {
                    acc.setBalance(acc.getBalance() - transaction.getAmount());
                } else {
                    throw new IllegalArgumentException("Insufficient balance");
                }
            }
            transaction.setTransactionID(nextTransactionId++);
//            transaction.setTimestamp(LocalDateTime.now());
            transactions.put(transaction.getTransactionID(), transaction);
        }
    }

    @Override
    public void addBeneficiary(Beneficiary beneficiary) {
        beneficiaries.put(beneficiary.getBeneficiaryID(), beneficiary);
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accounts.get(id);
    }

    @Override
    public Transaction findTransactionById(int id) {
        return transactions.get(id);
    }

    @Override
    public Beneficiary findBeneficiaryById(int id) {
        return beneficiaries.get(id);
    }

    @Override
    public List<Account> getAccountsByCustomerId(int customerId) {
        List<Account> result = new ArrayList<>();
        for (Account a : accounts.values()) {
            if (a.getCustomerID() == customerId) result.add(a);
        }
        return result;
    }

    @Override
    public List<Transaction> getTransactionsByAccountId(int accountId) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions.values()) {
            if (t.getAccountID() == accountId) result.add(t);
        }
        return result;
    }

    @Override
    public List<Beneficiary> getBeneficiariesByCustomerId(int customerId) {
        List<Beneficiary> result = new ArrayList<>();
        for (Beneficiary b : beneficiaries.values()) {
            if (b.getCustomerID() == customerId) result.add(b);
        }
        return result;
    }

    @Override
    public Collection<Customer> getAllCustomers() { return customers.values(); }
    @Override
    public Collection<Account> getAllAccounts() { return accounts.values(); }
    @Override
    public Collection<Transaction> getAllTransactions() { return transactions.values(); }
    @Override
    public Collection<Beneficiary> getAllBeneficiaries() { return beneficiaries.values(); }
}


	

	


