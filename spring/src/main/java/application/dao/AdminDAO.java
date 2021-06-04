package application.dao;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import application.model.Admin;
import application.model.Vasarlo;

@Repository
public class AdminDAO extends JdbcDaoSupport {
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	public Admin getAdmin(String email) {
		String sql = "SELECT * FROM admin WHERE email="+"'"+email+"'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		Admin admin = new Admin();

		for(Map<String, Object> row:rows){
			admin.setNev((String)row.get("nev"));
			admin.setEmail((String) row.get("email"));
			admin.setJelszo((String) row.get("jelszo"));
		}
		return admin;
	}
}
