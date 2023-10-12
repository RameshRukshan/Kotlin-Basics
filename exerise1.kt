/*------------------------------------------------------------------
Write a kotlin application to input each month number of gas cylinders sold into an array for last year. Then output below requested.

Maximum number of gas cylinders sold.
Minimum number of gas cylinders sold.
Average numbers of gas cylinders sold.
Number of months which exceeded average numbers of gas cylinders sold.
Number of months which has not exceeded average numbers of gas cylinders sold.
------------------------------------------------------------------*/

fun main(){
	
	var months = arrayOf("January","February","March","April","May","Jun","July","August","September","October","November","Devember")
	var gasCylinders = arrayOfNulls<Int>(12)

	for(i in 0..11){
		print("Enter gas sold count for "+months[i]!!+" : ")
		gasCylinders[i] = readLine()!!.toInt()
	}

	println("\nFull Gas Cylinder count is : "+gasCylinders.contentToString())

	var max : Int = gasCylinders[0]!!.toInt()
	var min : Int = gasCylinders[0]!!.toInt()
	var total : Int = 0
	var average : Int = 0

	for (ii in 0..11){
		if (max < gasCylinders[ii]!!){
			max = gasCylinders[ii]!!.toInt()
		}

		if(min > gasCylinders[ii]!!){
			min = gasCylinders[ii]!!.toInt()
		}
		
		total = total + gasCylinders[ii]!!.toInt()
	}

	average = total/12;

	println("\nMaximum number of gas cylinders sold : $max")
	println("Minimum number of gas cylinders sold : $min")
	println("\nTotal : $total")
	println("Average numbers of gas cylinders sold : $average")
	

	var countMonthsExceded : Int = 0
	var countMonthsNotExceded: Int = 0
	
	for(x in 0..11){
		if(average < gasCylinders[x]!!){
			countMonthsExceded++
		}else{
			countMonthsNotExceded++
		}
	}

	println("\nNumber of months which exceeded average numbers of gas cylinders sold : $countMonthsExceded")
	println("Number of months which has not exceeded average numbers of gas cylinders sold : $countMonthsNotExceded")
	
}