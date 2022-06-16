package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Stone;

/**
 * Servlet implementation class GetData
 */
@WebServlet("/GetData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;

   final String[] Stones = {"ガーネット"," アメシスト"," アクアマリン", "ダイヤモンド"," エメラルド", "真珠", "ルビー","ペリドット", "サファイア", "オパール", "トパーズ", "ラピスラズリ" };
   final String[] Words = {"友愛", "誠実", "聡明","純潔無垢", "幸運"," 富", "情熱", "和合", "慈愛", "歓喜", "潔白", "成功" };


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String birthMonthStr = request.getParameter("month");
		if(birthMonthStr != null ) {
			int month = Integer.parseInt(birthMonthStr);
			String stoneName=Stones[month-1];
			String word = Words[month-1];
			String fileName = "";
			for(int i=1; i<=month; i++) {
				if(i == month) {
					fileName = i + ".jpeg";
					break;
				}
			}
			String imgPath = "http://192.168.2.105:8080/BirthMonthStone/images/"+fileName;
			Stone stone = new Stone(imgPath, stoneName,birthMonthStr,word);
			response.setContentType("application/json;charset=utf-8");
			PrintWriter out = response.getWriter();
			Gson gson = new Gson();
			out.print(gson.toJson(stone));

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
