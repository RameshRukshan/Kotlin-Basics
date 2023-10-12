fun main() {
	print("Enter text: ")
	var input = readLine()		//readLine() method is use to read line
	print("You entered: $input")

	//another two methods to read inpots

	var fName : String
	println("\nEnter your First Name : ")
	fName = readLine()?:""
	print ("Name that you enterd is : $fName")

	var lName : String
	println("\nEnter your Last Name : ")
	lName = readLine()!!
	print ("Name that you enterd is : $lName")
}
