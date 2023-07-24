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

        // Calc class
        System.out.println("Calc Class");
        Calc obj = new Calc();
        System.out.println("Sum of two numbers is:"+obj.add(5, 10) );
        Calc.show();
        
        // inhritance Example
        System.out.println("Inheritance Example");
        inheritance objB = new inheritance();
        objB.setNumber(30);
       System.out.println( objB.addition(2, 3));

       // Method overriding
       System.out.println("Method overriding Example");
       MethodOverriding obj2 = new MethodOverriding();
       int res = obj2.adding(10, 20);
       System.out.println(res);
        

    }
}