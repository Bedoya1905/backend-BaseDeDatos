package com.basededatos.backend_baseDeDatos.security;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "JWTFilter", urlPatterns = "/api/*")
public class JWTFilter implements Filter {

    private final String SECRET_KEY = "top-secret";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Logica
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String token = httpRequest.getHeader("Authorization");

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);  // Remove "Bearer " part
            if (isValidToken(token)) {
                // Set authentication context if valid token
                HttpServletResponse httpResponse = (HttpServletResponse) response;
                // Continue with the request
                chain.doFilter(request, response);
            } else {
                ((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid Token");
                return;
            }
        } else {
            ((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED, "Authorization header is missing");
            return;
        }
    }

    private boolean isValidToken(String token) {
        return token.equals("valid-token");
    }

    @Override
    public void destroy() {
        // Logica de limpieza
    }
}
