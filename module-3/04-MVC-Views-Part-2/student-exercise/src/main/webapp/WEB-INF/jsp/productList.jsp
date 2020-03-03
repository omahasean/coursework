<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product List View" />
</c:import>

<div id="card-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="/products" />
	</c:import>

	<div class="main-content">
		<div id="sorting-options">
			<h3>Sort By</h3>
			<c:url var="LowToHighPrice" value="/products">
				<c:param name="sortOrder">PriceLowToHigh</c:param>
			</c:url>

			<c:url var="HighToLowPrice" value="/products">
				<c:param name="sortOrder">PriceHighToLow</c:param>
			</c:url>

			<c:url var="HighToLowRating" value="/products">
				<c:param name="sortOrder">RatingHighToLow</c:param>
			</c:url>
			<ul>
				<li><a href="${LowToHighPrice}">Price - Low to High</a></li>
				<li><a href="${HighToLowPrice}">Price - High to Low</a></li>
				<li><a href="${HighToLowRating}">Rating - High to Low</a></li>
			</ul>
		</div>
		<div id="grid">

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
						<div class="tile ">
							<span class="banner top-seller">Top Seller!</span>
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
									<span class="product-alert">Only
										${product.remainingStock } left!</span>
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
								<c:if
									test="${product.remainingStock > 0 && product.remainingStock <= 5 }">
									<span class="product-alert">Only
										${product.remainingStock } left!</span>
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
</div>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />