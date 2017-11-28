package org.supplierframework.supplier.suppliercommand.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CORSFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {}

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest) servletRequest;

    HttpServletResponse resp = (HttpServletResponse) servletResponse;
    resp.addHeader("Access-Control-Allow-Origin","*");
    resp.addHeader("Access-Control-Allow-Methods","GET,POST");
    resp.addHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");

    chain.doFilter(request, servletResponse);
}

 public void destroy() {}
}