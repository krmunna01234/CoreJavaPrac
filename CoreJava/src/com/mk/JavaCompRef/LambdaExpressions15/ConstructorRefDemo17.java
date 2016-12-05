package com.mk.JavaCompRef.LambdaExpressions15;

//listing 17
//Implement a simple class factory using a constructor reference. 

interface MyFunc3<R, T> {
	R func(T n);
}

// A simple generic class.
class MyClass3<T> {
	private T val;

	// A constructor that takes an argument.
	MyClass3(T v) {
		val = v;
	}

	// The default constructor. This constructor
	// is NOT used by this program.
	MyClass3() {
		val = null;
	}
	// ...

	T getVal() {
		return val;
	};
}

// A simple, non-generic class.
class MyClass32 {
	String str;

	// A constructor that takes an argument.
	MyClass32(String s) {
		str = s;
	}

	// The default constructor. This
	// constructor is NOT used by this program.
	MyClass32() {
		str = "";
	}

	// ...

	String getVal() {
		return str;
	};
}

class ConstructorRefDemo3 {

	// A factory method for class objects. The class must
	// have a constructor that takes one parameter of type T.
	// R specifies the type of object being created.
	static <R, T> R MyClass3Factory(MyFunc3<R, T> cons, T v) {
		return cons.func(v);
	}

	public static void main(String args[]) {
		// Create a reference to a MyClass3 constructor.
		// In this case, new refers to the constructor that
		// takes an argument.
		MyFunc3<MyClass3<Double>, Double> MyClass3Cons = MyClass3<Double>::new;

		// Create an instance of MyClass3 by use of the factory method.
		MyClass3<Double> mc = MyClass3Factory(MyClass3Cons, 100.1);

		// Use the instance of MyClass3 just created.
		System.out.println("val in mc is " + mc.getVal());

		// Now, create a different class by use of MyClass3Factory().
		MyFunc3<MyClass32, String> MyClass3Cons2 = MyClass32::new;

		// Create an instance of MyClass32 by use of the factory method.
		MyClass32 mc2 = MyClass3Factory(MyClass3Cons2, "Lambda");

		// Use the instance of MyClass3 just created.
		System.out.println("str in mc2 is " + mc2.getVal());
	}
}
