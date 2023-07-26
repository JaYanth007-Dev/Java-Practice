class MainParent {
    String name;

    public void method1() {
        System.out.println("method 1");
    }

    public String setMethod(String n){
        name=n;
        return name;
     }
}

class Child extends MainParent {
    int age;

    public int setAdd(int n) {
        age = n;
        System.out.println("child method");
        return age;
    }
}

class MultilevelInheritance extends Child {
    public void show() {
        System.out.println("sub Child");
    }
   
}