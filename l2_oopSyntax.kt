class Pen{					//create class

	private var color : String = ""	//set private attribute color inside the class
 				
	public fun display(){			//method inside the class | default access lable is public
		println("This is a Pen")
	}

	public fun setColor(){
		color = "Red"
	}

	public fun displayColor(){		//method to display the color
		println("Pen Color is : $color")
	}
}

fun main(){	
	var x = Pen()		//object created form class
	x.display()		//display method inside the class
	x.displayColor()	
}