<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
</head>
<body>

    <h2>Product Details</h2>

    <table border="1">
        <tr>
            <th>Product Id</th>
            <th>Product Name</th>
            <th>Product Price</th>
        </tr>
        <tr>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.productPrice}</td>
        </tr>
    </table>

    <br>
    <a href="/">Go Home</a>

</body>
</html>