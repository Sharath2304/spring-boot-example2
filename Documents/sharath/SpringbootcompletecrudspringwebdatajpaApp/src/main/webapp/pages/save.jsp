<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Save Product</title>
</head>
<body>

    <h2>Save Product</h2>

    <form action="product" method="POST">
        ProductId: 
        <input type="text" name="productId"/><br><br>

        ProductName: 
        <input type="text" name="productName"/><br><br>

        ProductPrice: 
        <input type="text" name="productPrice"/><br><br>

        <input type="submit" value="Save"/>
    </form>

</body>
</html>