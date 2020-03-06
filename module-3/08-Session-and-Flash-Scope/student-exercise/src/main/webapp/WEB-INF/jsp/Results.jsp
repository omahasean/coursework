<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Color" />
</c:import>

<h5>Your Favorite Color Is: ${favoriteColor}</h5>
<h5>Your Favorite Food Is: ${favoriteFood}</h5>
<h5>Your Favorite Season Is: ${favoriteSeason}</h5>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />

