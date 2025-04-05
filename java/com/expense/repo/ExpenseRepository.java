package com.expense.repo;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense.entity.Expense;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    
    // Custom Query
    List<Expense> findByCategory(String category);
    List<Expense> findByAmountBetween(Double min, Double max);
}