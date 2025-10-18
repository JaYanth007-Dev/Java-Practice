
## ***Java 25 features: (LTS version) in 2025***

### 1. Instance main method :

	We can write the main method without public static and string [] args.
	It was introduced as a preview feature in the java 24,now it came as a feature in java 25
	
	ex: class Example{
			void main(){
				System.out.println("Hello");
			}
		}

	-Earlier the jvm used to call the main method as Example.main() ,means i will call main method with the Class name because it is a static method.
	-Now in Java 25 the jvm will call main method by creating a object,because it was not a static now so i will call like new Example().main().
	-Compiler is not converting anything internally (like adding extra code to it).But in java 25 the compiler is designed like that only.

### In old jvm and New jvm
	-If i have overloaded main methods in a class it will excecute only the public static void main(Sting [] args ) method only.
	-Java Promises Backward compatability.so 
		ex: if i have two main methods in java 25 
			
			void main();
			public static void main(Sting [] args );
			
			- As it promises it will excecute only the psvm method only due to backward compatability.


				
	If i compile void main() in jdk 21 it will compile but while excecuting it throw error like psvm was not found.

		
	If i remove P S from psvm then
	ex:
		void main(){}
		void main(String [] args){}
		
		-Here 2 main method has a highest priority because of the parameters in it.There will be no error in this case.
		
		
		
	If we have two method with different return types"
	Ex: 
		void main(){}
		int main(String [] args){};
		
	-In the above case before java 25 it will throw compile time error in java 25 no compile time error.
		so it will excecute "void main()" only
			
		
	
	For the below case
	ex: 
		int main(String [] args){};
		
		-The compiler will throw exception that no main method was found.
		
		
### 2. Compact Source Files:
	- We can write the main method without a class and class name
		ex : class Example{
				void main()
			}

			-The Above example we can written as 

			void main() in that file it will work
