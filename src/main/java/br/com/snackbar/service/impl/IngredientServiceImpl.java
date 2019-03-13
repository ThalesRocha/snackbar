package br.com.snackbar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.snackbar.model.Ingredient;
import br.com.snackbar.repository.IngredientRepository;
import br.com.snackbar.service.IngredientService;

/**
 * @author Thales Rocha
 *
 */
@Service("ingredientService")
public class IngredientServiceImpl implements IngredientService {

	@Autowired
	private IngredientRepository ingredientRepository;

	@Override
	public List<Ingredient> getAllIngredients() {
		return ingredientRepository.findAll();
	}

	@Override
	public Ingredient getIngredient(Integer id) {
		return ingredientRepository.getOne(id);
	}

}
