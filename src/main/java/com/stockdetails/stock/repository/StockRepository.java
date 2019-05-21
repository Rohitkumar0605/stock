package com.stockdetails.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockdetails.stock.entity.UserStockdetails;

@Repository
public interface StockRepository extends JpaRepository<UserStockdetails, Integer>{

}
