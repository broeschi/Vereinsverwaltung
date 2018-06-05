package person;

import java.util.ArrayList;
import java.util.Date;
import datenbank.Datenbank;

/** Klasse zum Bilden der Teilnehmer*/
public class Person {
	
	public Person(String adrName, String adrVorname, Date adrGebDat, String adrStrasse, Double adrNr, Double adrPLZ,
			String adrWohnort) {
		super();
		Person.adrName = adrName;
		Person.adrVorname = adrVorname;
		this.adrGebDat = adrGebDat;
		Person.adrStrasse = adrStrasse;
		this.adrNr = adrNr;
		this.adrPLZ = adrPLZ;
		this.adrWohnort = adrWohnort;
	}
	
	/**
	 * Name und Vorname an Konstruktor übergeben
	 * @param adrName
	 * @param adrVorname
	 */
	public Person(String adrName, String adrVorname) {
		//		super();
		Person.adrName = adrName;
		Person.adrVorname = adrVorname;
		//this.adrGebDat = adrGebDat;
		//this.adrStrasse = adrStrasse;
		//this.adrNr = adrNr;
		//this.adrPLZ = adrPLZ;
		//this.adrWohnort = adrWohnort;
	}

	public Person(String adrName) {
		//		super();
		Person.adrName = adrName;
		//Person.adrVorname = adrVorname;
		//this.adrGebDat = adrGebDat;
		//this.adrStrasse = adrStrasse;
		//this.adrNr = adrNr;
		//this.adrPLZ = adrPLZ;
		//this.adrWohnort = adrWohnort;
	}

	
	public void laden() {
		try {
			datenbank.Datenbank.loadData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	/** Nachname des Teilnemers*/
	public static String adrName;
	
	/** Vorname des Teilnemers*/
	public static String adrVorname;
	
	/** Geburstdatum des Teilnemers*/
	public Date adrGebDat;
	
	/** Strasse des Teilnemers*/
	public static String adrStrasse;
	
	/** Hausnummer des Teilnemers*/
	public Double adrNr;
	
	/** CH Postleitzahl des Teilnemers*/
	public Double adrPLZ;
	
	/** Wohnort des Teilnemers*/
	public String adrWohnort;

	public String getAdrName() {
		return adrName;
	}

	public void setAdrName(String adrName) {
		Person.adrName = adrName;
	}

	public String getAdrVorname() {
		return adrVorname;
	}

	public void setAdrVorname(String adrVorname) {
		Person.adrVorname = adrVorname;
	}

	public Date getAdrGebDat() {
		return adrGebDat;
	}

	public void setAdrGebDat(Date adrGebDat) {
		this.adrGebDat = adrGebDat;
	}

	public String getAdrStrasse() {
		return adrStrasse;
	}

	public void setAdrStrasse(String adrStrasse) {
		Person.adrStrasse = adrStrasse;
	}

	public Double getAdrNr() {
		return adrNr;
	}

	public void setAdrNr(Double adrNr) {
		this.adrNr = adrNr;
	}

	public Double getAdrPLZ() {
		return adrPLZ;
	}

	public void setAdrPLZ(Double adrPLZ) {
		this.adrPLZ = adrPLZ;
	}

	public String getAdrWohnort() {
		return adrWohnort;
	}

	public void setAdrWohnort(String adrWohnort) {
		this.adrWohnort = adrWohnort;
	}


}

