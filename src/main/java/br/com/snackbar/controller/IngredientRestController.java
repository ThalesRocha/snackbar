package br.com.snackbar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.snackbar.model.Ingredient;
import br.com.snackbar.service.IngredientService;

/**
 * @author Thales Rocha
 *
 */

@RestController
public class IngredientRestController {
	
	@Autowired
	private IngredientService ingredientService;
	
	@RequestMapping(path="/ingredients", method=RequestMethod.GET)
	public List<Ingredient> getAllEmployees(){
		return ingredientService.getAllIngredients();
	}
    @RequestMapping(value = "/ingredient/{id}", method = RequestMethod.GET)
	public Ingredient getEmployeeById(@PathVariable("id") Integer id){
		return ingredientService.getIngredient(id);
	}
	
	

}
