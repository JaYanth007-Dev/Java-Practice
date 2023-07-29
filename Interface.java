interface Computer{
    void code();
}


class Laptop implements Computer {
    public void code() {
        System.out.println("Developing Application");
    }
}
class Desktop implements Computer {
    public void code() {
        System.out.println(" Faster in Developing Application");
    }
}


class Developer  {
    public void devApp(Computer lap) {
        lap.code();
    }
}


// Code in Main

/*
 * Computer lap=new Laptop();
 * Computer desk=new Desktop();
 * Developer obj=new Developer();
 * obj.devApp(desk);
 * 
 * 
 * 
 * 
 * Output : Faster in Developing Applications
 
 * 
 */


