package com.power4j.fist.order.app.service.impl;

import com.power4j.fist.order.app.service.OrderService;
import com.power4j.fist.order.domain.entity.Order;
import com.power4j.fist.order.domain.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;

	@Override
	public Optional<Order> getOrderById(Long id) {
		return orderRepository.readOneById(id);
	}

}
