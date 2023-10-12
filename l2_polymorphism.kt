open class Student(n:String, a:Int){				//class shuld be open to ingerit

	protected var name : String = ""
	protected var age : Int = 0

	init{
		name = n
		age = a
	}	

	open fun show(){			//method also shuld because we are overriding the method
		println("I am a Student")
		println("Name is : $name")
		println("Age is : $age")
	}
}

class ScienceStudent(n:String, a:Int, sm:Int) : Student(n,a){
	
	private var scienceMarks : Int = 0

	init{
		scienceMarks = sm
	}
	
	override fun show(){				//to override this method put override
		println("I am a Science Student")
		println("Name is : $name")
		println("Age is : $age")
		println("Science Maks : $scienceMarks")
	}
}

fun main(){
	var x = ScienceStudent("Ramesh",22,30)
	x.show()
}