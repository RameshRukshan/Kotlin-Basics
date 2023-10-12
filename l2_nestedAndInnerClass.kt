class Computer{
	class Motherboard{ 		//nested class
		fun show(){
			println("working")
		}
	}
}

class House{
	inner class Room{		//inner keyword is add in inner class
		fun show(){
			println("Room is empty")
		}
	}
}

fun main(){
	var a = Computer.Motherboard()
	a.show()		//to run above method boath class shuld be mention

	var home = House()		//to run inner class method boath class shuld call seperately
	var myRoom = home.Room()
	myRoom.show()
}
