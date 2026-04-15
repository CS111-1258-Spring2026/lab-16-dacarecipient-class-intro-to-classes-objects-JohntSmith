/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
<class name>
-----------------------------------------
<data, i.e. variables>
-----------------------------------------
<actions, i.e. methods>
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables. 
	private String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private String birthday;
	private String validFromDat;
	private String expirationDate;
	private String sex;

	
	/***** ACCESSORS *****/ //getters
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	public String getSurname(){
		return this.surname;
	}
	public String getGivenName(){
		return this.givenName;
	}
	public String uscisNumber(){
		return this.uscisNumber;
	}
	public String getCountryOfOrigin(){
		return this.countryOfOrigin;
	}
	public String getBirthday(){
		return this.birthday;
	}
	public String getValidFromDat(){
		return this.validFromDat;
	}
	public String getExpirationDate(){
		return this.expirationDate;
	}
	public String getSex(){
		return this.sex;
	}


	/***** MUTATORS *****/ //setters
	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.
	public void setSurname(String surname){
		this.surname = surname;
	}
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}
		public void setUscisNumber(String uscisNumber){
		this.uscisNumber = uscisNumber;
	}
	public void setCountryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
		public void setBirthday(String birthday){
		this.birthday = birthday;
	}
	public void setValidFromDat(String validFromDat){
		this.validFromDat = validFromDat;
	}
	public void setExpirationDate(String expirationDate){
		this.expirationDate = expirationDate;
	}
	public void setSex(String sex){
		this.sex = sex;
	}



	//TODO: Write the setAll method. Remember to include documentation. // OR setSurname(Chapeton-Lamas);
	public void setAll(String surname, String givenName, int uscisNumber, String countryOfOrigin, int birthday, int validFromDat, int expirationDate, String sex){
		this.surname = "Chapeton-Lamas";
		this.givenName = "Nery";
		this.uscisNumber = 12-4-789;
		this.countryOfOrigin = "Guatemala";
		this.birthday = 

		//setSurname("Cahpeton-Lamas");
		
	}
}