package org.supplierframework.supplier.suppliercommand.web;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.commandhandling.CommandExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.supplierframework.supplier.suppliercommand.command.SubmitSupplierCommand;
import javax.servlet.http.HttpServletResponse;

import org.supplierframework.supplier.suppliercommand.eventstore.SupplierEntry;
import org.supplierframework.supplier.suppliercommand.eventstore.SupplierRepository;

import java.util.List;
import java.util.UUID;

@RestController
public class SupplierController {

	private static final Logger LOG = LoggerFactory.getLogger(SupplierController.class);
	
    private final CommandGateway commandGateway;
    private final SupplierRepository supplierRepository;
    
    @Autowired
    private DiscoveryClient discoveryClient;
    
    public SupplierController(CommandGateway commandGateway,SupplierRepository supplierRepository) {
        this.commandGateway = commandGateway;
        this.supplierRepository = supplierRepository;
    }
	
	@RequestMapping(value = "/suppliersubmit", method = RequestMethod.POST)
    public void add(@RequestParam(value = "originalName", required = true) String originalName,@RequestParam(value = "englishName", required = true) String englishName,@RequestParam(value = "address", required = true) String address,@RequestParam(value = "street", required = true) String street,@RequestParam(value = "city", required = true) String city,@RequestParam(value = "postalCode", required = true) String postalCode,@RequestParam(value = "countryCode", required = true) String countryCode,@RequestParam(value = "countryName", required = true) String countryName,
                    HttpServletResponse response) {

        LOG.debug("Adding Supplier [{}] '{}'", originalName +" "+ englishName+" "+ address+" "+ street+" "+ city+" "+ postalCode+" "+ countryCode+" "+ countryName );

        try {        
            String id = UUID.randomUUID().toString();
			SubmitSupplierCommand command = new SubmitSupplierCommand(id,originalName,englishName,address,street,city,postalCode,countryCode,countryName);
            commandGateway.send(command);
            LOG.info("Added Product [{}] '{}'", id, originalName,englishName,address,street,city,postalCode,countryCode,countryName);
            response.setStatus(HttpServletResponse.SC_CREATED);// Set up the 201 CREATED response
            return;
        } catch (AssertionError ae) {
            LOG.warn("Add Request failed - empty params?. [{}] '{}'", originalName);
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } catch (CommandExecutionException cex) {
            LOG.warn("Add Command FAILED with Message: {}", cex.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

            if (null != cex.getCause()) {
                LOG.warn("Caused by: {} {}", cex.getCause().getClass().getName(), cex.getCause().getMessage());               
            }
        }
    }
	
	@RequestMapping(value = "/supplierlist", method = RequestMethod.GET)
    public @ResponseBody List<SupplierEntry> suppliers(HttpServletResponse response) {
	   return supplierRepository.findAll();	  
	}
	@RequestMapping(value = "/supplierdetails", method = RequestMethod.GET)
    public @ResponseBody SupplierEntry supplierDetail(@RequestParam(value = "supplierId", required = true) String supplierId,HttpServletResponse response) {
       return supplierRepository.findOneBySupplierId(supplierId);   
    }
}
