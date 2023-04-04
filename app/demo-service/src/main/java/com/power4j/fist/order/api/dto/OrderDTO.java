package com.power4j.fist.order.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@Data
public class OrderDTO implements Serializable {

	private final static long serialVersionUID = 1L;

	private Long id;

	private LocalDateTime createdAt;

}
