package br.com.snackbar.model;

import java.math.BigDecimal;
import java.util.List;

import br.com.snackbar.OrderType;

public class Order {

	private List<Sandwich> sandwichs;
	private BigDecimal price;
	private OrderType orderType;

	public List<Sandwich> getSandwichs() {
		return sandwichs;
	}

	public void setSandwichs(List<Sandwich> sandwichs) {
		this.sandwichs = sandwichs;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

}
