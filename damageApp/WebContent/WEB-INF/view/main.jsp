<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
    <%
    Damage damage = (Damage)request.getAttribute("damage");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>与ダメージ調べ</title>
</head>
<body>
<form action = "/damageApp/Main" method = "post">
op(攻撃力):<input type = "text" name="op" value="<%=damage == null ? "": damage.getOp() %>" ><br>
 tp(使用する技の倍率(%)):<input type = "text" name="tp"value="<%=damage == null ? "": damage.getTp() %>" ><br>
dp(敵の防御力):<input type = "text" name = "dp"value="<%=damage == null ? "": damage.getDp() %>" ><br>
<button type = "submit">Send</button>
</form>
<%if(damage != null){ %>
<p>
攻撃力：<%=damage.getOp() %><br>
使用する技の倍率(%)：<%=damage.getTp() %><br>
敵の防御力：<%=damage.getDp() %><br>
のときの与ダメージは<%= damage.getDamage() %>です
</p>
<img src = "<%=damage.getImgPath() %>">
<%} %>
</body>
</html>