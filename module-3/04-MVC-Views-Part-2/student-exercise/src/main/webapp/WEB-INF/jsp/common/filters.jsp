<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Container for Filter Choices
        Each link should take the user to this current page and use any combination of the following
        querystring parameters to filter the page:
        - maxPrice (number)
        - minPrice (number)
        - minRating (number)
        - category (string) - Home, Apparel, Jewelry, Garden

        NOTE: A parameter is passed to this view that is called `baseRoute`. `baseRoute`
        refers to the page that the filters should be associated with. For instance, if you are on the products
        page, the value of the `baseRoute` should be the route for products and on the tiles page, should be the
        route for tiles.
        -->
<div id="filter-options">
	<h3>Refine By</h3>
	<c:url var="PriceUnder25" value="${param.baseRoute}">
		<c:param name="maxPrice">25</c:param>
	</c:url>
	<c:url var="PriceBetween25and50" value="${param.baseRoute}">
		<c:param name="minPrice">25</c:param>
		<c:param name="maxPrice">50</c:param>
	</c:url>
	<c:url var="PriceOver50" value="${param.baseRoute}">
		<c:param name="minPrice">50</c:param>
	</c:url>
	<ul>
		<li><a href="${PriceUnder25}">Under $25</a></li>
		<li><a href="${PriceBetween25and50}">$25 to $50</a></li>
		<li><a href="${PriceOver50}">$50 &amp; Above</a></li>
	</ul>
	<p>Avg. Review</p>
	<c:url var="RatingOver4" value="${param.baseRoute}">
		<c:param name="minRating">4</c:param>
	</c:url>
	<c:url var="RatingOver3" value="${param.baseRoute}">
		<c:param name="minRating">3</c:param>
	</c:url>
	<c:url var="RatingOver2" value="${param.baseRoute}">
		<c:param name="minRating">2</c:param>
	</c:url>
	<c:url var="RatingOver1" value="${param.baseRoute}">
		<c:param name="minRating">1</c:param>
	</c:url>
	<ul>
		<li>
			<a class="rating" href="${RatingOver4}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${RatingOver3}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${RatingOver2}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${RatingOver1}">
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
	</ul>
	<p>Category</p>
	<ul>
		<li><a href="#">Home</a></li>
		<li><a href="#">Apparel</a></li>
		<li><a href="#">Jewelry</a></li>
		<li><a href="#">Garden</a></li>
	</ul>
</div>
