package com.stockdetails.stock.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockdetails.stock.entity.UserStockdetails;
import com.stockdetails.stock.service.StockServiceImpl;

@RestController
@RequestMapping("/stocksapp")
public class StockController {

	@Autowired
	private StockServiceImpl stockServiceImpl;

	@GetMapping("/getmonthlyusers/{month}")
	public List<UserStockdetails> getUsersOnMonthlyBasis(@PathVariable("month") int month) {
		return stockServiceImpl.getMonthlyData(month);

	}

	@GetMapping("/getdailyusers/{todaydate}")
	public List<UserStockdetails> getDailyUsersStockDetails(@PathVariable("todaydate") String todayDate) {
		return stockServiceImpl.getDaily(todayDate);
	}

	@GetMapping("/getweeklyusers/{startdate}/{enddate}")
	public List<UserStockdetails> getWeeklyUserStockDetails(@PathVariable("startdate") String startdate,
			@PathVariable("enddate") String enddate) {
		return stockServiceImpl.getWeekly(startdate, enddate);

	}

}
