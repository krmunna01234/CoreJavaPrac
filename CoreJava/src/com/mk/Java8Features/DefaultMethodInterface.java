package com.mk.Java8Features;


 interface Interface1 {

	void method1(String str);
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
}

 interface Interface2 {

		void method2();
		
		default void log(String str){
			System.out.println("I2 logging::"+str);
		}

	}
 
 interface Interface3{
	 default void log(String str){
		 System.out.println("I3 logging"+str);
	 }
 }
 
public class DefaultMethodInterface implements Interface1, Interface2, Interface3{
	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		//Interface1.print("abc");
	}
	
	public static void main(String as []){
		Interface2 I = new DefaultMethodInterface();
		Interface2 I1 = new Interface2() {
			
			@Override
			public void method2() {
				System.out.println("I");
				
			}
		};
		I.log("Hello");
		I1.log("Hiiii");
	}
	
	Interface3 I4 = new Interface3() {
	};
	
	//I4.log("Hmmmm");
}
