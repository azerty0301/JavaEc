<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "model.*,java.util.*"%>
    <%
    String searchWord=(String)request.getAttribute("searchWord");
    searchWord=(searchWord == null) ? "": searchWord;
    String mode=(String)request.getAttribute("mode");
    mode=(mode == null) ? "": mode;
    List<Word> list=(List<Word>)request.getAttribute("list");
    Integer total=(Integer)request.getAttribute("total");
    Integer limit=(Integer)request.getAttribute("limit");
    Integer pageNo=(Integer)request.getAttribute("pageNo");
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EJWord</title>
</head>
<body>
<form action = "/ejword/main" method="get">
<input type = "text" name="searchWord" value="<%=searchWord%>">
<select name = "mode">
<option value = "startsWith" <%=mode.equals("startsWith")? " selected":"" %>>で始まる</option>
<option value = "contains" <%=mode.equals("contains")? " selected":"" %>>含む</option>
<option value = "endsWith" <%=mode.equals("endsWith")? " selected":"" %>>で終わる</option>
<option value = "match" <%=mode.equals("match")? " selected":"" %>>一致する</option>
</select>
<button type ="submit">検索</button>
</form>
<% if(list !=null && list.size() > 0){  %>
	<% if(total <= limit){ %>
	<p>全<%=total %>件</p>
	<%}else{ %>
	<p>全<%= total %>件中<%=(pageNo-1)*limit+1%>~<%=pageNo*limit > total? total:pageNo*limit %>件を表示</p>
	<ul>
	<% if(pageNo > 1){ %>
	<li><a href = "/ejword/main?searchWord=<%=searchWord %>&mode=<%=mode %>&page=<%=pageNo-1%>">前へ</a>
	<%{ %>
	<% if(pageNo * limit < total){ %>
	<li><a href = "/ejword/main?searchWord=<%=searchWord %>&mode=<%=mode %>&page=<%=pageNo+1%>">次へ</a>
	<%{ %>
	</ul>
	<%} %>
<table border = "1">
<% for(Word w:list){  %>
<tr><th><%=w.getTitle() %></th><td><%=w.getBody() %></td></tr>
<%} %>
</table>
<%} %>
</body>
</html>