<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Products</title>
</head>
<body>

    <h2>All Products</h2>

    <c:choose>
        <c:when test="${empty products}">
            <p>No products available.</p>
        </c:when>

        <c:otherwise>
            <table border="1">
                <tr>
                    <th>Product ID</th>
                    <th>Product Name</th>
                    <th>Product Price</th>
                </tr>
                <!-- Loop through all products -->
                <c:forEach var="product" items="${products}">
                    <tr>
                        <td>${product.productId}</td>
                        <td>${product.productName}</td>
                        <td>${product.productPrice}</td>
                    </tr>
                </c:forEach>

            </table>
        </c:otherwise>
    </c:choose>
    <br>
    <a href="/">Go Home</a>
</body>
</html>