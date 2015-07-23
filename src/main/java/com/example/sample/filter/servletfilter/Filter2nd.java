package com.example.sample.filter.servletfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * ServletFilter(2nd)クラス
 */
@WebFilter(filterName="Filter2nd", urlPatterns="/*")
public class Filter2nd implements Filter {

    // Logger
    private transient Logger log = LoggerFactory.getLogger(Filter2nd.class);



    public void destroy() {
    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        log.info("doFilter() start");


        // chain
        chain.doFilter(request, response);


        log.info("doFilter() end");
    }


    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

}
