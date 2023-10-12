fun main(){

	var numS : String = "230"
	var numI : Int = numS.toInt()	//by toInt() can convert any to Integer

	var total : Int = 10
	
	total = total + numI

	print("Total is : $total")

	/* data type covertion methods are 
		toByte() 
		toShort() 
		toInt() 
		toLong() 
		toFLoat() 
		toDouble() 
		toChar()
	*/

	print("\nData type is : "+numI::class)		//::class shows the data type of variable

}