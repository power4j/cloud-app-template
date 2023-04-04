package com.power4j.fist.order.api.controller;

import cn.hutool.core.bean.BeanUtil;
import com.power4j.coca.kit.common.lang.Result;
import com.power4j.fist.boot.common.api.Results;
import com.power4j.fist.boot.apidoc.ApiTrait;
import com.power4j.fist.order.api.dto.OrderDTO;
import com.power4j.fist.order.app.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@RestController
@Tag(name = "订单")
@RequestMapping("/demo/v1/order")
@RequiredArgsConstructor
public class OrderController {

	private final OrderService orderService;

	@ApiTrait(access = ApiTrait.Access.USER)
	@Operation(summary = "读取订单信息")
	@GetMapping("/{orderId}")
	public Result<OrderDTO> getOrder(@PathVariable("orderId") Long orderId) {
		return Results.requiredData(orderService.getOrderById(orderId).orElse(null))
			.map(o -> BeanUtil.toBean(o, OrderDTO.class));
	}

}
