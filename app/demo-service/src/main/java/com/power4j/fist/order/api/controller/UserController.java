package com.power4j.fist.order.api.controller;

import cn.hutool.core.bean.BeanUtil;
import com.power4j.coca.kit.common.lang.Result;
import com.power4j.fist.boot.common.api.Results;
import com.power4j.fist.boot.security.inner.SecurityUtil;
import com.power4j.fist.boot.apidoc.ApiTrait;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@RestController
@Tag(name = "用户")
@RequestMapping("/demo/v1/u")
@RequiredArgsConstructor
public class UserController {

	@ApiTrait(access = ApiTrait.Access.USER)
	@Operation(summary = "读取当前用户信息")
	@GetMapping("/my")
	public Result<Map<String, Object>> getUser() {
		Map<String, Object> data = SecurityUtil.getUser().map(BeanUtil::beanToMap).orElse(null);
		return Results.requiredData(data);
	}

}
