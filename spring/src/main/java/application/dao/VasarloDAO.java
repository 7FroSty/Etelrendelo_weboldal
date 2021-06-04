package application.dao;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import application.model.Etel;
import application.model.Rendeles;
import application.model.Vasarlo;

@Repository
public class VasarloDAO extends JdbcDaoSupport {
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	public void insertVasarlo(Vasarlo vasarlo) {
		String sql = "INSERT INTO vasarlo(nev, email, jelszo, telefon) VALUES (?, ?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[]{
				vasarlo.getNev(), vasarlo.getEmail(), vasarlo.getJelszo(), vasarlo.getTelefon()
		});
	}


	public Vasarlo getVasarlo(String email) {
		String sql = "SELECT * FROM vasarlo WHERE email="+"'"+email+"'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		Vasarlo vasarlo = new Vasarlo();

		for(Map<String, Object> row:rows){
			vasarlo.setID((Integer)row.get("id"));
			vasarlo.setNev((String)row.get("nev"));
			vasarlo.setEmail((String) row.get("email"));
			vasarlo.setJelszo((String) row.get("jelszo"));
			vasarlo.setTelefon((int) row.get("telefon"));
		}
		return vasarlo;
	}
	
	public boolean vasarloExists(String email) throws Exception{
		String sql = "SELECT * FROM vasarlo WHERE email="+"'"+email+"'";

		if(getJdbcTemplate().queryForList(sql)==null) {
			return false;
		}

		return true;
	}

	public void insertRendeles(Rendeles rendeles, String megjegyzes, String cim) {
		String sql = "INSERT INTO megrendeles(vasarlo_cime, vasarlo_neve, etel_neve, etel_ara, megjegyzes) VALUES (?, ?, ?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[]{
			cim, rendeles.getStringVasarlo(), rendeles.getStringEtelek(), rendeles.getOsszeg(), megjegyzes
		});
	}
	
	public void insertKedvenc(String etel, int id) {
		String sql = "INSERT INTO kedvenc(etel_nev, vasarlo_id) VALUES (?, ?)";
		getJdbcTemplate().update(sql, new Object[]{
			etel, id
		});
	}
	
	public List<Etel> listEtel(int id){
		
		
		String sql = "SELECT * FROM kedvenc JOIN etel on vasarlo_id='"+id+"' and kedvenc.etel_nev = etel.nev";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Etel> result = new ArrayList<Etel>();
		
        for(Map<String, Object> row:rows){
            Etel etel = new Etel();
            etel.setNev((String)row.get("nev"));
            etel.setAr((int) row.get("ar"));
            result.add(etel);
        }
		
		return result;
	}

}
