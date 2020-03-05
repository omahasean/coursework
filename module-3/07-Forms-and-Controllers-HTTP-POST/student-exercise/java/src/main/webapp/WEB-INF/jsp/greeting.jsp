<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Hello Spring MVC</title>
<c:url var="cssUrl" value="/css/site.css" />
<link rel="stylesheet" href="${cssUrl}" />
</head>
<img src="<c:url value="/etc/forDummies.png" />" />

<div>
	<c:url var="formAction" value="/"/>
	<form  method="POST" action="${formAction}">
	<label for="name">Name:</label> <input type="text" name="name" /><br />
	<label for="title">Title:</label> <input type="text" name="title" /><br />
	<label for="review">Write a review:</label> <input type="text"
		name="review" /><br /> <label for="rating">Select a Rating
		(out of 5):</label> <select id="rating" name="rating">
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
	</select>
	<input type="submit" value="Post">
	</form>

	<c:forEach items="${reviews}" var="review">
		<div>
			<h3>${review.title}</h3>
			<h5>${review.username}</h5>
			<h5> ${review.dateSubmitted.getMonth()} 
			${review.dateSubmitted.getDayOfMonth()}
			${review.dateSubmitted.getYear()}</h5>
			<div class="rating">
				<c:forEach begin="1" end="5" var="count">
					<c:choose>
						<c:when test="${review.rating >= count}">
							<span class="filled">&#9734;</span>
						</c:when>
						<c:otherwise>
							<span>&#9734;</span>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>

			<p>${review.text }</p>
			<hr>
		</div>

	</c:forEach>

</div>

</body>
</html>