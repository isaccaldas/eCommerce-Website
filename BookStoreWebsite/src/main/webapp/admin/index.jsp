<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Evergreen Bookstore Administration</title>
</head>
<body>
	<jsp:directive.include file="header.jsp" />

	<div align="center">
		<h2>Painel Administrativo</h2>
	</div>

	<div align="center">
		<hr width="60%" />
		<h2>A��es r�pidas:</h2>
		<b> <a href="create_book">Novo Livro</a> &nbsp; <a
			href="create_user">Novo Usu�rio</a> &nbsp; <a href="create_category">Nova Categoria</a> 
			&nbsp; <a href="create_customer">Novo Cliente</a>
		</b>
	</div>

	<div align="center">
		<hr width="60%" />
		<h2>Vendas recentes:</h2>
	</div>

	<div align="center">
		<hr width="60%" />
		<h2>Avalia��es recentes:</h2>
	</div>
	
	<div align="center">
		<hr width="60%" />
		<h2>Estat�sticas:</h2>
		<hr width="60%" />
	</div>

	<jsp:directive.include file="footer.jsp" />
</body>
</html>