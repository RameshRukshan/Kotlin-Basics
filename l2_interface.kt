interface Product{		//create interface
	
	var price:Float

	fun show()		//method inside
}

class Food:Product{		//can be inherit interfaces with class

	override var price : Float = 10.45f	

	override fun show(){	//shuld override to use interface's method
		println("this is class that overrides interfec")
		println("Price is : $price")
	}
}

fun main(){

	var x = Food()
	x.show()

}