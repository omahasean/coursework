<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="/products/tiles" />
	</c:import>


	<div id="grid" class="main-content">
		<c:forEach var="product" items="${products }">
			<c:choose>
				<c:when test="${product.remainingStock == 0 }">

					<div class="tile sold-out">

						<span class="banner">Sold Out</span>

						<c:url var="productDetailsPageHref" value="/products/detail">
							<c:param name="id">${product.id }</c:param>
						</c:url>
						<a class="product-image" href="${productDetailsPageHref }"> <img
							src="<c:url value="/images/product-images/${product.imageName }" />" />
						</a>

						<div class="details">
							<p class="name">${product.name}</p>


							<div class="rating">

								<c:forEach begin="1" end="5" var="count">
									<c:choose>
										<c:when test="${product.averageRating >= count}">
											<span class="filled">&#9734;</span>
										</c:when>
										<c:otherwise>
											<span>&#9734;</span>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</div>

							<p class="price">
								<fmt:formatNumber type="currency" currencySymbol="$"
									maxFractionDigits="2" value="${product.price }" />
							</p>
						</div>
					</div>
				</c:when>
				<c:when test="${product.topSeller == true}">
					<div class="tile top-seller ">
						<c:url var="productDetailsPageHref" value="/products/detail">
							<c:param name="id">${product.id }</c:param>
						</c:url>
						<a class="product-image" href="${productDetailsPageHref }"> <img
							src="<c:url value="/images/product-images/${product.imageName }" />" />
						</a>

						<div class="details">
							<p class="name">${product.name}</p>


							<div class="rating">
								<c:forEach begin="1" end="5" var="count">
									<c:choose>
										<c:when test="${product.averageRating >= count}">
											<span class="filled">&#9734;</span>
										</c:when>
										<c:otherwise>
											<span>&#9734;</span>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</div>


							<c:if
								test="${product.remainingStock > 0 && product.remainingStock <= 5 }">
								<span class="product-alert">Only ${product.remainingStock }
									left!</span>
							</c:if>
							<p class="price">
								<fmt:formatNumber type="currency" currencySymbol="$"
									maxFractionDigits="2" value="${product.price }" />
							</p>
						</div>
					</div>
				</c:when>
				<c:otherwise>
					<div class="tile ">

						<c:url var="productDetailsPageHref" value="/products/detail">
							<c:param name="id">${product.id }</c:param>
						</c:url>
						<a class="product-image" href="${productDetailsPageHref }"> <img
							src="<c:url value="/images/product-images/${product.imageName }" />" />
						</a>

						<div class="details">
							<p class="name">${product.name}</p>
							<div class="rating">
								<c:forEach begin="1" end="5" var="count">
									<c:choose>
										<c:when test="${product.averageRating >= count}">
											<span class="filled">&#9734;</span>
										</c:when>
										<c:otherwise>
											<span>&#9734;</span>
										</c:otherwise>
									</c:choose>
								</c:forEach>

							</div>
							<c:if test="${product.topSeller} == true">
								<div class="tile top-seller">Top Seller</div>
							</c:if>
							<c:if
								test="${product.remainingStock > 0 && product.remainingStock <= 5 }">
								<div class="product-alert">${product.remainingStock }
									Remaining!</div>
							</c:if>

							<p class="price">
								<fmt:formatNumber type="currency" currencySymbol="$"
									maxFractionDigits="2" value="${product.price }" />
							</p>
						</div>
					</div>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />