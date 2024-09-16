package com.phucdx;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends javax.servlet.http.HttpServlet {
    public void service(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) {
        System.out.println("In service");
    }
}
