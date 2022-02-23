package io.github.gdiazs.demo;

import javax.servlet.Filter;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import io.github.gdiazs.demo.config.WebConfig;

public class DemoWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/app/*" };
	}

	@Override
	protected Filter[] getServletFilters() {
		var securityFilterChain = new DelegatingFilterProxy("springSecurityFilterChain");
		return new Filter[] { securityFilterChain };
	}
}
