package application.dao;

import application.model.Etel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class EtelDAO extends JdbcDaoSupport {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    public List<Etel> listEtel(int id){
        String sql = "SELECT * FROM etel where etterem_id="+id;
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<Etel> result = new ArrayList<Etel>();
        for(Map<String, Object> row:rows){
            Etel etel = new Etel();
            etel.setEtterem_id((int)row.get("etterem_id"));
            etel.setNev((String)row.get("nev"));
            etel.setAr((int) row.get("ar"));
            result.add(etel);
        }
        return result;
    }

}
