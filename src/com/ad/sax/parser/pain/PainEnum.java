package com.ad.sax.parser.pain;

public enum PainEnum {
	
	CustomerCreditTransferInitiationV03("CstmrCdtTrfInitn"),
	GroupHeader32("GrpHdr"),
	PaymentInstructionInformation3("PmtInf"),
	PaymentInstructionInformation3_PmtInfId("PmtInfId"),
	PaymentInstructionInformation3_PmtMtd("PmtMtd"),
	PaymentInstructionInformation3_BtchBookg("BtchBookg"),
	PaymentInstructionInformation3_NbOfTxs("NbOfTxs"),
	PaymentInstructionInformation3_ReqdExctnDt("ReqdExctnDt");
	
	
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
