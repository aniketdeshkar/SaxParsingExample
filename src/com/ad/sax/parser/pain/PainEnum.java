package com.ad.sax.parser.pain;

/**
 * 
 * @author Aniket Deshkar
 *
 * Enum which holds Screening fields name
 *
 */
public enum PainEnum {
	
	SCREENINGFIELD_1("Prtry"),
	SCREENINGFIELD_2("Id"),
	SCREENINGFIELD_3("Nm"),
	SCREENINGFIELD_4("EmailAdr"),
	SCREENINGFIELD_5("Issr"),
	SCREENINGFIELD_6("BICFI"),
	SCREENINGFIELD_7("MmbId"),
	SCREENINGFIELD_8("Ctry"),
	SCREENINGFIELD_9("AdrLine"),
	SCREENINGFIELD_10("PstCd"),
	SCREENINGFIELD_11("MmbId");
	
	// declaring private variable for getting values 
    private String value; 
  
    // getter method
    public String getValue() {
		return value;
	} 
    
    // enum constructor - cannot be public or protected 
    private PainEnum(String value) 
    { 
        this.value = value; 
    }

}
