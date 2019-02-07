package add.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.utils.BloodDonar;
import com.training.utils.CrudExample;

/**
 * Servlet implementation class AddDonarServlet
 */
public class AddDonarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDonarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long strMobile=Long.parseLong(request.getParameter("mNo"));
		
		String strName=request.getParameter("bloodDonarName");
		String strGroup=request.getParameter("bloodGroup");
		String strLoc=request.getParameter("location");
		
		BloodDonar d=new BloodDonar(strMobile,strName,strGroup,strLoc);
		CrudExample crud=new CrudExample();
		String result=null;
		int res=crud.add(d);
		if(res!=0)
			result="Successful in adding " + res + " donar with name "+ strName;
		else
			result="Failure";
		request.setAttribute("result", result);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/addResponse.jsp");
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
