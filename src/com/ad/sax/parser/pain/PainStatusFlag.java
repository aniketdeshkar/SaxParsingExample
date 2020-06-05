package com.ad.sax.parser.pain;

/**
 * 
 * @author Aniket Deshkar
 * 
 * Bean which contains boolean flag/variable name same as ENUM string 
 * to create set values of variable dynamically
 *
 */
public class PainStatusFlag {

	private boolean CustomerCreditTransferInitiationV03;
	private boolean GroupHeader32;
	private boolean PaymentInstructionInformation3;
	private boolean PaymentInstructionInformation3_PmtInfId;
	private boolean PaymentInstructionInformation3_PmtMtd;
	private boolean PaymentInstructionInformation3_BtchBookg;
	private boolean PaymentInstructionInformation3_NbOfTxs;
	private boolean PaymentInstructionInformation3_ReqdExctnDt;

	public PainStatusFlag() {
		super();
		this.CustomerCreditTransferInitiationV03 = false;
		this.GroupHeader32 = false;
		this.PaymentInstructionInformation3 = false;
		this.PaymentInstructionInformation3_PmtInfId = false;
		this.PaymentInstructionInformation3_PmtMtd = false;
		this.PaymentInstructionInformation3_BtchBookg = false;
		this.PaymentInstructionInformation3_NbOfTxs = false;
		this.PaymentInstructionInformation3_ReqdExctnDt = false;
	}

	public boolean CustomerCreditTransferInitiationV03() {
		return CustomerCreditTransferInitiationV03;
	}

	public void setCustomerCreditTransferInitiationV03(boolean customerCreditTransferInitiationV03) {
		CustomerCreditTransferInitiationV03 = customerCreditTransferInitiationV03;
	}

	public boolean GroupHeader32() {
		return GroupHeader32;
	}

	public void setGroupHeader32(boolean groupHeader32) {
		GroupHeader32 = groupHeader32;
	}

	public boolean PaymentInstructionInformation3() {
		return PaymentInstructionInformation3;
	}

	public void setPaymentInstructionInformation3(boolean paymentInstructionInformation3) {
		PaymentInstructionInformation3 = paymentInstructionInformation3;
	}

	public boolean PaymentInstructionInformation3_PmtInfId() {
		return PaymentInstructionInformation3_PmtInfId;
	}

	public void setPaymentInstructionInformation3_PmtInfId(boolean paymentInstructionInformation3_PmtInfId) {
		PaymentInstructionInformation3_PmtInfId = paymentInstructionInformation3_PmtInfId;
	}

	public boolean PaymentInstructionInformation3_PmtMtd() {
		return PaymentInstructionInformation3_PmtMtd;
	}

	public void setPaymentInstructionInformation3_PmtMtd(boolean paymentInstructionInformation3_PmtMtd) {
		PaymentInstructionInformation3_PmtMtd = paymentInstructionInformation3_PmtMtd;
	}

	public boolean PaymentInstructionInformation3_BtchBookg() {
		return PaymentInstructionInformation3_BtchBookg;
	}

	public void setPaymentInstructionInformation3_BtchBookg(boolean paymentInstructionInformation3_BtchBookg) {
		PaymentInstructionInformation3_BtchBookg = paymentInstructionInformation3_BtchBookg;
	}

	public boolean PaymentInstructionInformation3_NbOfTxs() {
		return PaymentInstructionInformation3_NbOfTxs;
	}

	public void setPaymentInstructionInformation3_NbOfTxs(boolean paymentInstructionInformation3_NbOfTxs) {
		PaymentInstructionInformation3_NbOfTxs = paymentInstructionInformation3_NbOfTxs;
	}

	public boolean PaymentInstructionInformation3_ReqdExctnDt() {
		return PaymentInstructionInformation3_ReqdExctnDt;
	}

	public void setPaymentInstructionInformation3_ReqdExctnDt(boolean paymentInstructionInformation3_ReqdExctnDt) {
		PaymentInstructionInformation3_ReqdExctnDt = paymentInstructionInformation3_ReqdExctnDt;
	}

}
