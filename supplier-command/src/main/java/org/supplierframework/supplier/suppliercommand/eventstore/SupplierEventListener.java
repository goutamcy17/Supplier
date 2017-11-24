package org.supplierframework.supplier.suppliercommand.eventstore;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.supplierframework.supplier.suppliercommand.eventstore.SupplierRepository;
import org.supplierframework.supplier.suppliercommand.command.SupplierInfoSubmittedEvent;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
@Component
public class SupplierEventListener {

    private final RabbitTemplate rabbitTemplate;
    private SupplierRepository repository;
    

    @Autowired
    public SupplierEventListener(SupplierRepository repository,RabbitTemplate rabbitTemplate) {
        this.repository = repository;
        this.rabbitTemplate = rabbitTemplate;
        
    }

    @EventHandler
    public void on(SupplierInfoSubmittedEvent event) {
        repository.save(new SupplierEntry(event.getId(),event.getOriginalName(),event.getEnglishName(),event.getAddress(),event.getStreet(),event.getCity(),event.getPostalCode(),event.getCountryCode(),event.getCountryName()));
        broadcastUpdates(event.getId());
    }
    
    @Bean
    public MessageConverter jsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }

     private void broadcastUpdates(String id) {
        SupplierEntry  spplierEntry = repository.findOneBySupplierId(id);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        rabbitTemplate.convertAndSend("supplier-queue", spplierEntry); 
    }

}
