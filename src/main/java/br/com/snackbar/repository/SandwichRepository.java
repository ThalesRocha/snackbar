package br.com.snackbar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.snackbar.model.Sandwich;

/**
 * @author Thales Rocha
 *
 */
@Repository("sandwichRepository")
public interface SandwichRepository extends JpaRepository<Sandwich, Integer>{

}
