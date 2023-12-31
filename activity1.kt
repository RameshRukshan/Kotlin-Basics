/*---------------------------------------------------------------
A firm started its operations selling imported products islandwide.
The application consists of the following classes. Each class has attributes, and you are requested to use suitable methods | constructors as required to perform relevant operations in addition to mentioned below. Class ImportedProduct inherits class Product while class Customer associates with class ImportedProduct when customer purchases imported products. 
 - Write an object-oriented application to perform the following operations.
	+ Set data for customer id and quantity bought from each product using constructor when a customer is created.
	+ Set data for product names, unit prices, and tax rates of two imported products using constructor when each imported product is created.
	+ Calculate the bill amount of the customer assuming one customer purchases two imported products. 
	+ tax amount of the product=unit price * tax rate of the product
	+ Output customer id, product names purchased, and final bill amount (with tax). 
---------------------------------------------------------------*/

class Customer(cusId:String, bp1:Int, tax:Float, price:Float, name:String) : Product(tax, price, name){

	var customer_id : String = ""
	var quantity_bought_from_product : Int = 0

	var total : Float = 0.00f

	init{
		customer_id = cusId
		quantity_bought_from_product = bp1
	}

	fun calculateBill(){
		total = (unit_price + (unit_price * tax_rate)) * quantity_bought_from_product
	}

	fun showBill(){
		println("\n\n--------------------------------------------")
		println("|                  B I L L                 |")
		println("--------------------------------------------")
		println("Customer ID : $customer_id")
		println("Product Name : $product_name")
		println("Unit Price for $product_name : $unit_price")
		println("Quantity bougt from $product_name : $quantity_bought_from_product")
		println("Tax rate for $product_name : $tax_rate")
		println("\n--------------------------------------------")
		println("Final Bill Amount is : $total")
		println("--------------------------------------------\n\n")
	}
}

open class Product(tax:Float, price:Float, name:String) : ImportedProduct(tax){
	var product_name : String = ""
	var unit_price : Float = 0.00f

	init{
		product_name = name
		unit_price = price
	}
}

open class ImportedProduct(tax:Float){
	var tax_rate : Float = 0.00f

	init{
		tax_rate = tax
	}
} 

fun main(){

	print("Enter Customer ID : ")
	var cID : String = readLine().toString()
	print("Enter Product Name : ")
	var pName : String = readLine().toString()
	print("Enter $pName unit price : ")
	var price = readLine()?.toFloat() ?: 0.0f
	print("Enter Quantity bought : ")
	var qt = readLine()?.toInt() ?: 0
	print("Enter Tax rate : ")
	var tax = readLine()?.toFloat() ?: 0.0f

	var cus = Customer(cID, qt, tax, price, pName)
	cus.calculateBill()
	cus.showBill()
}