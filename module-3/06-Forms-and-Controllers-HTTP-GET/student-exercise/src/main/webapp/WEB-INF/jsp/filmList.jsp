<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>

<c:url value="/filmSearchResults" var="formAction" />
<form method="GET" action="${formAction}">
			<label for="minRunTime">Minimum Run Time </label>
			<input type="text" name="minRunTime" />
			<label for="minRunTime">Maximum Run Time </label>
			<input type="text" name="maxRunTime" />
			<label for="categoryName">Choose a Genre:</label> 
				<select id="categoryName" name="categoryName">
					<option value="Action">Action</option>
					<option value="Animation">Animation</option>
					<option value="Children">Children</option>
					<option value="Classics">Classics</option>
					<option value="Comedy">Comedy</option>
					<option value="Documentary">Documentary</option>
					<option value="Drama">Drama</option>
					<option value="Family">Family</option>
					<option value="Foreign">Foreign</option>
					<option value="Games">Games</option>
					<option value="Horror">Horror</option>
					<option value="Music">Music</option>
					<option value="New">New</option>
					<option value="Sci-Fi">Sci-Fi</option>
					<option value="Sports">Sports</option>
					<option value="Travel">Travel</option>
				</select> 
	<input type="submit" value="Submit" />
</form>

<table class="table">
<tr>
<th>Films</th>
</tr>
<tr>
<td>Title</td> <td>Description</td><td>Year Released</td><td>Length</td><td>Rating</td>
</tr>
<c:forEach items="${films}" var="film">
<tr>
    <td>${film.title}</td> <td>${film.description}</td><td>${film.releaseYear}</td><td>${film.length}</td><td>${film.rating}</td>
</tr>
</c:forEach>
</table>

<%@include file="common/footer.jspf"%>