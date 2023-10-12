class Pen(x:String)
{	
	private var color : String = ""

	init{
		color = x
	}

	public fun displayData(){
		println("Pen Color is : $color")
	}

	fun getColor() : String			//create return function add : DataType to the last to identify returned data type 
	{
		return color
	}
}

fun main(){
	var x = Pen("Red")
	x.displayData()
	var col : String = x.getColor() 			//return class will be called as previous
	println("Pen Returned Color is : $col")	
}