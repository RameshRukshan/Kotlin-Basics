class Pen{					//create class

	private var color : String = ""	//set private attribute color inside the class
	private var quantity : Int = 0
	private var price : Float = 0.00F
 				
	public fun display(){			//method inside the class | default access lable is public
		println("This is a Pen")
	}

	public fun setData(){
		color = "Red"
		quantity = 10
		price = 100.50F
	}

	public fun displayData(){		//method to display the color
		println("Pen Color is : $color")
		println("Pen Quantity is : $quantity")
		println("Pen Price is : $price")
	}
}

fun main(){	
	var x = Pen()		//object created form class
	x.setData()
	x.display()		//display method inside the class
	x.displayData()	
}