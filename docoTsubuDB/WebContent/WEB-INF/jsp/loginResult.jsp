<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "model.*" %>
    <%
    //セッションスコープからユーザ情報を取得
    User loginUser = (User) session.getAttribute("loginUser");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶDB</title>
</head>
<body>
<h1>どこつぶDBログイン</h1>
<% if(loginUser != null) { %>
<p>ログインに成功しました</p>
<p>ようこそ<%= loginUser.getName()  %>さん</p>
<a href="/docoTsubuDB/Main">つぶやき投稿・閲覧へ</a>
<% }else{ %>
<p>ログインに失敗しました</p>
<a href="/docoTsubuDB/">TOPへ</a>
<% }  %>
</body>
</html>