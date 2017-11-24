package org.supplierframework.supplier.suppliercommand.eventstore;

import java.io.Serializable;

public class SupplierMessage implements Serializable{
    private long id;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getOriginalName() {
        return originalName;
    }
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }
    public String getEnglishName() {
        return englishName;
    }
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getAddressType() {
        return addressType;
    }
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
    public boolean isLiableForVat() {
        return isLiableForVat;
    }
    public void setLiableForVat(boolean isLiableForVat) {
        this.isLiableForVat = isLiableForVat;
    }
    public boolean isNaturalPerson() {
        return isNaturalPerson;
    }
    public void setNaturalPerson(boolean isNaturalPerson) {
        this.isNaturalPerson = isNaturalPerson;
    }
    public boolean isSmallCapitalSupplier() {
        return isSmallCapitalSupplier;
    }
    public void setSmallCapitalSupplier(boolean isSmallCapitalSupplier) {
        this.isSmallCapitalSupplier = isSmallCapitalSupplier;
    }
    public boolean isPotential() {
        return isPotential;
    }
    public void setPotential(boolean isPotential) {
        this.isPotential = isPotential;
    }
    public boolean isProspect() {
        return isProspect;
    }
    public void setProspect(boolean isProspect) {
        this.isProspect = isProspect;
    }
    public boolean isCustomer() {
        return isCustomer;
    }
    public void setCustomer(boolean isCustomer) {
        this.isCustomer = isCustomer;
    }
    public boolean isConsignee() {
        return isConsignee;
    }
    public void setConsignee(boolean isConsignee) {
        this.isConsignee = isConsignee;
    }
    public boolean isInternal() {
        return isInternal;
    }
    public void setInternal(boolean isInternal) {
        this.isInternal = isInternal;
    }
    public boolean isSupplier() {
        return isSupplier;
    }
    public void setSupplier(boolean isSupplier) {
        this.isSupplier = isSupplier;
    }
    public boolean isEngineering() {
        return isEngineering;
    }
    public void setEngineering(boolean isEngineering) {
        this.isEngineering = isEngineering;
    }
    public boolean isPackaging() {
        return isPackaging;
    }
    public void setPackaging(boolean isPackaging) {
        this.isPackaging = isPackaging;
    }
    public boolean isReturns() {
        return isReturns;
    }
    public void setReturns(boolean isReturns) {
        this.isReturns = isReturns;
    }
    public boolean isAutomotivePartner() {
        return isAutomotivePartner;
    }
    public void setAutomotivePartner(boolean isAutomotivePartner) {
        this.isAutomotivePartner = isAutomotivePartner;
    }
    public boolean isNonAutomotive() {
        return isNonAutomotive;
    }
    public void setNonAutomotive(boolean isNonAutomotive) {
        this.isNonAutomotive = isNonAutomotive;
    }
    public SupplierMessage(long id, String originalName, String englishName, String parmaId, String address, String street, String city, String postalCode,
            String countryCode, String countryName, String status, String addressType, boolean isLiableForVat, boolean isNaturalPerson,
            boolean isSmallCapitalSupplier, boolean isPotential, boolean isProspect, boolean isCustomer, boolean isConsignee, boolean isInternal,
            boolean isSupplier, boolean isEngineering, boolean isPackaging, boolean isReturns, boolean isAutomotivePartner, boolean isNonAutomotive) {
        this.id = id;
        this.originalName = originalName;
        this.englishName = englishName;
        this.parmaId = parmaId;
        this.address = address;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.status = status;
        this.addressType = addressType;
        this.isLiableForVat = isLiableForVat;
        this.isNaturalPerson = isNaturalPerson;
        this.isSmallCapitalSupplier = isSmallCapitalSupplier;
        this.isPotential = isPotential;
        this.isProspect = isProspect;
        this.isCustomer = isCustomer;
        this.isConsignee = isConsignee;
        this.isInternal = isInternal;
        this.isSupplier = isSupplier;
        this.isEngineering = isEngineering;
        this.isPackaging = isPackaging;
        this.isReturns = isReturns;
        this.isAutomotivePartner = isAutomotivePartner;
        this.isNonAutomotive = isNonAutomotive;
    }
    private String originalName;
    private String englishName;
    private String parmaId;
    private String address;
    private String street;
    private String city;
    private String postalCode;
    private String countryCode;
    private String countryName;
    // Default Approved
    private String status = "1";
    
    // Address type
    private String addressType = "GA";

    // Legal Info
    private boolean isLiableForVat = true;
    private boolean isNaturalPerson = false;
    private boolean isSmallCapitalSupplier = false;
    
    
    // Role
    private boolean isPotential = true;
    private boolean isProspect = false;
    private boolean isCustomer = false;
    private boolean isConsignee = false;
    private boolean isInternal = false;
    private boolean isSupplier = false;
    private boolean isEngineering = false;
    private boolean isPackaging = false;
    private boolean isReturns = false;
    private boolean isAutomotivePartner = false;
    private boolean isNonAutomotive = false;
 
}