/*package com.zein.belajar.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.annotation.WebServlet;

@WebServlet("/todo/list")
public class HaloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
				
				//data yang akan ditampilkan, nantinya ambil dari database
				List<Todo> daftarTodo = new ArrayList<Todo>();
				daftarTodo.add("Registrasi Openshift");
				
				Todo t1= new Todo();
				t1.setId(1);
				t1.setKeterangan("Registrasi Openshift");
				t1.seSelesai(false);
				daftarTodo.add(t1);
				
				Todo t2= new Todo();
				t2.setId(1);
				t2.setKeterangan("Buat app baru");
				t2.seSelesai(false);
				daftarTodo.add(t2);
				
				Todo t3= new Todo();
				t3.setId(1);
				t3.setKeterangan("BDeploy Aplikasi");
				t3.seSelesai(false);
				daftarTodo.add(t3);
				
				//masukan data ke request attribute
				//req.setAttribute("todo" daftarTodo);
				
				
				
				// redirect ke tampilan
				String lokasiJsp = "/WEB-INF/jsp/todo.jsp";
				RequestDispatcher rd = req.getRequestDispatcher(lokasiJsp);
				rd.forward(req,res);
				
			}
}
*/
