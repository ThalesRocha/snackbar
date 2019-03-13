package br.com.snackbar.service;

import java.util.List;

import br.com.snackbar.model.Ingredient;

/**
 * @author Thales Rocha
 *
 */
public interface IngredientService {

	public List<Ingredient> getAllIngredients();

	public Ingredient getIngredient(Integer id);

}
