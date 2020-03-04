<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>


<c:url value="/customerSearchResults" var="formAction" />
<form method="GET" action="${formAction}">
			<label for="nameSearch">Name</label>
			<input type="text" name="nameSearch" />
			<label for="categoryName">Choose a Sort Method:</label> 
				<select id="sortOrder" name="sortOrder">
					<option value="last_Name">Last Name</option>
					<option value="email">Email</option>
					<option value="Active">Active</option>
				</select>
				<input type="submit" value="Submit" />
</form>

<table class="table">
<tr>
<th>Customers</th>
</tr>
<tr>
<td>First Name</td> <td>Last Name</td><td>Email</td><td>Active?</td>
</tr>
<c:forEach items="${customers}" var="customer">
<tr>
    <td>${customer.firstName}</td><td>${customer.lastName}</td><td>${customer.email}</td><td>${customer.active}</td>

    
</tr>
</c:forEach>
</table>

<%@include file="common/footer.jspf"%>