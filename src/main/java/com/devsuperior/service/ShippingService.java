package com.devsuperior.service;

import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double freight;

		if (order.getBasic() < 100) {
			freight = 20.0;
		} else if (order.getBasic() < 200) {
			freight = 12.0;
		} else {
			freight = 0.0;
		}

		return freight;

	}

}
