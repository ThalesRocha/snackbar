package br.com.snackbar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.snackbar.model.Sandwich;
import br.com.snackbar.service.SandwichService;

/**
 * @author Thales Rocha
 *
 */
@RestController
public class SandwichIngredientRestController {

	@Autowired
	private SandwichService sandwichService;

	@RequestMapping(path = "/sandwichs_ingredients", method = RequestMethod.GET)
	public List<Sandwich> getAllSandwichs() {
		return sandwichService.getAllSandwichs();
	}

	@RequestMapping(value = "/sandwich_ingredients/{id}", method = RequestMethod.GET)
	public Sandwich getEmployeeById(@PathVariable("id") Integer id) {
		return sandwichService.getSandwich(id);
	}

}
