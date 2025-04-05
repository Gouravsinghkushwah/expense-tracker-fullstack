package com.expense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.entity.Expense;
import com.expense.repo.ExpenseRepository;

@Service
public class ExpenseService {
    
    @Autowired
    private ExpenseRepository expenseRepository;

    // Expense
    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
    
    
    
    
    
    
    

    // get Expenses
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    //Expense by ID
    public Optional<Expense> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }

    //  Update
    public Expense updateExpense(Long id, Expense updatedExpense) {
        if (expenseRepository.existsById(id)) {
            updatedExpense.setId(id);
            return expenseRepository.save(updatedExpense);
        }
        return null;
    }

    // Delete 
    public String deleteExpense(Long id) {
    	
        if(expenseRepository.existsById(id))
        	{
        	expenseRepository.deleteById(id);
        	return "Deleted";
        	}
        return "Id not found";
    }
}
