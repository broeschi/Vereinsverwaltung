package datenbank;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.healthmarketscience.jackcess.*;

import javafx.fxml.Initializable;
import person.Person;
import gui.PersonController;



public class Datenbank {

	  
	  
    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
    	//person.Person.person();
    	loadData();
    	
    	
    	    }
    
    /**
     * Verbindung zu MS Access DB aufbauen und Inhalt laden
     * 
     * @author Rudolf Broger
     * @return 
     * @throws SQLException 
     * @throws Exception
     */
    public static ArrayList<String> loadData() throws SQLException {
    	ArrayList<String> adresse = new ArrayList<String>(); 
    	
    	 //Database db = DatabaseBuilder.open(new File("C:/Users/Rudolf Broger/Documents/Schützenverwaltung/MSV_be.accdb"));
    	 //Table table = db.getTable("Adressen");
    	 //table.getColumn(null);
    
    	 Connection conn=DriverManager.getConnection(
    	      "jdbc:ucanaccess://C:/Users/Rudolf Broger/Documents/Schützenverwaltung/MSV_be.accdb");
    	Statement s = conn.createStatement();

    	ResultSet rs = s.executeQuery("SELECT adrName, adrVorname, adrGebDat, adrAdresse FROM [tblAdressen]");
    	
    	while (rs.next()) {
    		
    		adresse.add(rs.getString(1));
    		//Person.setAdrName(rs.getString(1));
    		//Adresse.add(rs.getString(2));
    		//person.Person.adrVorname = rs.getString(2);
    		//Adresse.add(rs.getString(3))  ;
    		//Adresse.add(rs.getString(4));
    	    //System.out.println(Person.adrName = rs.getString(1));
    		//return adresse;

    	    
    	    
    	    

    	}
        	 //   System.out.println(adresse);
		return adresse;
		//setAdrName() = adresse;
    	     
    }
    

    
    public static void saveData() {
    	// Todo
    }
  }
