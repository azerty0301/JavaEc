package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
@MultipartConfig
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd =
				request.getRequestDispatcher("/WEB-INF/view/form.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String word=request.getParameter("word");

	Part part= request.getPart("pict");
	String filename="";
	if(part.getSize() != 0) {
		filename=Paths.get(part.getSubmittedFileName()).getFileName().toString();
		String path=getServletContext().getRealPath("/upload");
	System.out.println(path);
	part.write(path+File.separator+filename);
	}

request.setAttribute("name",name);
request.setAttribute("word",word);
request.setAttribute("filename",filename);
RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/result.jsp");
rd.forward(request, response);

}
}