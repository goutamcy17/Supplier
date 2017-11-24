package org.supplierframework.supplier.suppliercommand.command;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.Aggregate;
import org.axonframework.commandhandling.model.AggregateNotFoundException;
import org.axonframework.commandhandling.model.Repository;
import org.axonframework.eventhandling.EventBus;
import org.supplierframework.supplier.suppliercommand.eventstore.SupplierEntry;


import static org.axonframework.eventhandling.GenericEventMessage.asEventMessage;

public class SupplierCommandHandler {

    private Repository<Supplier> repository;
    private EventBus eventBus;

    public SupplierCommandHandler(Repository<Supplier> repository, EventBus eventBus) {
        this.repository = repository;
        this.eventBus = eventBus;
    }
	
	
   
}
