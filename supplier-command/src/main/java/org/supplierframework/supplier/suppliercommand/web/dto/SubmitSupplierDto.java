package org.supplierframework.supplier.suppliercommand.web.dto;

import lombok.Value;

@Value
public class SubmitSupplierDto{

    private String originalName;
    private String englishName;

    private String address;
    private String street;
    private String city;
    private String postalCode;
    private String countryCode;
    private String countryName;

    
    public SubmitSupplierDto(String originalName, String englishName,String address,String street,String city,String postalCode,String countryCode,String countryName) {
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
