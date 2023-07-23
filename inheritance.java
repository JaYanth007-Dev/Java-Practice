class A {
    public A() {
        System.out.println("From A constructor");
    }

    public A(int n) {
        System.out.println("From A Integer");
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int multi(int a, int b) {
        return a * b;
    }
}

class inheritance extends A {
    private int numbers = 10;
    public inheritance() {
        super(0);
        System.out.println("from inheritance Constructor");
    }
    
    public void setNumber(int newValue){
        numbers = newValue;
        System.out.println(numbers);
    }
}



