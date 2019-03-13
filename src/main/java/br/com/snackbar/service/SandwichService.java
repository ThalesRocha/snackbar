package br.com.snackbar.service;

import java.util.List;

import br.com.snackbar.model.Sandwich;

/**
 * @author Thales Rocha
 *
 */
public interface SandwichService {
	
	public List<Sandwich> getAllSandwichs();

	public Sandwich getSandwich(Integer id);

}
