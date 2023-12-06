package com.devsuperior;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.entities.Order;
import com.devsuperior.service.OrderService;

@SpringBootApplication
public class DsInitialApplication implements CommandLineRunner {

	private OrderService orderService;

	public DsInitialApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DsInitialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(2282, 800.00, 10.0);

		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));

	}

}
