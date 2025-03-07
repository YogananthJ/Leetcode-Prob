SELECT Product.product_name , Sales.year as year , Sales.price as price from Sales
LEFT JOIN Product
ON Sales.product_id = Product.product_id
