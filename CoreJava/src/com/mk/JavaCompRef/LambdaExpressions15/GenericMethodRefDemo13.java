package com.mk.JavaCompRef.LambdaExpressions15;

//listing 13
//Demonstrate a method reference to a generic method 
//declared inside a non-generic class. 

//A functional interface that operates on an array 
//and a value, and returns an int result. 
interface MyFunction<T> {
	int func(T[] vals, T v);
}

// This class defines a method called countMatching() that
// returns the number of items in an array that are equal
// to a specified value. Notice that countMatching()
// is generic, but MyArrayOps is not.
class MyArrayOps {
	static <T> int countMatching(T[] vals, T v) {
		int count = 0;

		for (int i = 0; i < vals.length; i++)
			if (vals[i] == v)
				count++;

		return count;
	}
}

class GenericMethodRefDemo13 {

	// This method has the MyFunction functional interface as the
	// type of its first parameter. The other two parameters
	// receive an array and a value, both of type T.
	static <T> int myOp(MyFunction<T> f, T[] vals, T v) {
		return f.func(vals, v);
	}

	public static void main(String args[]) {
		Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
		String[] strs = { "One", "Two", "Three", "Two" };
		int count;

		count = myOp(MyArrayOps::<Integer> countMatching, vals, 4);
		System.out.println("vals contains " + count + " 4s");

		count = myOp(MyArrayOps::<String> countMatching, strs, "Two");
		System.out.println("strs contains " + count + " Twos");
	}
}
