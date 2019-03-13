package br.com.snackbar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.snackbar.model.Ingredient;

/**
 * @author Thales Rocha
 *
 */
@Repository("ingredientRepository")
public interface IngredientRepository extends JpaRepository<Ingredient, Integer>{

}
