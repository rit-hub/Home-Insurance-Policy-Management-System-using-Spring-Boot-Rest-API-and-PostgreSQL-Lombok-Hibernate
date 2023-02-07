package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.data.repository.query.QueryCreationException;
import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.Quote;
import com.cg.ritam.HomeInsurance.exceptions.QuoteNotFoundException;

@Service
public interface IQuoteService {
	public Quote addQuote(Quote quote);

	public Quote updateQuote(Quote quote) throws QueryCreationException;

	public Quote findQuoteById(int id) throws QuoteNotFoundException;

	public Quote removeQuote(int id) throws QuoteNotFoundException;

	public List<Quote> showAllQuotes();
}
