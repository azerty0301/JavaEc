package controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Station;
import model.StationParser;
import model.TrainParser;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TrainParser parser=new TrainParser();
		String url="http://express.heartrails.com/api/json?method=getLines&area="+URLEncoder.encode("関東","UTF-8");
		List<String>  trainList=parser.getList(url);
		request.setAttribute("trainList", trainList);
		RequestDispatcher rd=
				request.getRequestDispatcher("/WEB-INF/view/main.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String train=request.getParameter("train");
		String url=String.format("https://express.heartrails.com/api/json?method=getStations&line=%s", URLEncoder.encode(train,"UTF-8"));
		StationParser parser=new StationParser();
		List<Station> list=parser.getList(url);
		request.setAttribute("train", train);
		request.setAttribute("stationList",list);
		doGet(request, response);
	}
}