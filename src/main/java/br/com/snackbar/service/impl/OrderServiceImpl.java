package br.com.snackbar.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.snackbar.OrderType;
import br.com.snackbar.model.Order;
import br.com.snackbar.model.Sandwich;
import br.com.snackbar.repository.SandwichRepository;
import br.com.snackbar.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	SandwichRepository sandwichRepository;

	@Override
	public Order closeOrder(Order order) {

		final List<Sandwich> sandwichs;

		if (OrderType.DEFAULT.equals(order.getOrderType())) {

			final List<Integer> sandwichIds = order.getSandwichs().stream().map(Sandwich::getId)
					.collect(Collectors.toList());
			sandwichs = sandwichRepository.findAllById(sandwichIds);

			setQuantityOfIngredientsToOne(sandwichs);

		} else {
			
			sandwichs = new ArrayList<Sandwich>();
		}

		order.setPrice(calculatePrice(sandwichs));

		return order;
	}

	public void setQuantityOfIngredientsToOne(final List<Sandwich> sandwichs) {
		sandwichs.stream().map(Sandwich::getIngredients)
				.forEach((ingredientes) -> ingredientes.forEach(ingrediente -> ingrediente.setQuantity(1)));
	}

	private BigDecimal calculatePrice(List<Sandwich> sandwichs) {

		BigDecimal price = new BigDecimal("0");

		// for (Ingredient ingredient : ingredients) {
		// price =
		// price.add(ingredient.getPrice().multiply(BigDecimal.valueOf(ingredient.getQuantity())));
		// }

		return price;
	}

}
