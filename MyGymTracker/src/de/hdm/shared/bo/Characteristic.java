package de.hdm.shared.bo;

/**
 * Diese Klasse stellt ein exemplarisches Eígenschaft-Objekt dar, welches
 * vom Nutzer erzeugt wird um Angaben angeben zu koennen.
 * 
 * @author Dennis Lehle
 *
 */
public class Characteristic implements Identifiable {

	//Seriaisierungs Id
	private static final long serialVersionUID = 1L;
	
	/**
	 * Initialisierung der Objekt Eigenschaften
	 */
	private String value;

	
	/**
	 * Auslesen des Wertes
	 * 
	 * @return value Wert der Characteristic
	 */
	public String getValue() {
		return value;
	}

	/**
	 *Setzen der Characteristic
	 *
	 * @param value Wert der Characteristic
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	
	

}
