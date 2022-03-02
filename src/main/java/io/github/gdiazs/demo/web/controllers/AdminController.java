package io.github.gdiazs.demo.web.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping
	public String showIndex() {

		return "admin/index";
	}

}
