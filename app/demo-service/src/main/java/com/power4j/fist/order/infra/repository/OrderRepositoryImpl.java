package com.power4j.fist.order.infra.repository;

import com.power4j.fist.order.domain.entity.Order;
import com.power4j.fist.order.domain.repository.OrderRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@Component
public class OrderRepositoryImpl implements OrderRepository, InitializingBean {

	private final Map<Long, Order> orderMap = new HashMap<>();

	@Override
	public Optional<Order> readOneById(Long id) {
		return Optional.ofNullable(orderMap.get(id));
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		for (long i = 0; i < 10L; ++i) {
			Order order = new Order();
			order.setId(i);
			order.setCreatedAt(LocalDateTime.now().plusDays(i).plusMinutes(i * 4));
			orderMap.put(order.getId(), order);
		}
	}

}
