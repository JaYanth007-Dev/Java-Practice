class Calc {
    public int add(int a,int b) {
        return a+b;
    }
    static void show(){
        System.out.println("From show method");
    }
    public Calc(){
        System.out.println("from Constructor ");
    }
}

class A {
    public A() {
        System.out.println("From A constructor");
    }

    public A(int n) {
        System.out.println("From A Integer");
    }
}

class B extends A {
    private int numbers = 10;
    public B() {
        super(0);
        System.out.println("from B Constructor");
    }

    public void setNumber(int newValue){
        numbers = newValue;
        System.out.println(numbers);
    }
}

class Main {
    public static void main(String args[]) {
        int nums[][] = new int[3][4];
        for (int i = 0; i < nums.length;i++) {
            for (int j = 0; j < nums[i].length;j++) {
                nums[i][j]= (int)(Math.random()*10);
                
            }
        }
        for (int num[] : nums) {
            for (int m : num) {
                System.out.print(m + "  ");
            }
            System.out.println("");
        }


        Calc obj = new Calc();
        System.out.println("Sum of two numbers is:"+obj.add(5, 10) );
        Calc.show();
        
        B objB = new B();
        objB.setNumber(30);


    }
}