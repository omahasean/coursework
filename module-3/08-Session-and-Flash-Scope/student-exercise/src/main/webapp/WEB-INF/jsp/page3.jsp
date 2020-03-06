<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Season" />
</c:import>

<c:url var="formAction" value="/FavoriteThings/PagePost3" />
<form method="POST" action="${formAction}">
	<label>What is your favorite season?</label>
	
	<div class="form">
	<input type="radio" name="favoriteSeason" value="Summer">
	<label for="Summer" >Summer</label><br>
	<input type="radio" name="favoriteSeason" value="Spring">
	<label for="Spring" >Spring</label><br>
	<input type="radio" name="favoriteSeason" value="Fall">
	<label for="Fall" >Fall</label><br>
	<input type="radio" name="favoriteSeason" value="Winter">
	<label for="Winter" >Winter</label><br>
	</div>
	<button type="submit">Next >>></button>
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />