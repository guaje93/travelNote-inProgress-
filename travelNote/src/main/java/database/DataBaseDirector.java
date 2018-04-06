package database;

import java.sql.SQLException;
import java.util.List;

import database.dao.CountryDao;
import fxmlUtils.ApplicationException;
import fxmlUtils.DialogUtilis;
import fxmlUtils.FxmlUtils;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataBaseDirector {

private ObservableList<Country> countryList = FXCollections.observableArrayList();
	
	public ObservableList<Country> getcountryList() {
		return countryList;
	}

	public void setcountryList(ObservableList<Country> countryList) {
		this.countryList = countryList;
	}

	private ObjectProperty<Country> country = new SimpleObjectProperty<Country>();


	public DataBaseDirector() {

		init();
		
	}
	
public void init(){
		
		CountryDao countryDao = new CountryDao(DbManager.getConnectionSource());
		List<Country> countries = null;
		try {
			countries = countryDao.queryForAll(Country.class);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			DialogUtilis.errorDialogs(FxmlUtils.getResourceBundle().getString("init"));

		}
		
		countries.forEach(c -> {
			            Country country = new Country();
			            country.setId(c.getId());
			            country.setName(c.getName());
			   
			            
			            this.countryList.add(country);
			        });
			        DbManager.closeConnectionSource();
			    }


	
	public Country insert(String name){
	
		for(int i=0;i<39;i++)
			if (getcountryList().get(i).getName().equals(name)) {
				return getcountryList().get(i);
			}
		
		return getcountryList().get(0);
		
	}
	
	  public void saveCountryInDataBase(String name) throws ApplicationException {
	        CountryDao countryDao = new CountryDao(DbManager.getConnectionSource());
	        Country country = new Country();
	        country.setName(name);
	        
	        //System.out.println(country.getName());
	        countryDao.creatOrUpdate(country);
	        DbManager.closeConnectionSource();
	    }
	
	  public void deleteCountryById(int id) throws ApplicationException, SQLException {
	        CountryDao countryDao = new CountryDao(DbManager.getConnectionSource());
	        countryDao.deleteById(Country.class, id);
	        init();
	    }
	
}
