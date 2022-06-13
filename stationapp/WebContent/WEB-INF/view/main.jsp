<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*,model.*"%>
    <%
    List<String> train=(List<String>)request.getAttribute("trainList");
    List<Station> stationList =(List<Station>)request.getAttribute("stationList");
    String selectedTrain = (String)request.getAttribute("train");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>駅検索</title>
</head>
<body>
<p>路線を選んでください</p>
<form action="/stationapp/Main" method="post">
<select name="train">
<% for(String s:train){ %>
<option value="<%=s %>"<%=s.equals(selectedTrain)?"selected":"" %>><%=s %></option>
<%} %>
</select>
<input type = "submit" value="送信">
</form>
<%if(stationList != null){ %>
<ol>
<%for(Station station : stationList){ %>
<li><%=station.getName() %>(<%=station.getPrefecture()%>)</li>
<%} %>
</ol>
<%} %>
</body>
</html>