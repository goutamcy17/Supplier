package org.supplierframework.supplier.suppliercommand.rabbitmq;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;
import org.supplierframework.supplier.suppliercommand.eventstore.SupplierEntry;
import org.supplierframework.supplier.suppliercommand.eventstore.SupplierRepository;
import org.supplierframework.supplier.suppliercommand.web.SupplierController;
import org.springframework.amqp.core.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Receiver {
    private static final Logger LOG = LoggerFactory.getLogger(SupplierController.class);
    private CountDownLatch latch = new CountDownLatch(1);
    
    @Autowired
    private  SupplierRepository supplierRepository;
    
    public void receiveMessage(final String message) {
        System.out.println("Received <" + message.toString() + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
    
    @RabbitListener(queues = "supplier-queue", containerFactory="jsoFactory")
    public void processSupplierMessage(final Message  message) {
        LOG.info("Message is of type: " + message.getClass().getName());
        LOG.info("Received on myqueue: " + message.toString()); 
        int value = supplierRepository.setParmaId("1111","f132d634-2206-40f0-80fe-dab890abe6e9");
        LOG.info("Update figure: " + value); 
        latch.countDown();
    }

}