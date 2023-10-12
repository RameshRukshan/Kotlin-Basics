class Employee{
	private var sal: Float = 50000.0f
	
	//static method create
	
	companion object{				//kind of a block and this is how define static method
		public fun show(){
			println("I am Static")
		}
	}
}

fun main(){
	Employee.show()
}