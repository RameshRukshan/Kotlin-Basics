open class Fruit{			//super class shuld be open to inherit so we put open, then only supper class can be ingerit
	fun display(){
		print("This is a Fruit")
	}
}

class Mango : Fruit(){			//to ingerit add : and add super class name with ()
	
}

fun main(){
	var x =Mango()
	x.display()			//Super class' methods also can be used in sub class
}