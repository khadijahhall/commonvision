package com.hireme.servlets;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hireme.beans.UserMessageBean;
import com.hireme.now.User;
import com.hireme.now.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email") + "";
		String pass = request.getParameter("password")+ "";
		UserMessageBean msg = new UserMessageBean();
		//UserMessageBean color = new UserMessageBean();
		//String msg= "";
		String link;

		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");
		if (user != null && user.getId() > 0) {
			msg.setMsg("You have already logged in!");
			link = "login.jsp";
		} else {
			UserDAO udao = new UserDAO();
			user = new User();
			user.setPassword(pass);
			user.setEmail(email);
			Collection<User> myCollection = udao.find(user);
			if (myCollection.size() > 0) {
				for (Iterator<User> iterator = myCollection.iterator(); iterator.hasNext();) {
					user = (User) iterator.next();
				}
				session = request.getSession();
				session.setAttribute("user", user);
				msg.setMsg("Welcome back " + user.getFirstName() + ". You have successfully logged in.");
				link = "mainMenu.jsp";
			} else {
				msg.setMsg("Login Failed.");
				link = "login.jsp";
			}
		}
		
		
		request.setAttribute("msg",msg );
		
		RequestDispatcher rd = request.getRequestDispatcher(link);
		rd.forward(request, response);
		
		
		
			}

}
