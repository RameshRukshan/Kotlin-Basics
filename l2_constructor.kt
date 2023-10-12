class Pen(x:String,y:Int,z:Float)		//constructor is defined in class header | along with the passing value data type shuld be there
{	
	private var color : String = ""
	private var quantity : Int = 0
	private var price : Float = 0.00F

	init{			//init is assigned avlues that passes fro the constructor to variables that are inside the class	
		color = x
		quantity = y
		price = z
	}

	public fun displayData(){
		println("Pen Color is : $color")
		println("Pen Quantity is : $quantity")
		println("Pen Price is : $price")
	}
}

fun main(){
	var x =Pen("Red",10,100.54F);		//when creating the class constructor and init pat will run automatically
	x.displayData();
}