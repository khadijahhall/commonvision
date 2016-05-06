package com.hireme.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hireme.beans.UserMessageBean;
import com.hireme.now.User;
import com.hireme.now.UserDAO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(
		urlPatterns = { "/register" }, 
		initParams = { 
				@WebInitParam(name = "minPassLength", value = "5")
		})
public class RegisterServlet extends HttpServlet {
   // private int minPassLength;

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
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
	public void init(){
	//	minPassLength= Integer.parseInt(this.getInitParameter("minPassLength"));
		 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String mypassword = request.getParameter("mypassword");
		String email = request.getParameter("email");

		
		UserMessageBean msg = new UserMessageBean();
//		UserMessageBean color = new UserMessageBean();
		// String msg = "";
		String link = "";
		//Boolean validSignUp= true;
		//User myUser= new User(userName, pass, email, link, link);
		
		if(!password.equals(mypassword)){
			msg.setMsg( "Registration failed...Password does not match!");
			link = "newuserconfirmation.jsp";
			
		}else {
		User user = new User();
		user.setEmail(email);
		UserDAO udao = new UserDAO();
		Collection<User> myCollection = udao.find(user);
		if (myCollection.size() > 0) {
				msg.setMsg("Email or Username already in use, please log-in.");
				link = "login.jsp";
				
			} else{
				user.setFirstName(firstName);
				user.setLastName(lastName);
				user.setUserName(userName);
				user.setPassword(password);
				user.setEmail(email);
				udao.add(user);
				msg.setMsg("Welcome! Registration is successful!");
				link = "mainMenu.jsp";
			
			}
		/*if(pass.length()<minPassLength){
			msg="Registration failed...Password must be at least 5 characters!";
			link = "newuserconfirmation.jsp";
			color="red";
			validSignUp = false;
			
		}*/
		/*if(udao (userName)){
			msg.setMsg("This username already exists in out system!");
			link = "login.jsp";
			color.setColor("red");
			validSignUp = false;
		}*/
		
		
		/*if (validSignUp) {
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setPassword(pass);
			udao.add(user);
			msg="Welcome! Registration is successful!";
			link = "login.jsp";
			color="green";
			udao.add(myUser);
		}
*/
		request.setAttribute("msg",msg );
		
		RequestDispatcher rd = request.getRequestDispatcher(link);
		rd.forward(request, response);}
		

			}
	
	}


