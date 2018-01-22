

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet
{
    public ArrayList employees= new ArrayList();


  
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {    
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("Hello, Welcome to splessons...!");
        pw.close();

        String person = "Matthew";
        List<Student> students;
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert",0);
        Student student2 = new Student("John",1);
        students.add(student1);
        students.add(student2);
        
            req.setAttribute("person", person);
            req.setAttribute("students", students);
            // Forward to to the JSP file.
            req.getRequestDispatcher("welcome.jsp").forward(req, res);
    }
      
}