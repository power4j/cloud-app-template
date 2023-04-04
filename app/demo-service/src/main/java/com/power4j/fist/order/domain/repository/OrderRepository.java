package com.power4j.fist.order.domain.repository;

import com.power4j.fist.order.domain.entity.Order;

import java.util.Optional;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
public interface OrderRepository {

	/**
	 * 读取单个
	 * @param id ID
	 * @return Order
	 */
	Optional<Order> readOneById(Long id);

}
