package com.ml.pojo;

import java.math.BigDecimal;

public class Account extends Bank {
    
    private long id;
    private String acNo;
    private String acHolderName;
    private String father;
    private String mother;
    private Account referredBy;
    private String acHolderEmail;
    private long acHolderPhone;
    private long aadhaar;
    private String pan;
    private String otherId;
    private String claimantDetails;
    private String accType;
    private BigDecimal balance;
    private boolean phoneBanking;
    private boolean emailBanking;
    private boolean upiEnabled;
    private boolean aadhaarLinked;
    private boolean panCardLinked;
    private boolean accidentalClaim;
    
    public Account() {
	
    }

    public Account(String acNo, String acHolderName, String father, String mother, String acHolderEmail,
	    long acHolderPhone, String accType) {
	this.acNo = acNo;
	this.acHolderName = acHolderName;
	this.father = father;
	this.mother = mother;
	this.acHolderEmail = acHolderEmail;
	this.acHolderPhone = acHolderPhone;
	this.accType = accType;
    }

    public Account(String acNo, String acHolderName, String father, String mother, String acHolderEmail,
	    long acHolderPhone, long aadhaar, String pan, String accType, BigDecimal balance, boolean phoneBanking,
	    boolean emailBanking, boolean upiEnabled, boolean aadhaarLinked, boolean panCardLinked,
	    boolean accidentalClaim) {
	this.acNo = acNo;
	this.acHolderName = acHolderName;
	this.father = father;
	this.mother = mother;
	this.acHolderEmail = acHolderEmail;
	this.acHolderPhone = acHolderPhone;
	this.aadhaar = aadhaar;
	this.pan = pan;
	this.accType = accType;
	this.balance = balance;
	this.phoneBanking = phoneBanking;
	this.emailBanking = emailBanking;
	this.upiEnabled = upiEnabled;
	this.aadhaarLinked = aadhaarLinked;
	this.panCardLinked = panCardLinked;
	this.accidentalClaim = accidentalClaim;
    }

    public Account(String acNo, String acHolderName, String father, String mother, Account referredBy,
	    String acHolderEmail, long acHolderPhone, long aadhaar, String pan, String otherId, String claimantDetails,
	    String accType, BigDecimal balance, boolean phoneBanking, boolean emailBanking, boolean upiEnabled,
	    boolean aadhaarLinked, boolean panCardLinked, boolean accidentalClaim) {
	this.acNo = acNo;
	this.acHolderName = acHolderName;
	this.father = father;
	this.mother = mother;
	this.referredBy = referredBy;
	this.acHolderEmail = acHolderEmail;
	this.acHolderPhone = acHolderPhone;
	this.aadhaar = aadhaar;
	this.pan = pan;
	this.otherId = otherId;
	this.claimantDetails = claimantDetails;
	this.accType = accType;
	this.balance = balance;
	this.phoneBanking = phoneBanking;
	this.emailBanking = emailBanking;
	this.upiEnabled = upiEnabled;
	this.aadhaarLinked = aadhaarLinked;
	this.panCardLinked = panCardLinked;
	this.accidentalClaim = accidentalClaim;
    }

    public String getAcNo() {
        return acNo;
    }

    public void setAcNo(String acNo) {
        this.acNo = acNo;
    }

    public String getAcHolderName() {
        return acHolderName;
    }

    public void setAcHolderName(String acHolderName) {
        this.acHolderName = acHolderName;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public Account getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(Account referredBy) {
        this.referredBy = referredBy;
    }

    public String getAcHolderEmail() {
        return acHolderEmail;
    }

    public void setAcHolderEmail(String acHolderEmail) {
        this.acHolderEmail = acHolderEmail;
    }

    public long getAcHolderPhone() {
        return acHolderPhone;
    }

    public void setAcHolderPhone(long acHolderPhone) {
        this.acHolderPhone = acHolderPhone;
    }

    public long getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

    public String getClaimantDetails() {
        return claimantDetails;
    }

    public void setClaimantDetails(String claimantDetails) {
        this.claimantDetails = claimantDetails;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isPhoneBanking() {
        return phoneBanking;
    }

    public void setPhoneBanking(boolean phoneBanking) {
        this.phoneBanking = phoneBanking;
    }

    public boolean isEmailBanking() {
        return emailBanking;
    }

    public void setEmailBanking(boolean emailBanking) {
        this.emailBanking = emailBanking;
    }

    public boolean isUpiEnabled() {
        return upiEnabled;
    }

    public void setUpiEnabled(boolean upiEnabled) {
        this.upiEnabled = upiEnabled;
    }

    public boolean isAadhaarLinked() {
        return aadhaarLinked;
    }

    public void setAadhaarLinked(boolean aadhaarLinked) {
        this.aadhaarLinked = aadhaarLinked;
    }

    public boolean isPanCardLinked() {
        return panCardLinked;
    }

    public void setPanCardLinked(boolean panCardLinked) {
        this.panCardLinked = panCardLinked;
    }

    public boolean isAccidentalClaim() {
        return accidentalClaim;
    }

    public void setAccidentalClaim(boolean accidentalClaim) {
        this.accidentalClaim = accidentalClaim;
    }

    @Override
    public String toString() {
	return "Account [id=" + id + ", acNo=" + acNo + ", acHolderName=" + acHolderName + ", father=" + father
		+ ", mother=" + mother + ", referredBy=" + referredBy + ", acHolderEmail=" + acHolderEmail
		+ ", acHolderPhone=" + acHolderPhone + ", aadhaar=" + aadhaar + ", pan=" + pan + ", otherId=" + otherId
		+ ", claimantDetails=" + claimantDetails + ", accType=" + accType + ", balance=" + balance
		+ ", phoneBanking=" + phoneBanking + ", emailBanking=" + emailBanking + ", upiEnabled=" + upiEnabled
		+ ", aadhaarLinked=" + aadhaarLinked + ", panCardLinked=" + panCardLinked + ", accidentalClaim="
		+ accidentalClaim + "]";
    }
    
}
