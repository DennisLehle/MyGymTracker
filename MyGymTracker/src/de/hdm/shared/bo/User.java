package de.hdm.shared.bo;

/**
 * Diese Klasse stellt ein exemplarisches User-Objekt dar, welcher
 * sich in das System einloggt.
 * 
 * @author Dennis Lehle
 *
 */
public class User implements Identifiable{
	
		//Seriaisierungs Id
		private static final long serialVersionUID = 1L;
		
		/**
		 * Initialisierung der Objekt Eigenschaften
		 */
		private boolean loggedIn = false;
		private String loginUrl = "";
		private String logoutUrl = " ";
		private String emailAddress = "";
		private String nickname = "";

		
		/**
		 * Gibt TRUE zurueck, wenn ein Nutzer angemeldet ist andernfalls wird 
		 * FALSE zurueckgegeben.
		 * 
		 * @return loggedIn status ob der Nutzer eingeloggt ist
		 */
		public boolean isLoggedIn() {
			return loggedIn;
		}

		/**
		 * Gibt den Login-Status zurueck.
		 * 
		 * @return loggedIn
		 */
		public boolean getLoginIn() {
			return loggedIn;
		}

		/**
		 * Setzt den Login-Status
		 * 
		 * @param loggedIn Status setzen für den eingeloggten Nutzer
		 */
		public void setLoginIn(boolean loggedIn) {
			this.loggedIn = loggedIn;
		}

		/**
		 * Gibt die LoginUrl zurueck.
		 * 
		 * @return loginUrl
		 */
		public String getLoginUrl() {
			return loginUrl;
		}

		/**
		 * Setzt die LoginUrl
		 * 
		 * @param loginUrl die gesetzt werden soll
		 */
		public void setLoginUrl(String loginUrl) {
			this.loginUrl = loginUrl;
		}

		/**
		 * Gibt die Logout zurueck.
		 * 
		 * @return logoutUrl
		 */
		public String getLogoutUrl() {
			return logoutUrl;
		}

		/**
		 * Setzt die LogoutUrl
		 * 
		 * @param logoutUrl für den Loggout
		 */
		public void setLogoutUrl(String logoutUrl) {
			this.logoutUrl = logoutUrl;
		}

		/**
		 * Gibt die Email zurueck.
		 * 
		 * @return emailAdress
		 */
		public String getEmailAddress() {
			return emailAddress;
		}

		/**
		 * Setzt die Email
		 * 
		 * @param emailAddress des Nutzers
		 */
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		/**
		 * Gibt den Nickname des Nutzers zurueck
		 * 
		 * @return nickname des Nutzers
		 */
		public String getNickname() {
			return nickname;
		}

		/**
		 * Setzen des Nicknames
		 * 
		 * @param nickname des Nutzers
		 */
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
}
