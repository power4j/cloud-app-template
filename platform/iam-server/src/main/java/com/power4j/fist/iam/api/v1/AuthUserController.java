package com.power4j.fist.iam.api.v1;

import com.power4j.coca.kit.common.lang.Result;
import com.power4j.fist.boot.apidoc.ApiTrait;
import com.power4j.fist.boot.common.api.Results;
import com.power4j.fist.boot.common.constant.NC;
import com.power4j.fist.boot.security.core.UserInfo;
import com.power4j.fist.boot.security.inner.SecurityUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@RestController
@Tag(name = "认证用户接口")
@RequestMapping(NC.RP_IAM + "/v1/user")
@RequiredArgsConstructor
public class AuthUserController {

	@ApiTrait(level = ApiTrait.ApiLevel.PL, access = ApiTrait.Access.USER)
	@Operation(summary = "用户信息")
	@GetMapping
	public Result<UserInfo> currentUserInfo() {
		return Results.ok(SecurityUtil.requireUser());
	}

}
