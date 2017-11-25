package org.supplierframework.supplier.suppliercommand.eventstore;

import java.util.ArrayList;
import java.util.Collections;

public class PatsyCodes {

public String getCompanyCode() {
    ArrayList<String>  companyCodes = new ArrayList<String>();
    companyCodes.add("SE01");
    companyCodes.add("SE26");
    companyCodes.add("US10");
    companyCodes.add("US45");
    companyCodes.add("IN10");
    companyCodes.add("SED2");
    companyCodes.add("SE35");
    companyCodes.add("SE41");
    companyCodes.add("GB37");
    Collections.shuffle(companyCodes);
    return companyCodes.get(1);
}

public String getPaymentTerms() {
    ArrayList<String>  paymentTerms = new ArrayList<String>();
    paymentTerms.add("B030");
    paymentTerms.add("E060");
    paymentTerms.add("E090");
    paymentTerms.add("C030");
    paymentTerms.add("B060");
    paymentTerms.add("C060");
    paymentTerms.add("E060");
    paymentTerms.add("E030");
    Collections.shuffle(paymentTerms);
    return paymentTerms.get(1);
}
public String getSegment() {
    ArrayList<String>  segments = new ArrayList<String>();
    segments.add("Business Appli.For PRD");
    segments.add("Business Appli.For DCL");
    segments.add("Business Appli.For MAS");
    segments.add("Business Appli.For DVP");   
    Collections.shuffle(segments);
    return segments.get(1);
}
public String getCommodity() {
    return "Commodity";
}
public String getHostname() {
    return "INBLRWIT215";
}
}