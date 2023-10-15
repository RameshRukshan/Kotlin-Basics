fun main(){
	var numOne : Int = 62
	var numTwo : Int = 16

	if(numOne > numTwo){
		println("$numOne > $numTwo")
	}else if(numTwo > numOne){
		println("$numTwo > $numOne")
	}else{
		println("Invalid Input")
	}

	var number : Int = 50

	when(number){
		10->print("O is 10")
		20->print("O is 20")
		30->print("O is 30")
		40->print("O is 40")
		50->print("O is 50")
		60->print("O is 60")
		else->print("Default")
	}
		
}