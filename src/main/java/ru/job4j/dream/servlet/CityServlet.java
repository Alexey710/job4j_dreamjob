package ru.job4j.dream.servlet;

import org.json.JSONArray;
import org.json.JSONObject;
import ru.job4j.dream.store.PsqlStore;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("cities", PsqlStore.instOf().findAllCities());
        req.getRequestDispatcher("/candidate/edit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        List<String> cities = (List<String>) PsqlStore.instOf().findAllCities();
        System.out.println(cities);
        JSONArray jsonArray = new JSONArray();
        for (String city : cities) {
            jsonArray.put(city);
        }
        System.out.println(jsonArray);
        PrintWriter printer = resp.getWriter();
        printer.println(jsonArray);
        printer.flush();
    }

}