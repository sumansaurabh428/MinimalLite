package com.minimallite.api.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.minimallite.api.beans.Dashboard;

@Repository
public class DashboardDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	Dashboard dashboard;
	
	public List<Dashboard> getDashboardData(final int id) {
		
	 return jdbcTemplate.query(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement stmt = con.prepareStatement("SELECT NEW_USER, INVOICES, OPEN_ISSUES, NEW_PROJECTS FROM DASHBOARD WHERE USER_ID = ?");
				stmt.setInt(1, id);
				return stmt;
			}
		}, new ResultSetExtractor<List<Dashboard>>() {
			
			List<Dashboard> dashboardItems = new ArrayList<>();
			@Override
			public List<Dashboard> extractData(ResultSet rs) throws SQLException, DataAccessException {
				Dashboard dboard = new Dashboard();
				while (rs.next()) {
					dboard.setNewUser(rs.getInt(1));
					dboard.setInvoices(rs.getInt(2));
					dboard.setOpenIssues(rs.getInt(3));
					dboard.setNewProjects(rs.getInt(4));
					dashboardItems.add(dboard);
				}
				return dashboardItems;
			}
		});
	}

}
