package application.dao;

import application.model.Etterem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class EtteremDAO extends JdbcDaoSupport {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    public List<Etterem> listEtterem(){
        String sql = "SELECT * FROM etterem";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<Etterem> result = new ArrayList<Etterem>();
        for(Map<String, Object> row:rows){
            Etterem etterem = new Etterem();
            etterem.setId((int)row.get("id"));
            etterem.setEtterem_neve((String)row.get("etterem_neve"));
            etterem.setEtterem_cime((String)row.get("etterem_cime"));
            etterem.setAdmin_nev((String) row.get("admin_nev"));
            result.add(etterem);
        }
        return result;
    }
    
    public Etterem getEtteremById(int id){
		String sql = "SELECT * FROM etterem WHERE id=" +id;
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Etterem> result = new ArrayList<Etterem>();
		for(Map<String, Object> row:rows){
			Etterem etterem = new Etterem();
			etterem.setId((Integer)row.get("id"));
			etterem.setEtterem_neve((String)row.get("etterem_neve"));
			etterem.setEtterem_cime((String) row.get("etterem_cime"));
			etterem.setAdmin_nev((String) row.get("admin_nev"));
			result.add(etterem);
		}
		
		return result.get(0);
	}
    
    public void deleteEtterem(int id){
		String sql = "DELETE FROM etterem WHERE id=" +id;
		getJdbcTemplate().update(sql);	
	}


}
