
**Java 25 features: (LTS version) in 2025**

1.Instance main method :
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

