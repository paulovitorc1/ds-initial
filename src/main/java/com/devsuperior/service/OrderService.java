package com.devsuperior.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public double total(Order order) {

		double valueWithDiscount = order.getBasic() - (order.getDiscount() / 100 * order.getBasic());

		double orderTotal = valueWithDiscount + shippingService.shipment(order);

		return orderTotal;

	}

}
