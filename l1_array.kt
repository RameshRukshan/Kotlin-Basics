fun main(){
	//creating array
	var nums = arrayOf(10,5,3,249,634,44,30)
	var names = arrayOf("R","RAR","avhvsd")

	//display the full array
	print("\n"+names.contentToString())		//content.ToString method allows print full array by converting to strings
	print("\n"+nums.contentToString())

	//display one index of one array
	print("\n"+names[1])
	print("\n"+nums[4])

	var data = arrayOfNulls<Int>(3)		//creating null array
	data[0] = 378				//add values to null array
	data[1] = 3
	data[2] = 84

	print("\n"+data.contentToString())
}