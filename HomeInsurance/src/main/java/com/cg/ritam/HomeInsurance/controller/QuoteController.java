package com.cg.ritam.HomeInsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ritam.HomeInsurance.entities.Quote;
import com.cg.ritam.HomeInsurance.service.IQuoteService;

@RestController
public class QuoteController {

	
	@Autowired
	private IQuoteService iQuoteService;
	

	@PostMapping("/quotemanagement")
	public Quote addQuote(@RequestBody Quote q) {
		return this.iQuoteService.addQuote(q);
	}
	
	@PutMapping("/quotemanagement")
	public Quote updateQuote(@RequestBody Quote q) {
		return this.iQuoteService.updateQuote(q);
	}
	
	@GetMapping("/quotemanagement/{id}")
	public Quote findQuoteById(@PathVariable String id) {
		return this.iQuoteService.findQuoteById(Integer.parseInt(id));
	}
	
	@DeleteMapping("/quotemanagement/{id}")
	public Quote removeQuote(@PathVariable String id) {
		return this.iQuoteService.removeQuote(Integer.parseInt(id));
	}
	
	@GetMapping("/quotemanagement")
	public List<Quote> showAllQuotes() {
		return this.iQuoteService.showAllQuotes();
	}
}
