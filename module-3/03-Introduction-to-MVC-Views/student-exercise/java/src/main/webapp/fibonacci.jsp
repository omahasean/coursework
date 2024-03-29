<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Fibonacci"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="numberOfItems" value="20" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li><a href="<c:out value="${ fibonacciRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="50" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li><a href="<c:out value="${ fibonacciRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="100" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li><a href="<c:out value="${ fibonacciRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>
	</ul>
</nav>

<ul id="fibonacci">

	<c:set var="A" value="1" />
	<c:set var="B" value="1" />
	<c:set var="C" value="1" />

	<c:forEach begin="0" end="${ param.max }">
		<c:choose>
			<c:when test="${C <= param.max }">
	
				<li>${C}</li>
				
				<c:set var="A" value="${B}" />
				<c:set var="B" value="${C}" />
				<c:set var="C" value="${A + B}" />

			</c:when>
		</c:choose>
	</c:forEach>
</ul>


<c:import url="common/footer.jsp"></c:import>