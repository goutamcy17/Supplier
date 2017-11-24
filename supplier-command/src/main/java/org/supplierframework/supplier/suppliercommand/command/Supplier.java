package org.supplierframework.supplier.suppliercommand.command;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

@Aggregate
public class Supplier {
    
    private static final Logger LOG = LoggerFactory.getLogger(Supplier.class);
    
    @AggregateIdentifier
    private String id;
    private String originalName;
    private String englishName;
    private String address;
    private String street;
    private String city;
    private String postalCode;
    private String countryCode;
    private String countryName;

    @SuppressWarnings("unused")
    private Supplier() {
    }

    @CommandHandler
    public Supplier(SubmitSupplierCommand command) {
        System.out.println("in supplier.java constructor");
        apply(new SupplierInfoSubmittedEvent(command.getId(),command.getOriginalName(),command.getEnglishName(),command.getAddress(),command.getStreet(),command.getCity(),command.getPostalCode(),command.getCountryCode(),command.getCountryName()));
    }
    
    @EventSourcingHandler
    public void on(SupplierInfoSubmittedEvent event) {
        this.id = event.getId();
        this.originalName = event.getOriginalName(); 
        this.englishName = event.getEnglishName(); 
        this.address = event.getAddress(); 
        this.street = event.getStreet(); 
        this.city = event.getCity(); 
        this.postalCode = event.getPostalCode(); 
        this.countryCode = event.getCountryCode(); 
        this.countryName = event.getCountryName();
        LOG.debug("Applied: 'ProductAddedEvent' [{}] '{}'", event.getId(), event.getOriginalName());
    }

    
}
