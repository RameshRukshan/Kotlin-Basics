fun main(){
	var count : Int = 1

	while(count <= 10){
		println("Hi this is round $count")
		count++
	}


	for(x in 1..6){
		println("oh hoooo this is $x")
	}

	for(i in 1..10 step 2){ 		//increment will be 2
		println("oh hoooo this is $i")
	}	

	for(z in 1..15){
		println("blah blah this is breake round $z")
		if(z==4){
			break;		//this is breake statement
		}
	}
}