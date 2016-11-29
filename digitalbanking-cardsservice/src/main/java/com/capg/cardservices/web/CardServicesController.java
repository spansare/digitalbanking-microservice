package com.capg.cardservices.web;

import java.util.List;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.capg.cardservices.dao.CardDAO;
import com.capg.cardservices.model.Card;

import io.dropwizard.hibernate.UnitOfWork;

@Path("/cardservices")
@Produces(MediaType.APPLICATION_JSON)

public class CardServicesController {

	private CardDAO cardDAO;
	
	  public CardServicesController(CardDAO cardDAO) {
	        this.cardDAO = cardDAO;
	    }

	@Path("/{customerId}/cards")   
	@GET
	@UnitOfWork
	public List<Card> getCardList(@PathParam("customerId")  int customerId) {
       
    	//Customer customer=new Customer();
    	//customer.setCustomerId(customerId);
		System.out.println("inside card list");
    	return cardDAO.findByCustomerId(customerId);
    }
	
	
	@Path("/{cardNo}/card")
	@GET
	@UnitOfWork
	public Card getCardDetails(@PathParam("cardNo")  long cardNo) {
       
    	//Customer customer=new Customer();
    	//customer.setCustomerId(customerId);
		System.out.println("inside card Details"+cardNo);
    	return cardDAO.findByCardNo(cardNo);
    }
	
}