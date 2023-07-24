class Parent {
    public int adding(int a,int b) {
        System.out.println("Overiding-From Parent");
        return (a+b);
    }
}

class MethodOverriding extends Parent{
        public int adding(int a,int b) {
            System.out.println(" Overriding-From Child class");
            return (a+b)+1;
        }
        
    
}