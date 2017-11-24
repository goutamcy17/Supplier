package org.supplierframework.supplier.suppliercommand.command;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import javax.validation.constraints.Min;

public class SubmitSupplierCommand {

    @TargetAggregateIdentifier
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    private String originalName;
    private String englishName;
    private String address;
    private String street;
    private String city;
    private String postalCode;
    private String countryCode;
    private String countryName;
    
    public SubmitSupplierCommand(String supplierId, String originalName,String englishName,String address,String street,String city,String postalCode,String countryCode,String countryName) {
        this.id = supplierId;
        this.originalName = originalName; 
        this.englishName = englishName; 
        this.address = address; 
        this.street = street; 
        this.city = city; 
        this.postalCode = postalCode; 
        this.countryCode = countryCode; 
        this.countryName = countryName; 
    }
}
