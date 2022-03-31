package com.minimallite.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minimallite.api.beans.Dashboard;
import com.minimallite.api.dao.DashboardDAO;

@Service
public class DashboardService {
	
	@Autowired
	DashboardDAO dashboardDAO;
	
	public List<Dashboard> getDashboardData(final int userId) {
		return dashboardDAO.getDashboardData(userId);
	}

}
