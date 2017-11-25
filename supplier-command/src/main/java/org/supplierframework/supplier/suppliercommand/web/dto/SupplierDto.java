package org.supplierframework.supplier.suppliercommand.web.dto;

public class SupplierDto{
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

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    private long id;
    private String supplierId;
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    private String originalName;
    private String englishName;
    private String address;
    private String street;
    private String city;
    private String postalCode;
    private String countryCode;
    private String countryName;
    private String companyCode;
    private String paymentTerms;
    private String segment;
    private String commodity;
    private String hostname;
    
    public SupplierDto(long id,String supplierId,String originalName, String englishName,String address,String street,String city,String postalCode,String countryCode,String countryName,String companyCode,String paymentTerms,String segment,String commodity,String hostname) {
        this.id = id;
        this.supplierId = supplierId;
        this.originalName = originalName;
        this.englishName = englishName;
        this.address = address;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.companyCode = companyCode;
        this.paymentTerms = paymentTerms;
        this.segment = segment;
        this.commodity = commodity;
        this.hostname = hostname;
    }
}
