package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.HospitalManager;
import com.training.domains.Hospital;

/**
 * Servlet implementation class HospitalServlet
 */
public class HospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HospitalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String hId=request.getParameter("hospitalId");
		String hName=request.getParameter("hospitalName");
		String loc=request.getParameter("location");
		String pNo=request.getParameter("phoneNo");
		
		Hospital aig=new Hospital(Integer.parseInt(hId),hName,loc,Long.parseLong(pNo));

		HospitalManager xyz=new HospitalManager();
		String r;
		
		if(xyz.addHospital(aig))
			r="Succeed in Adding "+xyz.getHospitalList();
		else
			r="Failure";

		request.setAttribute("result", r);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/success.jsp");
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
