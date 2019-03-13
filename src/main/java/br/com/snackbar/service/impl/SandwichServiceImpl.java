package br.com.snackbar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.snackbar.model.Sandwich;
import br.com.snackbar.repository.SandwichRepository;
import br.com.snackbar.service.SandwichService;

/**
 * @author Thales Rocha
 *
 */
@Service
public class SandwichServiceImpl implements SandwichService {

	@Autowired
	SandwichRepository sandwichRepository;

	@Override
	public List<Sandwich> getAllSandwichs() {
		return sandwichRepository.findAll();
	}

	@Override
	public Sandwich getSandwich(Integer id) {
		return sandwichRepository.getOne(id);
	}

}
