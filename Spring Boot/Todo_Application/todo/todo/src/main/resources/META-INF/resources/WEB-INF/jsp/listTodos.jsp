<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
	<head>
		<link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"></link>
		<title>List Todos Page</title>
	</head>
	<body>
	<div class = "container">
			<h2>Welcome to in28minutes</h2>
			<hr>
			<table class = "table">
				<thead>
					<tr>
						<th>Id</th>
						<th>user-name</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Done</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var = "row">
						<tr>
							<td>${row.id}</td>
							<td>${row.username}</td>
							<td>${row.description}</td>
							<td>${row.targetDate}</td>
							<td>${row.done}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-todo" class = "btn btn-success">Add Todo</a>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>