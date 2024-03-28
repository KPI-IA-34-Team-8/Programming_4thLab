package kpi.team8_5.fourthlab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import kpi.team8_5.fourthlab.lab10.*;

@WebServlet(name = "controller", value = "/controller")
public class Controller extends HttpServlet {
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private MovieDatabase movieDatabase;
    public void init() {
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String result;
        String taskExec = req.getParameter("taskNum");
        String task2Extra = req.getParameter("task2Extra");
        taskExec = taskExec != null ? taskExec : "";
        task2Extra = task2Extra != null ? task2Extra : "";
        switch (taskExec) {
            case "1":
                try {
                    result = Task1.Execute(movieDatabase);
                    result = result == null ? "There is no actor that stars in no movies!" : "The actor that stars in no movies is " + result;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case "2":
                List<String> resultList = Task2.Execute(movieDatabase, task2Extra);
                if (resultList.isEmpty()) result = "Nobody has ever played with the actor " + task2Extra;
                else result = "The actors that have played with the actor " + task2Extra + " are the following: " + String.join(", ", resultList);
                break;
            case "3":
                result = "The movie that has the most amount of actors is: " + Task3.Execute(movieDatabase);
                break;
            default:
                result = "Unknown action.";
                break;
        }
        req.setAttribute("taskExecuted", taskExec);
        req.setAttribute("result", result);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    public void destroy() {
    }
}