package br.com.snackbar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.snackbar.model.Order;
import br.com.snackbar.service.OrderService;

@RestController
public class OrderRestController {

	@Autowired
	OrderService orderService;

	@RequestMapping(method = RequestMethod.POST, value = "/register/order")
	public Order registerOrder(@RequestBody Order order) {
		System.out.println("Teste");
		return orderService.closeOrder(order);
	}

}
