package org.supplierframework.supplier.suppliercommand.rabbitmq;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;
import org.supplierframework.supplier.suppliercommand.eventstore.SupplierRepository;
import org.supplierframework.supplier.suppliercommand.web.SupplierController;
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
        Random rand = new Random();
        int num = rand.nextInt(9000000) + 1000000;
        int value = supplierRepository.setParmaId(String.valueOf(num),message);
        LOG.info("Update figure: " + value); 
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
    
    @RabbitListener(queues = "supplier-queue")
    public void processSupplierMessage(final String  message) {
        LOG.info("Message is of type: " + message.getClass().getName());
        LOG.info("Received on myqueue: " + message);
        Random rand = new Random();
        int num = rand.nextInt(9000000) + 1000000;
        int value = supplierRepository.setParmaId(String.valueOf(num),message);
        LOG.info("Update figure: " + value); 
        latch.countDown();
    }

}