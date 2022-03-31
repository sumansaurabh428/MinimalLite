package com.minimallite.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.minimallite.api.beans.Dashboard;
import com.minimallite.api.services.DashboardService;

@CrossOrigin
@RestController
public class DashboardController {
	
	@Autowired
	DashboardService dashboardService;
	
	@GetMapping("/Dashboard/{userId}")
	public List<Dashboard> getDashboardData(@PathVariable int userId) {
		return dashboardService.getDashboardData(userId);
	}
	
}
