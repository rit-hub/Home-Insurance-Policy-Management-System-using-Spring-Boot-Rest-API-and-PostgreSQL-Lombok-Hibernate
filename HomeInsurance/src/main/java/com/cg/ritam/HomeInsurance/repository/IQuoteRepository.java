package com.cg.ritam.HomeInsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ritam.HomeInsurance.entities.Quote;
import com.cg.ritam.HomeInsurance.exceptions.QuoteNotFoundException;

@Repository
public interface IQuoteRepository extends JpaRepository<Quote, Integer>{
//	public Quote addQuote(Quote quote);
//
//	public Quote updateQuote(Quote quote) throws QuoteNotFoundException;
//
//	public Quote findQuoteById(int id) throws QuoteNotFoundException;
//
//	public Quote removeQuote(int id) throws QuoteNotFoundException;
//
//	public List<Quote> showAllQuotes();
}

