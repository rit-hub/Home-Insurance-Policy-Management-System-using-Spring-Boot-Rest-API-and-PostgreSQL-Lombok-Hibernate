package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.QueryCreationException;
import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.Quote;
import com.cg.ritam.HomeInsurance.exceptions.QuoteNotFoundException;
import com.cg.ritam.HomeInsurance.repository.IQuoteRepository;


@Service
public class QuoteServiceImpl implements IQuoteService{
	@Autowired
	IQuoteRepository iQuoteRepository;

	@Override
	public Quote addQuote(Quote quote) {
		return this.iQuoteRepository.save(quote);
	}

	@Override
	public Quote updateQuote(Quote quote) throws QueryCreationException {
		return this.iQuoteRepository.save(quote);
	}

	@Override
	public Quote findQuoteById(int id) throws QuoteNotFoundException {
		return this.iQuoteRepository.findById(id).get();
	}

	@Override
	public Quote removeQuote(int id) throws QuoteNotFoundException {
		Quote entity = this.iQuoteRepository.findById(id).get();
		this.iQuoteRepository.delete(entity);
		return entity;
	}

	@Override
	public List<Quote> showAllQuotes() {
		return this.iQuoteRepository.findAll();
	}

}
