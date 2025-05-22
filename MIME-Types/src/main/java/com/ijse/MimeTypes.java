package com.ijse;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@WebServlet ("/mime")
public class MimeTypes extends HttpServlet {
    /*@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //read text/plain data from http request body
        String body = new BufferedReader(new InputStreamReader(
                req.getInputStream()))
                .lines().collect(Collectors.joining("\n"));

        resp.setContentType("text/plain");
        resp.getWriter().write(body);
    }*/

    //read x-www-form-urlencoded data from a http request
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");

        resp.setContentType("text/plain");
        resp.getWriter().write(name + " " + address);

    }
}