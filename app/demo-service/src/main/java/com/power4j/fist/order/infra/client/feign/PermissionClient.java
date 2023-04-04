package com.power4j.fist.order.infra.client.feign;

import com.power4j.coca.kit.common.lang.Result;
import com.power4j.fist.cloud.core.constant.ServiceConstant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@FeignClient(name = ServiceConstant.SERVICE_NAME_IAM, contextId = "permissionClient")
public interface PermissionClient {

	/**
	 * 获取 Permission 记录
	 * @param serviceName 服务名
	 * @param method HTTP 方法
	 * @return Result
	 */
	@GetMapping("/iam/v1/permission/service/{serviceName}")
	Result<List<Map<String, Object>>> loadPermission(@PathVariable(value = "serviceName") String serviceName,
			@RequestParam String method);

	/**
	 * 检查用户是否拥有某个资源的权限
	 * @param userId 用户ID
	 * @param resourceId 全局唯一资源ID
	 * @return ture 有权限 ,false 无权限
	 */
	@GetMapping("/permission-check")
	Result<Boolean> hasPermission(@RequestParam Long userId, @RequestParam String resourceId);

}
