class Pen(x:String,y:Int,z:Float)
{	
	private var color : String = ""
	private var quantity : Int = 0
	private var price : Float = 0.00F

	init{
		color = x
		quantity = y
		price = z
	}

	public fun displayData(){
		println("Pen Color is : $color")
		println("Pen Quantity is : $quantity")
		println("Pen Price is : $price")
	}

	fun getColor() : String			//create return function add : DataType to the last to identify returned data type 
	{
		return color
	}
}

fun main(){
	var x =Pen("Red",10,100.54F)
	x.displayData()
	x.getColor() 			//return class will be called as previous
}