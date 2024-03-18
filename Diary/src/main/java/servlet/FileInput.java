package servlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Entry")
public class FileInput extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String entry = (String) request.getParameter("Entry");
		System.out.println(entry);
			Scanner sc  = new Scanner(System.in);
			String path ="C:\\Users\\avina\\OneDrive\\Documents\\diary\\";
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyy");
			String tdate = formatter.format(date);
			 path = path+tdate+".txt";
			 File file = new File(path);
			 try {
				boolean create = file.createNewFile();
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(entry);
				fileWriter.close();
			 }
			 catch(Exception e)
			 {
				 
			 }
			 RequestDispatcher dispatcher = request.getRequestDispatcher("DiaryView.jsp");
			 dispatcher.forward(request, response);
		
	}

}
