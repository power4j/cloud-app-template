package com.power4j.fist.order.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@Data
public class Order {

	private Long id;

	private LocalDateTime createdAt;

}
