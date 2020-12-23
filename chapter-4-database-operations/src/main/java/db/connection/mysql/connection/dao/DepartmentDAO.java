package db.connection.mysql.connection.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.connection.mysql.connection.model.Employee;
import org.apache.log4j.Logger;

import db.connection.mysql.connection.DbSQLQuery;
import db.connection.mysql.connection.model.Department;


public class DepartmentDAO {

	private static final Logger logger = Logger.getLogger(DepartmentDAO.class);

	
	public List<Department> getAll() {
		
		List<Department> departments = new ArrayList<Department>();
		
		// Tüm departman listesini çeken SQL komutunu aşağıdaki satıra yazınız.
		ResultSet resultSet = DbSQLQuery.select("SELECT * FROM Department");
		
		try {

			if(resultSet == null) {
				return departments;
			}

			while(resultSet.next()) {

				Department dp = createDepartment(resultSet);
				departments.add(dp);
			}
			
		}
		catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return departments;
	}
	public Department createDepartment(ResultSet resultSet) throws SQLException, SQLException {
		Department department=new Department();
		department.setName(resultSet.getString("name"));
		department.setDeptNo(resultSet.getString("deptNo"));

		return department;

	}
	
}
