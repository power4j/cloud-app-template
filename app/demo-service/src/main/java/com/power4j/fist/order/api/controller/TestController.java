package com.power4j.fist.order.api.controller;

import com.power4j.coca.kit.common.lang.Result;
import com.power4j.fist.boot.apidoc.ApiTrait;
import com.power4j.fist.order.infra.client.feign.PermissionClient;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@Slf4j
@RestController
@Tag(name = "接口测试")
@RequestMapping("/demo/v1/test")
@RequiredArgsConstructor
public class TestController {

	private final PermissionClient permissionClient;

	@ApiTrait(access = ApiTrait.Access.PUBLIC)
	@Operation(summary = "测试接口")
	@GetMapping("/m1")
	public Result<List<Map<String, Object>>> testM1(String serviceName, @RequestParam(required = false) String method) {
		Result<List<Map<String, Object>>> result = permissionClient.loadPermission(serviceName, method);
		log.info("读取接口权限接口,服务名={},请求类型 = {},接口返回结果: {}", serviceName, method, result.simpleDescribe());
		return result;
	}

}
