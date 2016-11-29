
package com.capg.cardservices.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import io.dropwizard.hibernate.AbstractDAO;

import com.capg.cardservices.model.Card;

public class CardDAO extends AbstractDAO<Card>{
	public CardDAO(SessionFactory factory) {
        super(factory);
    }

  
	 	
	public List<Card> findByCustomerId(int customerId)
	{
		
       // StringBuilder builder = new StringBuilder("%");
		System.out.println("inside dao"+customerId);
        //builder.append(customerId).append("%");
        return list(namedQuery("com.capg.cardservices.Card.GetByCustomerId").setParameter("customerId", customerId));

	}
	public Card findByCardNo(long cardNo)
	{
		System.out.println("inside dao"+cardNo);

		return get(cardNo);
	}
}
