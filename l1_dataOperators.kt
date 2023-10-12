fun main(){
	var a = 20 
	var b = 4 
	
	//Arithmetic Operators	

	println("a + b = " + (a + b))
	println("a - b = " + (a - b))
	println("a * b = " + (a.times(b)))
	println("a / b = " + (a / b))
	println("a % b = " + (a.rem(b)))

	ptintln("\nWith Arrays")
	var data=arrayOfNulls<Int>(2)
	data[0]=65
	data[1]=743
	println(data[0]!!+data[1]!!)
	println("\n")

	//Relational Operators

	var c = 30
    	var d = 40

    	println("c > d = "+(c>d))
    	println("c < d = "+(c.compareTo(d) < 0))
    	println("c >= d = "+(c>=d))
    	println("c <= d = "+(c.compareTo(d) <= 0))
    	println("c == d = "+(c==d))
    	//println("c != d = "+(!(c?.equals(d) ?: (d === null))))

	//Assignment Operators 

    	a+=b
    	println(a)
    	a-=b
    	println(a)
    	a*=b
    	println(a)
    	a/=b
    	println(a)
    	a%=b
    	println(a)
}