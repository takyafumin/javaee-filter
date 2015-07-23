package com.example.sample.filter.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * フォワード処理フロー確認用Servler
 */
@WebServlet(name = "Forward", urlPatterns = {"/forward"})
public class ForwardAction extends HttpServlet {

    // SUID
    private static final long serialVersionUID = 4405266917196147720L;

    // Logger
    private transient Logger log = LoggerFactory.getLogger(ForwardAction.class);


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("doGet() start");

        // JSPへフォワード
        log.info("doGet() forward start[{}]", "/index.jsp");
        RequestDispatcher dispatch = request.getRequestDispatcher("/index.jsp");
        dispatch.forward(request, response);
        log.info("doGet() forward end [{}]", "/index.jsp");

        log.info("doGet() end");
    }
}
