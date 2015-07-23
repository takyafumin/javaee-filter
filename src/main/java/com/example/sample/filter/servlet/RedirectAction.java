package com.example.sample.filter.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * リダイレクト処理フロー確認用Servler
 */
@WebServlet(name="Redirect", urlPatterns = {"/redirect"})
public class RedirectAction extends HttpServlet {

    // SUID
    private static final long serialVersionUID = -6580762394437382923L;

    // Logger
    private transient Logger log = LoggerFactory.getLogger(RedirectAction.class);


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("doGet() start");

        // JSPへフォワード
        log.info("doGet() redirect start[{}]", "index.jsp");
        response.sendRedirect("index.jsp");
        log.info("doGet() redirect end [{}]", "index.jsp");

        log.info("doGet() end");
    }
}
