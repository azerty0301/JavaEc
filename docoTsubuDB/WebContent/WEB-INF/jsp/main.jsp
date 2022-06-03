<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.List"%>
    <%
    //セッションスコープに保存されたユーザ情報を取得
    User loginUser = (User) session.getAttribute("loginUser");
    //アプリケーションスコープに保存されたつぶやきリストを取得
    List<Mutter> mutterList =
    (List<Mutter>) request.getAttribute("mutterList");
    //リクエストスコープに保存されたエラーメッセージを取得
    String errorMsg = (String) request.getAttribute("errorMsg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶDB</title>
</head>
<body>
<h1>どこつぶDBメイン</h1>
<p>
<%= loginUser.getName()  %>さん、ログイン中
<a href = "/docoTsubuDB/Logout">ログアウト</a>
</p>
<p><a href="/docoTsubuDB/Main">更新</a></p>
<form action="/docoTsubuDB/Main" method="post">
<input type ="text" name="text">
<input type="submit" value="つぶやく">
</form>
<% if(errorMsg != null) { %>
<p><%= errorMsg  %></p>
<% }  %>
<% for(Mutter mutter : mutterList)  { %>
<p><%= mutter.getUserName()  %> : <%= mutter.getText()  %><p>
<% } %>
</body>
</html>