package de.hdm.shared.bo;

import java.io.Serializable;

/**
 * Interface zum identifizieren der Id eines Objekts und um Objekte
 * Serialisierbar zu machen, damit Sie zwischen Client und Server hin und her
 * gesendet werden koennen. Dafuer wird von dem Interface Serializable geerbt.
 * Das Serializable Interface ist ein Marker - Interface um Objekte zu bestimmen
 * die vom Typ Serializable sind. Somti kann bestimmt werden ob diese Objekte
 * zwischen Client und Server gesendet werden koennen.
 * 
 * @author Dennis Lehle
 *
 */
public interface Identifiable extends Serializable {

	// Eindeutige Id des Objekts
	public int id = 0;

	// Darstellung in Menschenleserliche Schrift
	public String toString();

}
